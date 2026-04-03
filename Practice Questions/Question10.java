/*
Write a java code to Count number of prime digits in a Number  

* Input : 254786135 
* Output : 5

*/

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        check(input);
        sc.close();
    }

    public static void check(int input){

        if (input == 0) {
            System.out.println("0");
            return;
        }

        int count =0;
        int num = input;

        while(num>0){
            int n = num % 10;

            if(n==2 || n==3 || n==7 || n==5){
                count++;
            }

            num = num/10;
        }

        System.out.println(count);
    }
}
