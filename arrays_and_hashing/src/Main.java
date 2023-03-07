public class Main {
    public static void main(String[] args) {
        // Twosum
        int[] nums = new int[]{2,7,11,15};
        System.out.println(twoSum(nums, 9));
    }

    public static void newline() {
        System.out.println("-------------");
    }

    // Twosum
    public static int[] twoSum(int[] nums, int target) {
        for (int i=0; i< nums.length; i++) {
            nums[i] ++;
        }
        return nums;
    }
}