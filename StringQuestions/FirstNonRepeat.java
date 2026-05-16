import java.util.*;

public class FirstNonRepeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        firstNonRepeatChar(str);
        sc.close();
    }

    private static void firstNonRepeatChar(String str) {
        LinkedHashMap<Character,Integer> map =  new LinkedHashMap<>();

        for(char c: str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }

        for(char c:map.keySet()){
            if(map.get(c) == 1){
                System.out.println(c);
                break;
            }
        }

    }
}
