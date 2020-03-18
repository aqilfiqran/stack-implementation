package list;

public class Stack<Tipe> {
    private Node<Tipe> head;
    private int size;

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    public void setHead(Node<Tipe> head) {
        this.head = head;
        this.incSize();
    }

    public void incSize() {
        this.size++;
    }

    public void decSize() {
        this.size--;
    }

    public int Size() {
        return this.size;
    }

    public Node<Tipe> getHead() {
        return this.head;
    }

    public void push(Data<Tipe> data) {
        this.setHead(new Node<Tipe>(data, this.getHead()));
    }

    public void display() {
        Node<Tipe> current = this.getHead();

        while (current != null) {
            System.out.println(current.getData());
            if (current.getNext() == null)
                break;
            current = current.getNext();
        }
    }

    public boolean pop() {
        Node<Tipe> current = this.getHead();
        if (this.Size() == 0)
            return false;
        else if (current.getNext() != null)
            this.setHead(current.getNext());
        else
            current.setNull();
        this.decSize();
        return true;
    }

}