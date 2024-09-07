import java.util.Arrays;

class Trick {
  public int findKthLargest(int[] nums, int k) {
    Arrays.sort(nums);
    return (nums[nums.length - k]);
  }
}
