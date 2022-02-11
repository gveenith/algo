import java.util.ArrayList;
import java.util.List;

public class SubsetSumK {
    public static void subset(int[] nums){


        List<Integer> tempResult = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        helper(nums, 0, 4, result, tempResult);
        result.forEach(System.out::println);

    }

    public static void helper(int[] nums,int i, int sum, List<List<Integer>> result, List<Integer> tempResult){
       
        if(sum == 0 ){
            result.add(new ArrayList<>(tempResult));
            return;
        }
        if(sum < 0 || nums.length == i){
            return;
        }

        tempResult.add(nums[i]);
        helper(nums, i+1, sum-nums[i], result, tempResult);
        tempResult.remove(tempResult.size()-1);
        helper(nums, i+1, sum, result, tempResult);

    }
    
}
