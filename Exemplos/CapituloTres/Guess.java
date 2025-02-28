public class Guess {
    public static void main(String[] args)
        throws java.io.IOException{

        char ch, answer = 'K';

        System.out.println("Estou pensando em uma letra entre A e Z...");
        System.out.println("Você consegue advinhar? ");

        ch = (char) System.in.read();

        if(ch == answer) {
            System.out.println("Parabéns, você acertou!!!");
        } else{
            System.out.print("...Desculpe, ");
            if (ch < answer) {
                System.out.println("muito abaixo");
            } else {
                System.out.println("muito alto...");
            }
        }

    }
}
