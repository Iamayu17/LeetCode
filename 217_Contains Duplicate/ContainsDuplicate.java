import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> object = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (object.contains(nums[i])) {
                return true;
            }
            object.add(nums[i]);
        }
        return false;
    }
}