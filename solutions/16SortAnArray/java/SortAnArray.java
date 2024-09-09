class SortAnArray {
  public int[] sortArray(int[] nums) {
    heapSort(nums);
    return nums;
  }

  public void heapify(int[] nums, int n, int i) {
    int largest = i;
    int left = 2 * i + 1, right = 2 * i + 2;
    if (left < n && nums[left] > nums[largest]) {
      largest = left;
    }
    if (right < n && nums[right] > nums[largest]) {
      largest = right;
    }
    if (largest != i) {
      int tmp = nums[largest];
      nums[largest] = nums[i];
      nums[i] = tmp;
      heapify(nums, n, largest);
    }
  }

  public int[] heapSort(int[] nums) {
    int n = nums.length;
    for (int i = n / 2 - 1; i > -1; i--) {
      heapify(nums, n, i);
    }
    for (int i = n - 1; i > 0; i--) {
      int tmp = nums[i];
      nums[i] = nums[0];
      nums[0] = tmp;
      heapify(nums, i, 0);
    }
    return nums;
  }

  public int[] quickSort(int[] nums, int low, int high) {
    if (low < high) {
      int pivot_i = partition(nums, low, high);
      quickSort(nums, low, pivot_i - 1);
      quickSort(nums, pivot_i + 1, high);
    }
    return nums;
  }

  public int partition(int[] nums, int low, int high) {
    int pivot = nums[low];
    int i = low, j = high;
    while (i < j) {
      while (i < j && nums[j] >= pivot) {
        j--;
      }
      while (i < j && nums[i] <= pivot) {
        i++;
      }
      int tmp = nums[i];
      nums[i] = nums[j];
      nums[j] = tmp;
    }
    int tmp = nums[j];
    nums[j] = nums[low];
    nums[low] = tmp;
    return j;
  }
}
