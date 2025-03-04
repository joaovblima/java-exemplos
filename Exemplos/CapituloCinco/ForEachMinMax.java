public class ForEachMinMax {
    public static void main(String[] args) {
        int min, max;
        int[] nums = {99, -11, 10293, 425, 13, 225, 1119, 143, 1, 333};


        min = max = nums[0];

      for(int num : nums){
          if(num < min) min = num;
          if(num > max) max = num;
      }

        System.out.println("Minimo: " + min + " Maximo: " + max);

    }
}
