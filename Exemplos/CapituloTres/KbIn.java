public class KbIn {
    public static void main(String[] args)
        throws java.io.IOException {
        char ch;

        System.out.print("Pressione uma tecla e em seguida tecle ENTER:");
        ch = (char) System.in.read();

        System.out.println("Você pressionou:  "+ ch);
    }
}

