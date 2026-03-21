import java.util.Scanner;

public class CountVowelsCons {
        public static void method1(String str){

            int vol=0;
            int con=0;
            String temp = str.toLowerCase();

            for(int i=0;i<temp.length()-1;i++){
                char c = temp.charAt(i);

                if(c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'){
                    vol++;
                }else{
                    con++;
                }
            }
   
        System.out.println("Vowels: " + vol);
        System.out.println("Consonants: " + con);
    }

    public static void method2(String str){

        int vol=0;
        int con=0;
        String temp = str.toLowerCase();
        String vowels ="aeiou";

            for(char c : temp.toCharArray()){
               
             if(c>='a' && c<='z')  
              {
                if(vowels.indexOf(c) !=-1){
                    vol++;
                }else{
                    con++;
                }
              }  
            } 

        System.out.println("Vowels: " + vol);
        System.out.println("Consonants: " + con);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        method1(str);
        method2(str);

        sc.close();
    }
}
