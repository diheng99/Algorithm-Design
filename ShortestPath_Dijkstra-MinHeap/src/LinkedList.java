public class LinkedList {
    Node head;
    
    public void insert(Edge edge) {
        Node new_Node = new Node(edge);

        if(this.head == null) {
            this.head = new_Node;
        }
        else {
            Node cur = this.head;
            while(cur.next != null) {
                cur = cur.next;
            }
            cur.next = new_Node;
        }
    }
}
