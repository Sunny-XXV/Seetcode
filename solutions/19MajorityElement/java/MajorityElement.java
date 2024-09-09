import java.util.HashMap;
import java.util.Map;

public class MajorityElement {
  public int majorityElement(int[] nums) {
    HashMap<Integer, Integer> numDict = new HashMap<>();
    for (int num : nums) {
      numDict.put(num, numDict.getOrDefault(num, 0) + 1);
    }

    // int maxCount = Integer.MIN_VALUE;
    // int maxElement = -1;

    // for (int num : numDict.keySet()) {
    // if (numDict.get(num) > maxCount) {
    // maxCount = numDict.get(num);
    // maxElement = num;
    // }
    // }
    for (Map.Entry<Integer, Integer> entry : numDict.entrySet()) {
      if (entry.getValue() > nums.length / 2) {
        return entry.getKey();
      }
    }
    // return maxElement;
    return 0;
  }
}
