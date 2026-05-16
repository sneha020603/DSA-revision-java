import java.util.*;

public class getIt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        //reverse(str);
        //isPalindrome(str);

        String str2 = sc.nextLine();
        isAnagram(str,str2);

        sc.close();
    }

    public static void isAnagram(String str, String str2) {
        int count[] = new int[26];
        boolean check = true;
        
        for(char c:str.toCharArray()){
            c = Character.toLowerCase(c);
            count[c - 'a']++;
        }

        for(char c:str2.toCharArray()){
            c = Character.toLowerCase(c);
            count[c - 'a']--;
        }

        for(int num : count){
            if(num != 0){
                check = false;
                break;
            }
        }

        if(check){
            System.out.println("is Anagram");
        }else{
            System.out.println("is not anagram");
        }
    }

    public static void reverse(String str)
    {
        String rev = new StringBuilder(str).reverse().toString();
        System.out.println(rev);
    } 
    
    public static void isPalindrome(String str){
        String str2 = new StringBuilder(str).reverse().toString();

        if(str.equals(str2)){
            System.out.println("is Palindrome");
        }else{
            System.out.println("is not palindrome");
        }
    }
}
