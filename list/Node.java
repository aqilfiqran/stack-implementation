package list;

public class Node<Tipe> {
    private Data<Tipe> data;
    private Node<Tipe> next;

    public Node(Data<Tipe> data, Node<Tipe> next) {
        this.setNext(next);
        this.setData(data);
    }

    public void setNext(Node<Tipe> next) {
        this.next = next;
    }

    public void setData(Data<Tipe> data) {
        this.data = data;
    }

    public Data<Tipe> getData() {
        return this.data;
    }

    public Node<Tipe> getNext() {
        if (this.hasNext())
            return this.next;
        return null;
    }

    public boolean hasNext() {
        return this.next != null;
    }

    public void setNull() {
        this.next = null;
    }

}