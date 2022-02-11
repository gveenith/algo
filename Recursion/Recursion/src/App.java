public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Recursion");

        LetterCasePermutation.lettercase("A1B2");
        DialPad.combination("910");
        PermutationOfString.permute("abcd");
        int[] input = new int[]{1,2,3};
        Subsets.subset(input);
        System.out.println("SubsetSum");
        int[] input2 = new int[]{1,2,3};
        SubsetSumK.subset(input2);
    }
}
 