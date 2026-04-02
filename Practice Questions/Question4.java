/*
write a code to count the uppercase and Lowercase letters of a given string. 
avoid special characters, spaces and digits.  

input: This is A Big Line 123. 
output : 
UPPERCASE : 4 
LOWERCASE : 10
*/
import java.util.*;

public class Question4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        check(line);
        sc.close();
    }

    public static void check(String line){
        int upCase = 0;
        int lowCase = 0;

        for(int i=0;i<line.length();i++){
            char ch = line.charAt(i);

            if(Character.isLowerCase(ch)){
                lowCase++;
            }else if(Character.isUpperCase(ch)){
                upCase++;
            }
        }

        System.out.println("UPPERCASE:"+upCase);
        System.out.println("LOWERCASE:"+lowCase);
    }
}
