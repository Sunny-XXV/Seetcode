import java.util.Arrays;

public class KthLargestElementInAnArray {
  public int findKthLargest(int[] nums, int k) {
    int[] rank = new int[k];
    Arrays.fill(rank, -10001);
    for (int num : nums) {
      for (int i = 0; i < k; i++) {
        if (num > rank[i]) {
          for (int j = k - 1; j > i; j--) {
            rank[j] = rank[j - 1];
          }
          rank[i] = num;
          break;
        }
      }
    }
    return rank[k - 1];
  }
}
