import java.util.*;

public class ReverseString {

    public static String method1(String str){

        String rev="";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }

        return rev;
    }

    public static String method2(String str){

        String rev = new StringBuilder(str).reverse().toString();
        return rev;
        
    }

    public static String method3(String str){

        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length-1;

        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        return new String(arr);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        String ans1 = method1(str);
        String ans2 = method2(str);
        String ans3 = method3(str);
        System.out.println(ans1);
        System.out.println(ans2);
        System.out.println(ans3);

        sc.close();
    }
    
}
