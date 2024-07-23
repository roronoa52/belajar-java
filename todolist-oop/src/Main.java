public class Main {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7};
        int target = 10;
        int[] result = solution(nums, target);
        System.out.println(result);
    }

    public static int[] solution(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                int complement = target - nums[i];
                if (nums[j] == complement)
                    return new int[]{i, j};
            }
        }
        throw new IllegalArgumentException("No Data");
    }

}
