/*
write a java code to calculate the sum of numbers from a string  

Input : 123helLo1998world10  
Output : 2131
*/

import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        sumNo(input);
        sc.close();
    }

    private static void sumNo(String input) {
        if (input == null || input.trim().isEmpty()) {
            System.out.println(0);
            return;
        }

        int sum=0;
        String num="";

        for(int i =0 ;i<input.length();i++){
            char ch = input.charAt(i);

            if(Character.isDigit(ch)){
                num += ch;
            }else{
                if(!num.isEmpty()){
                    sum += Integer.parseInt(num);
                    num ="";
                }
            }
        }

        if(!num.isEmpty()){
            sum += Integer.parseInt(num);
        }
        System.out.println(sum);

    }
    
}
