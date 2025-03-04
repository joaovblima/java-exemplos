public class Bubble {
    public static void main(String[] args) {
        int[] nums = {99, -11, 10293, 425, 13, 225, 1119, 143, 1, 333};
        int a, b, t;
        int size;

        size = 10;

        System.out.println("O Array original: ");
        for (int i = 0; i< nums.length; i++){
            System.out.print(" "+ nums[i]);
        }
        System.out.println();

        for (a = 1; a < size; a++) {
            for (b = size -1; b >= a; b--){
                if(nums[b -1] > nums[b]) {
                    t = nums[b - 1];
                    nums[b - 1] = nums[b];
                    nums[b] = t;
                }
            }
        }

        System.out.println("Array Ordenado: ");
        for (int i = 0; i<nums.length; i++) {
            System.out.print(" "+ nums[i]);
        }
        System.out.println();

    }
}
