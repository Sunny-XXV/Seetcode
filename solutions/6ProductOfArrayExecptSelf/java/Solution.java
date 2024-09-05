import java.util.Arrays;

public class Solution {
  public int[] productExceptSelf(int[] nums) {
    int[] answer = new int[nums.length];
    Arrays.fill(answer, 1);
    int init = 1;
    for (int i = 0; i < nums.length; i++) {
      answer[i] *= init;
      init *= nums[i];
    }
    init = 1;
    for (int i = nums.length - 1; i >= 0; i--) {
      answer[i] *= init;
      init *= nums[i];
    }
    return answer;
  }
}
