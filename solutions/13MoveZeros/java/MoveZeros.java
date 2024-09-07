/**
 * MoveZeros
 */
public class MoveZeros {

  public void moveZeroes(int[] nums) {
    int nonZeroIndex = 0, tmp = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != 0) {
        tmp = nums[i];
        nums[i] = nums[nonZeroIndex];
        nums[nonZeroIndex] = tmp;
        nonZeroIndex++;
      }
    }
  }
}
