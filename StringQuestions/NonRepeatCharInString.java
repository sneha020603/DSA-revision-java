import java.util.Scanner;

public class NonRepeatCharInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("non repeating char in string:");
        method(str);
        sc.close();
        
    }

    private static void method(String str) {
        int[] freq = new int[256];

        for(char c:str.toCharArray()){
            freq[c]++;
        }

        for(char c : str.toCharArray()){
            if(freq[c] == 1){
                System.out.print(c);
            }
        }
    }
}
