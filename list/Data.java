package list;

public class Data<Tipe> {
    private Tipe o;

    public Data(Tipe o) {
        this.o = o;
    }

    public String toString() {
        return this.o.toString();
    }
}