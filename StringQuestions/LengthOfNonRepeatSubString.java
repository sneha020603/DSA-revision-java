import java.util.HashSet;
import java.util.Scanner;

public class LengthOfNonRepeatSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        lengthOfNonRepeatSubStringFun(str);
        sc.close();
    }

    private static void lengthOfNonRepeatSubStringFun(String str) {
       
        HashSet<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;

        for(int right = 0; right < str.length(); right++){
            
            while(set.contains(str.charAt(right))){
                set.remove(str.charAt(left));
                left++;
            }
            set.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
    }

}

