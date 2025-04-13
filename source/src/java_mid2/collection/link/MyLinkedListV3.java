package java_mid2.collection.link;

public class MyLinkedListV3<E> {
    private Node<E> first;
    private int size = 0;

    public void add(E o) {
        Node<E> node = new Node<E>(o);
        if (first == null) {
            first = node;
        } else {
            Node<E> lastNode = getLastNode();
            lastNode.next = node;
        }
        size ++;
    }

    public void add(E o, int index) {
        Node<E> node = new Node<E>(o);
        if (first == null) {
            first = node;
        } else {
            Node<E> pre = getNode(index - 1);
            node.next = pre.next;
            pre.next = node;
        }
        size ++;
    }

    public E remove(int index) {
        Node<E> removeNode;
        if (index == 0) {
            removeNode = first;
            first = null;
        } else {
            Node pre = getNode(index - 1);
            removeNode = pre.next;
            pre.next = pre.next.next;
        }
        size --;
        return removeNode.item;
    }

    public Node<E> getLastNode() {
        Node<E> x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public E set(int index, E e) {
        Node<E> x = getNode(index);
        E oldValue = x.item;
        x.item = e;
        return oldValue;
    }

    public E get(int index) {
        Node<E> node = getNode(index);
        return node.item;
    }

    public Node<E> getNode(int index) {
        Node<E> x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(E e) {
        int index = 0;
        for (Node<E> x = first; x != null ; x = x.next) {
            if (x.item.equals(e)) {
                return index;
            }
            index ++;
        }
        return -1;
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return
                first + "";
    }

    private static class Node<E> {
        E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }
        @Override
        public String toString() {
            if (next == null) {
                return item + "";
            }
            return item + " -> " + next; // 재귀
        }
    }
}
