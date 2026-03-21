import java.util.Scanner;

public class PalindromeString {

    public static boolean method1(String str){

        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }

        if(rev.equals(str)) return true;

        return false;
    }

    public static Boolean method2(String str){

        int left=0;
        int right = str.length()-1;
        while(left < right){
            if(str.charAt(left) != str.charAt(right))
             {  
                 return false;
             }  
             
             left++;
             right--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        boolean ans1 = method1(str);
        boolean ans2 = method2(str);

        System.out.println(ans1);
        System.out.println(ans2);

        sc.close();
    }
    
}
