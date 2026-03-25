import java.util.*;

public class ReplaceCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = sc.nextLine();
        System.out.println("enter a charater to replace:");
        char c = sc.next().charAt(0);
        System.out.println("enter the replace charater:");
        char rep = sc.next().charAt(0);

        System.out.println("By in-Build method:");
        method1(str,c,rep);

        System.out.println("By for method: ");
        method2(str,c,rep);

        sc.close();
    }

    public static void method1(String str, char c, char r){

        String ans = str.replace(c, r);
        System.out.println(ans);
    }

    public static void method2(String str, char c, char r){

        String ans ="";
        for(char i:str.toCharArray()){
            if(i == c){
                ans = ans+r;
            }else{
            ans += i;
            }
        }

         System.out.println(ans);
    }
}
