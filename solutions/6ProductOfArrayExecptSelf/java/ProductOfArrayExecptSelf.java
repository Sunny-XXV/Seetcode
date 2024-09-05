import java.util.Arrays;

public class ProductOfArrayExecptSelf {

  public int[] ProductExecptSelf(int[] nums) {
    int allProduct = 1;
    int zeroCnt = 0;
    int zeroIndex = -1;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 0) {
        zeroCnt += 1;
        zeroIndex = i;
      } else {
        allProduct *= nums[i];
      }
    }
    int[] answer = new int[nums.length];
    Arrays.fill(answer, 0);
    if (zeroCnt > 1) {
      return answer;
    } else if (zeroCnt == 1) {
      answer[zeroIndex] = allProduct;
      return answer;
    } else {
      for (int i = 0; i < answer.length; i++) {
        answer[i] = allProduct / nums[i];
      }
    }
    return answer;
  }
}
