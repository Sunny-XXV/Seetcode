import java.util.Arrays;

class MergeSortedArray {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    int index1 = 0, index2 = 0, index = 0;
    int[] numsTmp = Arrays.copyOf(nums1, m);

    while (index1 < m && index2 < n) {
      if (numsTmp[index1] < nums2[index2]) {
        nums1[index++] = numsTmp[index1++];
      } else if (numsTmp[index1] > nums2[index2]) {
        nums1[index++] = nums2[index2++];
      } else {
        nums1[index++] = numsTmp[index1++];
        nums1[index++] = nums2[index2++];
      }
    }
    if (index1 < m) {
      for (int i = index1; i < m; i++) {
        nums1[index++] = numsTmp[i];
      }
    }
    if (index2 < n) {
      for (int i = index2; i < n; i++) {
        nums1[index++] = numsTmp[i];
      }
    }
  }
}
