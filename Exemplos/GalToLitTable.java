public class GalToLitTable {
    public static void main(String[] args) {
        double litros, galoes;
        int contador = 0;

        for(galoes = 1; galoes<=100; galoes++){
            litros = galoes * 3.7845;
            System.out.println(galoes + " galões equivalem a " + litros + " litros de água");

            contador++;
            if(contador == 10){
                System.out.println();
                contador = 0;
            }
        }
    }
}
