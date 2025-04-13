package java_mid2.collection.link;

public class NodeMain1 {
    public static void main(String[] args) {
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");

        node1.next = node2;
        node2.next = node3;

        Node x = node1;
        int i = 1;
        while (x != null) {
            System.out.println("Node" + i + ": " + x.item);
            x = x.next;
            i ++;
        }
    }
}
