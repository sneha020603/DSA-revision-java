import java.util.HashMap;
import java.util.Scanner;

public class CharacterFrequencyInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        System.out.println("By  ASCII method:");
        method1(str);
        System.out.println("By HASHMAP  method:");
        method2(str);

        sc.close();
        
    }

    private static void method1(String str) {
        int[] count = new int[256];

        for(char ch:str.toCharArray()){
            count[ch]++;
        }

        for(int i=0;i<256;i++){
            if(count[i] > 0){
                System.out.println((char)i+": "+count[i]);
            }
        }

    }

    private static void method2(String str) {

        HashMap<Character,Integer> map = new HashMap<>();

        for(char ch:str.toCharArray()){
            map.put(ch,map.getOrDefault(ch, 0)+1);
        }

        for(char key:map.keySet()){
                System.out.println(key+": "+map.get(key));
        }       
    }
}
