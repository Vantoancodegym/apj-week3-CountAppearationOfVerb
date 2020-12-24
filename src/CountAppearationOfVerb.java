import java.util.*;

public class CountAppearationOfVerb {
    public static final int DEFAUT_VALUE  = 1;

    public static void main(String[] args) {
        Map<String,Integer> treeMapOfWords=new TreeMap<>();
        Scanner scanner=new Scanner(System.in);
        System.out.println("input your string");
        String inputString=scanner.nextLine();
        String[] convertString=inputString.split(" ");
        System.out.println(Arrays.toString(convertString));
        Set<String> listOfKeys=treeMapOfWords.keySet();
        for (String string:convertString) {
            if (listOfKeys.isEmpty()){
                treeMapOfWords.put(string,DEFAUT_VALUE);
            }else {
                boolean flag = isFlag(treeMapOfWords, listOfKeys, string);
                if (!flag){
                    treeMapOfWords.put(string,DEFAUT_VALUE);
                }
            }
        }
        System.out.println(treeMapOfWords);
    }

    private static boolean isFlag(Map<String, Integer> treeMapOfWords, Set<String> listOfKeys, String string) {
        for (String s: listOfKeys) {
            if (string.equals(s)){
                int newValue= treeMapOfWords.get(s)+1;
                treeMapOfWords.replace(string,newValue);
                return true;
            }
        }
        return false;
    }
}
