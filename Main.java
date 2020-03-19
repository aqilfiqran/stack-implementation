import list.*;

/**
 * Implementasi stack dan generic class di java
 * 
 * @author Aqil Fiqran Dzi'Ul Haq
 * @version 1.0
 * @since 18-Maret-2020
 */
public class Main {
    public static void main(String a[]) {
        Stack<String> ll = new Stack<String>();

        ll.push(new Data<String>("t"));
        ll.push(new Data<String>("e"));
        ll.push(new Data<String>("s"));
        String tes = ll.pop();
        if (!ll.isEmpty()) {
            System.out.println("tidak kosong");
        }
        System.out.println(tes);
        ll.display();
    }
}