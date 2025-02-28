public class Guess2 {
    public static void main(String[] args)
    throws java.io.IOException {
        char ch, ignore, answer = 'K';

        do {
            System.out.println("Estou pensando em uma letra de A a Z");
            System.out.println("Você pode advinhar qual é?");

            ch = (char) System.in.read();
            do {
                ignore = (char)System.in.read();
            } while (ignore != '\n');
            if (ch == answer) {
                System.out.println("** Correto **");
            } else {
                System.out.print("...Desculpe você está ");
                if (ch < answer) System.out.print(" muito abaixo\n");
                else System.out.print(" muito alto\n");
                System.out.println("Tente novamente");
            }
        } while (answer != ch);
    }
}
