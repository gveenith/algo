import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DialPad {

    public static void combination(String phoneNumber){
        Map<Character,String> dialMap = new HashMap<>();
        dialMap.put('0', "0");
        dialMap.put('1', "1");
        dialMap.put('2', "ABC");
        dialMap.put('3', "DEF");
        dialMap.put('4', "GHI");
        dialMap.put('5', "JKL");
        dialMap.put('6', "MNO");
        dialMap.put('7', "PQRS");
        dialMap.put('8', "TUV");
        dialMap.put('9', "WXYZ");

        List<String> result = new ArrayList<>();
        dialPadCombination(phoneNumber, dialMap, 0, result, new char[phoneNumber.length()]);
        result.forEach(System.out::println);
    }

    public static void dialPadCombination(String phoneNumber, Map<Character,String> dialMap, int index, List<String> result, char[] tempResult){
       //edgecase
       if(phoneNumber.length() <= 0){
           return;
       }
       
        //base condition
       if(phoneNumber.length() == index){
           result.add(Arrays.toString(tempResult));
           return;
       }

    String dialString =  dialMap.get(phoneNumber.charAt(index));

  //   if(dialString != null){
        char[] charSequence =  dialString.toCharArray();
     for(int i=0; i< charSequence.length; i++){
         tempResult[index] = charSequence[i];
        dialPadCombination(phoneNumber, dialMap, index+1, result, tempResult);
     }
  //  }else{
  //      tempResult[index] = phoneNumber.charAt(index);
  //      dialPadCombination(phoneNumber, dialMap, index+1, result, tempResult);
  //  }
     

       
    }
    
    
}
