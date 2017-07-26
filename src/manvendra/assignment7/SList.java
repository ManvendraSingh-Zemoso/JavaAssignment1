package manvendra.assignment7;

/**
 * Created by zemoso on 24/7/17.
 * This class is a generic, singly linked list class, which, keep things simple and in one direction.
 * @author Manvendra
 */
public class SList<T> {
    /**
     * This class is the Node class which have four methods.
     * @param <T> type variable
     */
    public static class Node<T> {
        public T data = null;
        public Node<T> next = null;
        /**
         * Default constructor
         */
        private Node() {}
        /**
         * Used to initialize the value of Node
         * @param value integer
         */
        private Node(T value) {
            data = value;
        }
        /**
         * Used to check whether next node exists.
         * @return true or false
         */
        private boolean hasNext() {
            return (next != null);
        }
        /**
         * used to get head of next node
         * @return head of next node
         */
        public Node<T> getNext() {
            return next;
        }
        /**
         * Used to jump to next node
         * @param node head of a node
         */
        public void setNext(Node<T> node) {
            next = node;
        }
        /**
         * Used to get data inside a node.
         * @return data integer type
         */
        public T getData() {
            return data;
        }
    }
    /**
     * This is the interface like ListIterator.
     * @param <T> type variable
     */
    public interface SListIterator<T> {
        /**
         * Used to check whether next node exists.
         * @return true or false
         */
        boolean hasNext();
        /**
         * Used to iterate to next node/element.
         * @return head of next node.
         */
        T next();
        /**
         * Used add a new node to myList
         * @param element T type variable
         */
        void add(T element);
        /**
         * Used to remove node from myList
         */
        void remove();
    }
    private Node<T> head = new Node<>();
    /**
     * This method is used to print mylist.
     * @return string
     */
    public String toString() {
        SListIterator<T> siterator = iterator();
        StringBuilder result = new StringBuilder("{");
        while (siterator.hasNext()) {
            result.append(siterator.next().toString());
            if (siterator.hasNext()) {
                result.append(",");
            }
        }
        result.append("}");
        return result.toString();
    }
    /**
     *This method is used to iterate through mylist.
     * @return object of SListIterator
     */
    private SListIterator<T> iterator() {
        return new SListIterator<T>() {
            private Node<T> present = head;
            private Node<T> previous = null;

            /**
             * This method is used to check whether next node exists.
             * @return true or false
             */
            public boolean hasNext() {
                return present.hasNext();
            }

            /**
             * Used to go to the next node.
             * @return header of the next node.
             */
            public T next() {
                if (!hasNext()) {
                    throw new RuntimeException("Doesn't have next element!");
                }
                previous = present;
                present = present.getNext();
                return present.getData();
            }

            /**
             * Used to add nodes to the mylist.
             * @param element node of myList
             */
            public void add(T element) {
                Node<T> nextNode = present.getNext();
                Node<T> newNode = new Node<>(element);
                present.setNext(newNode);
                newNode.setNext(nextNode);
                previous = present;
                present = newNode;
            }

            /**
             * Used to remove node from mylist.
             */
            public void remove() {
                if (present == head) {
                    throw new RuntimeException("present is at the head");
                }
                if (present == previous) {
                    throw new RuntimeException("Can't call");
                }
                previous.setNext(present.getNext());
                present.setNext(null);
                present = previous;
            }
        };
    }
    /**
     * Function to find the size of mylist.
     * @return integer size of mylist
     */
    private int size() {
        SListIterator<T> siterator = iterator();
        int size = 0;
        while (siterator.hasNext()) {
            siterator.next();
            size++;
        }
        return size;
    }
    /**
     * Main method used to add, or delete any node in mylist.
     * @param args used to take command line arguments.
     */
    public static void main(String[] args) {
        SList<String> myList = new SList<>();
        SListIterator<String> strIterator = myList.iterator();
        System.out.println("myList = " + myList);
        System.out.println("Adding elements/nodes to myList :");
        for (int i = 0; i < 10; i++) {
            strIterator.add(String.valueOf(i));
        }
        System.out.println(myList);
        int size = myList.size();
        System.out.println("Size of my List = " + size);
        System.out.println("Removing 5 elements/nodes from  myList : ");
        strIterator = myList.iterator();
        for (int i = 0; i < 5; i++) {
            strIterator.next();
            strIterator.remove();
        }
        System.out.println(myList);
    }
}
