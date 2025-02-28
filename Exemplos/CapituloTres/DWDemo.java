public class DWDemo {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;
        do {
            System.out.print("Pressione uma tecla e depois ENTER: ");
            ch = (char) System.in.read();
            System.in.read();
        } while (ch != 'q');
    }
}
