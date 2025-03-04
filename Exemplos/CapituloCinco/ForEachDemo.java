public class ForEachDemo {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        for(int num : numeros){
            sum += num;
        }

        System.out.println(sum);
    }
}
