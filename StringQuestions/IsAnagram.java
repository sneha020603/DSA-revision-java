import java.util.Scanner;

public class IsAnagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a 1st String: ");
        String str1 = sc.nextLine();

        System.out.println("Enter a 2nd String: ");
        String str2 = sc.nextLine();

        System.out.println("is both string are anagram :");
        System.out.println(checkAnagram(str1,str2));
        sc.close();
    }

    private static boolean checkAnagram(String str1, String str2) {
        int[] count = new int[256];

        for(char c:str1.toCharArray()){
            count[c]++;
        }

        for(char c:str2.toCharArray()){
            count[c]--;
        }

        for(int i=0;i<count.length;i++){
            if(count[i] != 0) return false;
        }

        return true;
    }
}
