import java.util.Scanner;

public class RemaoveSpacesInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a line: ");
        String line = sc.nextLine();

        System.out.println("By loop method:");
        method1(line);
        System.out.println("By in-Build method:");
        method2(line);

        sc.close();
        
    }

    private static void method1(String line) {
        String res ="";

        for(char ch:line.toCharArray()){
            if(ch != ' '){
                res += ch;
            }
        }

        System.out.println(res);
    }

    private static void method2(String line) {

        String result = line.replace(" ","");
        System.out.println(result);       
    }
}
