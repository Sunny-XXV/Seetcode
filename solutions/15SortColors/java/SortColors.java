/**
 * SortColors
 */
public class SortColors {

  public void sortColors(int[] nums) {
    int n = nums.length;
    int lastRed = 0, firstBlue = n - 1, index = 0;
    while (index <= firstBlue) {
      if (index < lastRed) {
        index++;

      } else if (nums[index] == 0) {
        int tmp = nums[index];
        nums[index] = nums[lastRed];
        nums[lastRed] = tmp;
        lastRed++;
      } else if (nums[index] == 2) {

        int tmp = nums[index];
        nums[index] = nums[firstBlue];
        nums[firstBlue] = tmp;
        firstBlue--;
      } else {
        index++;
      }
    }
  }

}
