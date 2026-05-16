import java.util.HashMap;
import java.util.Scanner;

public class LargestNonRepeatSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        largestNonRepeatSubStringFun(str);
        sc.close();
    }

    private static void largestNonRepeatSubStringFun(String str) {
        int maxLength = 0;
        String longestSubString = "";
        HashMap<Character, Integer> map = new HashMap<>();
        char[] chars = str.toCharArray();

        for(int i=0;i< str.length();i++){
            char ch = chars[i];

            if(!map.containsKey(chars[i])){
                map.put(ch,i);
            }else{
                i = map.get(ch);
                map.clear();
            }

            if(map.size() > longestSubString.length()){
                maxLength = map.size();
                longestSubString = map.keySet().toString();
            }
        }

        System.out.println("longest Substring length: "+ maxLength);
        System.out.print("Longest Substring: "+longestSubString);

    }
}
