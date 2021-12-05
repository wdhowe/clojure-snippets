;; Protocol and Functions for creating queues.
;; Supports creating an immutable queue, `queue` or atom based queue, `aqueue.

(defprotocol persistent-queue
  "Persistent queue protocol."
  (-enqueue [q items] "Add an item or items to the rear of the queue.")
  (dequeue [q] "Removes an item from the front of the queue.")
  (front [q] "Get the front item from the queue.")
  (rear [q] "Get the item from the rear of the queue."))

(extend-protocol persistent-queue
  clojure.lang.PersistentList$EmptyList
  (-enqueue [q items]
    (concat q items))

  (dequeue [q] (list))

  (front [q])

  (rear [q])

  clojure.lang.PersistentList
  (-enqueue [q items]
    (concat q items))

  (dequeue [q]
    (rest q))

  (front [q]
    (first q))

  (rear [q]
    (last q))

  clojure.lang.Atom
  (-enqueue [q items]
    (swap! q #(concat % items)))

  (dequeue [q]
    (swap! q #(rest %)))

  (front [q]
    (first @q))

  (rear [q]
    (last @q)))

(defn enqueue
  "Add an item or items to the rear of the queue.
   This fn works around protocols not accepting '& rest' parameters."
  [q & items] (-enqueue q items))

(defn queue
  "Returns a new immutable queue with optional `items` to populate the queue."
  ([]
   (list))
  ([& items]
   (reverse (apply conj (list) items))))

(defn aqueue
  "Returns a new atom/mutable queue with optional `items` to populate the queue."
  ([]
   (atom (list)))
  ([& items]
   (atom (reverse (apply conj (list) items)))))
