public class MyLinkedList {

    private class Node {

        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

    }

    private Node first;
    private Node last;

    public void addToFront(int item) {
        var node = new Node(item);

        if(isEmpty()) {
            first = last = node;
        }
        else {
            node.next = first;
            first = node;
        }

    }

    public void addToEnd(int item) {
        var node = new Node(item);

        if(isEmpty()) {
            first = last = node;
        }
        else {
            last.next = node;
            last = node;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            first = last = null;
            return;
        }
        var second = first.next;
        first.next = null;
        first = second;
    }

    public void removeLast() {
        if(isEmpty()) {
            first = last = null;
        }
        var previous = getPrevious(last);
        last = previous;
        last.next = null;
    }

    public void removeAtIndex(int index) {
        if(isEmpty()) {
            return;
        }

        if(index == 0){
            first = first.next;
        } else {
            Node previous = nodeAt(index - 1);
            Node current = previous.next;
            previous.next = current.next;
            current.next = null;
            //current.next = current.next.next;
        }
    }

    public Node getPrevious(Node node) {
        var current = first;
        while (current.next != null) {
            if (current.next == node) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    private Node nodeAt(int index) {
        var current = first;

        for (int count = 0; count < index; count++) {
            current = current.next; // traverse through list setting the next item to current
        }

//        int count = 0;
//        while(current.next != null) {
//            if(count == index)
//                return current;
//            count++;
//            current = current.next;
//        }
        return current;
    }

    public int indexOf(int item) {
        int index = 0;
        var current = first;
        while(current != null) {
            if(current.value == item) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    private boolean isEmpty() {
        return first == null;
    }

    public int size() {
        int count = 0; // create a number for counting the nodes
        Node current = first; // set first node to current node
        while(current != null) { // traverse while there is a current node
            current = current.next; // set the next node to the current node
            count++; // add 1 to the count
        }
        return count; // return the total number of nodes
    }

    @Override
    public String toString() {
        String res;
        if (first == null) {
            res = "[]";
        } else {
            String result = "[" + first.value;
            Node current = first.next;
            while (current != null) {
                result += ", " + current.value;
                current = current.next;
            }
            result += "]";
            res = result;
        }
        return res;
    }

}
