package java_mid2.collection.link;

public class Node {
    Object item;
    Node next;

    public Node(Object item) {
        this.item = item;
    }

    @Override
    public String toString() {
        if (next == null) {
            return item + "";
        }
        return
                item +
                " -> " + next; // 재귀
    }
}
