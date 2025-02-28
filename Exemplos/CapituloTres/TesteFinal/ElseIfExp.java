package TesteFinal;

public class ElseIfExp {
    public static void main(String[] args) {
        int idade = 10;

        if(idade > 10 || idade < 15) {
            System.out.println("Seu velhinho");
        } else if (idade < 5) {
            System.out.println("seu novinho");
        } else {
            System.out.println("seu idosinho");
        }

    }


}
