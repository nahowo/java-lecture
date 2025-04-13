package java_mid2.collection.link;

public class MyLinkedListV2 {
    private Node first;
    private int size = 0;

    public void add(Object o) {
        Node node = new Node(o);
        if (first == null) {
            first = node;
        } else {
            Node lastNode = getLastNode();
            lastNode.next = node;
        }
        size ++;
    }

    public void add(Object o, int index) {
        Node node = new Node(o);
        if (first == null) {
            first = node;
        } else {
            Node pre = getNode(index - 1);
            node.next = pre.next;
            pre.next = node;
        }
        size ++;
    }

    public Object remove(int index) {
        Node removeNode;
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

    public Node getLastNode() {
        Node x = first;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    public Object set(int index, Object e) {
        Node x = getNode(index);
        Object oldValue = x.item;
        x.item = e;
        return oldValue;
    }

    public Object get(int index) {
        Node node = getNode(index);
        return node.item;
    }

    public Node getNode(int index) {
        Node x = first;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public int indexOf(Object e) {
        int index = 0;
        for (Node x = first; x != null ; x = x.next) {
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
}
