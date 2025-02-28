package TesteFinal;

public class ReadUntilDot {
    public static void main(String[] args)
        throws java.io.IOException {
        char choice, ignore, answer = '.';
        int count = 0;

        for (; ; ) {
            do {
                System.out.println("Digite uma tecla: ");
                choice = (char) System.in.read();
                do {
                    ignore = (char)System.in.read();
                    count+=1;
                } while (ignore!= '\n');
            } while (choice != '.');
             if (choice == '.')

            break;
        }
        System.out.println("voce digitou "+ count);
    }
}
