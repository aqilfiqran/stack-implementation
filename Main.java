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

        ll.push(new Data<String>("tes"));
        ll.push(new Data<String>("tes2"));
        ll.push(new Data<String>("tes3"));
        ll.pop();
        ll.display();
    }
}