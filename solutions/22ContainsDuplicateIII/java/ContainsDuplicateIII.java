import java.util.HashMap;

class ContainsDuplicateIII {
  public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {
    TreeSet<Long> set = new TreeSet<>();
    for (int i = 0; i < nums.length; i++) {
      Long floor = set.floor((long) nums[i] + valueDiff);
      Long ceiling = set.ceiling((long) nums[i] - valueDiff);
      if ((floor != null && floor >= nums[i]) || (ceiling != null && ceiling <= nums[i]))
        return true;
      set.add((long) nums[i]);
      if (i >= indexDiff)
        set.remove((long) nums[i - indexDiff]);
    }
    return false;
  }

}
