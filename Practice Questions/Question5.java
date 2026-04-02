/*
Write main method in Solution class. 
In the main method, read a string and find the count of words starting with a vowel in the string. 
If no words are present in the String valu it should print "No String found". 

note:  ALL search should be case insensitive.  

Sample input1: Everyone should practice and learn to became professional. 
Output: 2  

Sample input2: hi guys 
Output: No String found
*/

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        counter(input);
        sc.close();
    }

    public static void counter(String input) {
        if (input == null || input.trim().isEmpty()) {
            System.out.println("No String Found");
            return;
        }

        String[] words = input.trim().split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.length() > 0) {
                char ch = Character.toLowerCase(word.charAt(0));

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o') {
                    count++;
                }
            }

        }

        if (count == 0) {
            System.out.println("No String found");
        } else {
            System.out.println(count);
        }
    }

}
