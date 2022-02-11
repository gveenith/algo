import java.util.ArrayList;
import java.util.List;

public class Subsets {

    public static void subset(int[] nums){


        List<Integer> tempResult = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, 0, result, tempResult);
        result.forEach(System.out::println);

    }

    public static void helper(int[] nums,int i, List<List<Integer>> result, List<Integer> tempResult){
        if(nums.length == i){
            result.add(new ArrayList<>(tempResult));
            return;
        }

        tempResult.add(nums[i]);
        helper(nums, i+1, result, tempResult);
        tempResult.remove(tempResult.size()-1);
        helper(nums, i+1, result, tempResult);

    }
    
}
