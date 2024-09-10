import java.util.Arrays;

class MaximumGap {
  public int maximumGap(int[] nums) {
    int n = nums.length;
    if (n < 2) {
      return 0;
    }
    nums = radixSort(nums);
    int maxGap = 0;
    for (int i = 1; i < n; i++) {
      if (nums[i] - nums[i - 1] > maxGap) {
        maxGap = nums[i] - nums[i - 1];
      }
    }
    return maxGap;
  }

  public int[] radixSort(int[] nums) {
    int n = nums.length;
    int max = Arrays.stream(nums).max().getAsInt();
    for (int exp = 1; max / exp > 0; exp *= 10) {
      countingSort(nums, exp);
    }
    return nums;
  }

  public int[] countingSort(int[] nums, int exp) {
    int n = nums.length;
    int[] output = new int[n];
    int[] count = new int[10];

    for (int i = 0; i < n; i++) {
      count[(nums[i] / exp) % 10]++;
    }

    for (int i = 1; i < 10; i++) {
      count[i] += count[i - 1];
    }

    for (int i = n - 1; i >= 0; i--) {
      output[count[(nums[i] / exp) % 10] - 1] = nums[i];
      count[(nums[i] / exp) % 10]--;
    }
    System.arraycopy(output, 0, nums, 0, n);
    return nums;
  }
}
