public class MaxConsecutiveOnes {
  public int findMaxConsecutiveOnes(int[] nums) {
    int streak = 0;
    int cnt = 0;
    for (int num : nums) {
      if (num == 1) {
        cnt += 1;
      } else {
        cnt = 0;
      }
      if (cnt > streak) {
        streak = cnt;
      }
    }
    return streak;
  }
}
