public class MinMax {
    public static void main(String[] args) {
        int min, max;
        int[] nums = {99, -11, 10293, 425, 13, 225, 1119, 143, 1, 333};


        min = max = nums[0];

        for(int i = 0; i< nums.length; i++) {
            if(nums[i] < min) min = nums[i];
            if(nums[i] > max) max = nums[i];
        }

        System.out.println("Minimo: " + min + " Maximo: " + max);

    }
}
