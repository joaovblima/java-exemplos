public class FindFact {
    public static void main(String[] args) {
        for (int i = 2; i<100; i++){
            System.out.print("Fatores de " +i + ": ");
            for (int j = 2; j<100; j++) {
                if ((i % j) == 0) System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
