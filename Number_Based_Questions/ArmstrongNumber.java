public class ArmstrongNumber {

    // An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits. 
    // For example, 153 is an Armstrong number because 1^3 + 5^3 + 3^3 = 153.
    
    public static boolean isArmstrong(int num){
        int temp1,temp2;
        temp1=temp2=num;
        int sum=0,rem, count=0; 

        while(temp1>0){
            temp1/=10;
            count++;
        }

        while(temp2>0){
            rem = temp2%10;
            sum += Math.pow(rem, count);
            temp2 /=10;
        }

        if(sum == num) return true;

        return false;
    }

    public static void main(String[] args) {
        int num = 474;
        boolean ans = isArmstrong(num);
        System.out.println("isArmstring Number: "+ans);
        
    }
    
}
