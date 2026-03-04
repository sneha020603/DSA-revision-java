import java.util.HashMap;
import java.util.Scanner;

public class FrequencyOfElementInArray {

    public static void frequency(int[] arr){
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }

        for(int key:map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of elements: ");
        int n = sc.nextInt();
        int arr[]=new int[n];

        System.out.println();
        System.out.println("Enter the elemnt: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        frequency(arr);

        sc.close();
    }
    
}
