/*
write a Java program that reverses the words in a string 
(keeping each word intact but reversing their order):  

input: Hello world this is Java 
output: Java is this world Hello
*/

import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        reverse(input);
        sc.close();
    }

    public static void reverse(String input) {

        if (input == null || input.trim().isEmpty()) {
            System.out.println("No String Found");
            return;
        }

        String[] words = input.trim().split("\\s+");

        for (int i = words.length -1;i>=0;i--) {
            
                System.out.print(words[i]);

                if (i != 0) {
                    System.out.print(" ");
                }
            }
    }
}
