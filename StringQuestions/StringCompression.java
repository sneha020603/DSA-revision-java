import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        compression(str);
        sc.close();
    }

    private static void compression(String str) {

        StringBuilder res =  new StringBuilder();
        int count =1;

        for(int i=0;i<str.length();i++){
            if(i < str.length() -1 && str.charAt(i) == str.charAt(i+1)){
                count++;
            }else{
                res.append(str.charAt(i));
                res.append(count);

                count=1;
            }
        }

        System.out.println(res);
    }
}
