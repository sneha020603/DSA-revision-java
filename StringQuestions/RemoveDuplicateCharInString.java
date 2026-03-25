import java.util.*;

public class RemoveDuplicateCharInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String:");
        String str = sc.nextLine();

        System.out.println("By Set<> method:");
        method1(str);

        System.out.println("By index-for method: ");
        method2(str);

        sc.close();
    }

    public static void method1(String str){

        Set<Character> ans = new LinkedHashSet<>();

        for(char ch : str.toCharArray()){
            ans.add(ch);
        }

        for(char c:ans){
            System.out.print(c);
        }
        System.out.println();
    }

    public static void method2(String str){

        String ans ="";
        for(char i: str.toCharArray()){
            if(ans.indexOf(i) == -1){
                ans = ans+ i;
            }
        }

         System.out.println(ans);
    }

    
}
