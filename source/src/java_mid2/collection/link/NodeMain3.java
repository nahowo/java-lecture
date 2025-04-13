package java_mid2.collection.link;

public class NodeMain3 {
    public static void main(String[] args) {
        Node node1 = new Node("A");
        Node node2 = new Node("B");
        Node node3 = new Node("C");

        node1.next = node2;
        node2.next = node3;

        System.out.println(node1);

        System.out.println("모든 노드 탐색");
        printAll(node1);

        System.out.println("마지막 노드 탐색");
        Node lastNode = getLastNode(node1);
        System.out.println("lastNode = " + lastNode.item);

        int index = 1;
        System.out.println(index + "번 인덱스의 노드 조회하기");
        Node indexNode = getNode(node1, index);
        System.out.println("node[" + index + "] = " + indexNode.item);

        System.out.println("노드 추가하기");
        add(node1, "D");
        add(node1, "E");
        System.out.println(node1);

    }

    private static void add(Node node1, String param) {
        Node lastNode = getLastNode(node1);
        lastNode.next = new Node(param);
    }

    private static Node getNode(Node node1, int index) {
        Node x = node1;
        for (int i = 0; i < index; i++) {
            if (x == null) {
                return null;
            }
            x = x.next;
        }
        return x;
    }

    private static Node getLastNode(Node node1) {
        Node x = node1;
        while (x.next != null) {
            x = x.next;
        }
        return x;
    }

    private static void printAll(Node node1) {
        Node x = node1;
        while (x != null) {
            System.out.println(x.item);
            x = x.next;
        }
    }
}
