class HeapSort {
  public int findKthLargest(int[] nums, int k) {
    buildMaxHeap(nums);
    int size = nums.length;
    for (int i = 0; i < k - 1; i++) {
      int tmp = nums[0];
      nums[0] = nums[size - i - 1];
      nums[size - i - 1] = tmp;
      heapify(nums, 0, size - i - 2);
    }
    return nums[0];
  }

  public void buildMaxHeap(int[] nums) {
    int size = nums.length;
    for (int i = (size - 2) / 2; i > -1; i--) {
      heapify(nums, i, size - 1);
    }
  }

  public void heapify(int[] nums, int index, int end) {
    int left = index * 2 + 1;
    int right = left + 1;
    while (left <= end) {
      int max_index = index;
      if (nums[left] > nums[max_index]) {
        max_index = left;
      }
      if (right <= end && nums[right] > nums[max_index]) {
        max_index = right;
      }
      if (index == max_index) {
        break;
      }
      int tmp = nums[index];
      nums[index] = nums[max_index];
      nums[max_index] = tmp;
      index = max_index;
      left = index * 2 + 1;
      right = left + 1;
    }
  }
}
