import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationOfString {

    public static void permute(String input){

        List<String> result = new ArrayList<>();

        if(input.length() <= 0){
            result.add("");
        }
        helper(input.toCharArray(), 0, result);
        result.forEach(System.out::println);
    }

    public static void helper(char[] input, int i, List<String> result){

        //base
        if(i == input.length){
            result.add(Arrays.toString(input));
            return;
        }

        for(int j= i; j< input.length; j++){
            swap(input, i, j);
            helper(input, i+1, result);
            swap(input, i, j);
        }
    }

    public static void swap(char[] input, int i, int j){
        char temp = input[i];
        input[i] = input[j];
        input[j] = temp;
    }
    
}
