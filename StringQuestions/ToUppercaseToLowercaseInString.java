import java.util.Scanner;

public class ToUppercaseToLowercaseInString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str1 = sc.nextLine();

        String ans = toLowerCaseM1(str1);
        System.out.println("By method1(int-bulid) : ");
        System.out.println(ans);
        

        String res = toLowerCaseM2(str1);
        System.out.println("By method2(ASCII): ");
        System.out.println(res);
        

        sc.close();
    }

    private static String toLowerCaseM1(String str1) {
        String res ="";

        res = str1.toLowerCase();

        return res;
    }

    private static  String toLowerCaseM2(String str1) {
       String res ="";

       for(char ch:str1.toCharArray()){
        if(ch >='A'&& ch<='Z'){
          res +=(char)(ch + 32);
        }else{
            res += ch;
        }
       }

       return res;
    }
    
}
