import java.util.Arrays;

class RelativeSortArray {
  public int[] relativeSortArray(int[] arr1, int[] arr2) {
    int min = arr1[0], max = arr1[0], n = arr1.length;
    for (int i = 0; i < n; i++) {
      if (arr1[i] < min) {
        min = arr1[i];
        continue;
      }
      if (arr1[i] > max) {
        max = arr1[i];
        continue;
      }
    }

    int[] counts = new int[max - min + 1];
    Arrays.fill(counts, 0);

    for (int num : arr1) {
      counts[num - min]++;
    }

    int[] relativeSort = new int[n];
    int index = 0;

    for (int num : arr2) {
      while (counts[num - min] > 0) {
        relativeSort[index++] = num;
        counts[num - min]--;
      }
    }
    for (int i = 0; i < max - min + 1; i++) {
      while (counts[i] > 0) {
        int num = min + i;
        relativeSort[index++] = num;
        counts[i]--;
      }
    }
    return relativeSort;
  }
}
