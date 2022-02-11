import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LetterCasePermutation {

    public static void lettercase(String input){

        List<String> result = new ArrayList<>();
        casePermutation(input.toCharArray(),0, result);
        result.forEach(System.out::println);

    }

    public static void casePermutation(char[] input, int index, List<String> result){

        //base condition
        if(input.length == index){
            result.add(Arrays.toString(input));
            return;
        }

        if(Character.isAlphabetic(input[index])){
            input[index] = Character.toUpperCase(input[index]);
            casePermutation(input,index+1, result);
            input[index] = Character.toLowerCase(input[index]);
            casePermutation(input,index+1, result);
        }else{
            casePermutation(input,index+1, result);
        }


    }
}