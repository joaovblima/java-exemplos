public class Ragged {
    public static void main(String[] args) {
        int[][]riders = new int[7][];

        for(int i = 0; i<5; i++) {
            riders[i] = new int[10];
        }

        for(int i = 5; i < 7; i++) {
            riders[i] = new int[2];
        }

        for (int i = 0; i<5; i++) {
            for (int j = 0; j < 10; j++) {
                riders[i][j] = i + j + 10;
            }
        }

        for (int i = 5; i<7; i++) {
            for (int j = 0; j < 2; j++) {
                riders[i][j] = i + j + 10;
            }
        }


        System.out.println("Passageiros for viagem durante a semana: ");
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++) {
                System.out.print(riders[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nPassageiros por viagem no fim de semana:");
        for(int i = 5; i < 7; i++) {
            for(int j = 0; j < 2; j++) {
                System.out.print(riders[i][j] + " ");
            }
            System.out.println();
        }
    }
}
