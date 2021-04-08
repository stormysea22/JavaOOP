package ListAssignment;

public class SinglyLinkedList {
    public Node head;

    public SinglyLinkedList() {
        this.head = null;
    }
    
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while (runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }

    public void remove() {
        Node runner = this.head;
        while (runner.next.next != null) {
            runner = runner.next;
        }
    }

    public void printValues() {
        Node runner = this.head;
        if (runner == null) {
            System.out.println(runner);
        } else {
            while (runner != null) {
                System.out.println(runner.value);
                runner = runner.next;
            }
        }
    }

    public void find(int value) {
        Node runner = this.head;
        while (runner.value != value) {
            runner = runner.next;
            System.out.println(runner.value);
        }
    }

    public void removeAt(int idx) {
        Node runner = this.head;
        if (runner == null) {
        }
        if(idx == 0){
            this.head =runner.next;
        }
        for(int i = 0; i < idx-i; i++){
            runner = runner.next;
        }
        runner.next = runner.next.next;
    }
}
