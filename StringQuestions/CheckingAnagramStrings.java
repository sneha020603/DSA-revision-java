import java.util.Arrays;
import java.util.Scanner;

public class CheckingAnagramStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 strings: ");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();

        //normalize input
        str1 = str1.replace(" ", "").toLowerCase();
        str2 = str2.replace(" ", "").toLowerCase();

        if (isAnagramsM1(str1, str2)) {
            System.out.println("By method1:");
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println("By method1:");
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        if (isAnagramsM2(str1, str2)) {
        System.out.println("By method2(Sorting arr):");
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println("By method2(ASCII):");
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        sc.close();
    }

    private static boolean isAnagramsM1(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1, arr2)){
            return true;
        }

        return false;
    }

    private static boolean isAnagramsM2(String str1, String str2) {

        int[] count = new int[26];

        if(str1.length() != str2.length()){
            return false;
        }

        for(int i=0; i<str1.length(); i++){
            count[str1.charAt(i) - 'a']++;
            count[str2.charAt(i) - 'a']--;
        }

        for(int c : count){
            if(c != 0){
                return false;
            }
        }
        
        return true;
    }
}
