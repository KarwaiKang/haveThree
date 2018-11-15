public class Main {
    public static void main(String[] args) {
        System.out.println(haveThree(new int[]{3, 1, 3, 1, 3})); // → true
        System.out.println(haveThree(new int[]{3, 1, 3, 3})); // → false
        System.out.println(haveThree(new int[]{3, 4, 3, 3, 4})); // → false
    }

    private static boolean haveThree(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if ((i == 0 || nums[i - 1] != 3) &&
                    nums[i] == 3 &&
                    (i == nums.length - 1 || nums[i + 1] != 3))
                count++;
        }
        return count == 3;
    }
}
