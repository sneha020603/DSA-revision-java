
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ShowDuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("By  Set method:");
        method1(str);

        sc.close();
        
    }

    private static void method1(String str) {
        Set<Character> seen = new HashSet<>();
        Set<Character> dupli = new HashSet<>();

        for(char ch:str.toCharArray()){
            if(!seen.add(ch)){
                dupli.add(ch);
            }
        }

        for(char i:dupli){
                System.out.println(i);
        }

    }

}
