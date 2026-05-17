import java.util.HashMap;
import java.util.Scanner;

// Find the element with the maximum frequency in the array.
// For example, in the array [10, 20, 10, 30, 20, 10], 
// the element with the maximum frequency is 10, 
// which appears 3 times.

public class ReturnMaxFreqElemINArray {

    // Approach: HashMap to count frequencies
    // Time Complexity: O(n)
    // Space Complexity: O(n)

    public static void maxFrequencyElement(int[] arr) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num:arr){
            map.put(num,map.getOrDefault(num, 0)+1);
        }

        int maxfreq = 0;
        int ans = 0;
        for(int key:map.keySet()){
            if(map.get(key) > maxfreq){
                maxfreq=map.get(key);
                ans=key;
            }
        }

        System.out.println("Max Frequency Element in Array:");
        System.out.println(ans+" : "+maxfreq);
        
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

        maxFrequencyElement(arr);

        sc.close();
    }

}
