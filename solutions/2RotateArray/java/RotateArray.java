import java.util.Arrays;

class Solution {
  public void rotate(int[] nums, int k) {
    k = k % nums.length;
    int[] tail = Arrays.copyOfRange(nums, 0, nums.length - k);
    int[] head = Arrays.copyOfRange(nums, nums.length - k, nums.length);
    System.arraycopy(head, 0, nums, 0, head.length);
    System.arraycopy(tail, 0, nums, head.length, tail.length);
  }
}
