public class FindPivotIndex {
  public int pivotIndex(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
      int left = 0;
      int right = 0;
      for (int m = 0; m < i; m++) {
        left += nums[m];
      }
      for (int n = i + 1; n < nums.length; n++) {
        right += nums[n];
      }
      if (left == right) {
        return i;
      }
    }
    return -1;
  }
}
