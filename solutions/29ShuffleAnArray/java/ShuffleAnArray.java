class ShuffleAnArray {
  private int[] nums;

  public ShuffleAnArray(int[] nums) {
    this.nums = nums;
  }

  public int[] reset() {
    return nums;
  }

  public int[] shuffle() {
    int[] a = nums.clone();
    for (int i = 0; i < a.length; i++) {
      int j = (int) (Math.random() * a.length);
      int temp = a[i];
      a[i] = a[j];
      a[j] = temp;
    }
    return a;
  }
}
