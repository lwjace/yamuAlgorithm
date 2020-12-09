package Programers;

public class decimal {
    public static void main(String[] args) {
        int[] i = {1, 2, 3, 4};
        System.out.println(solution(i));
    }
    public static int solution(int[] nums) {
        int Count = 0;
        int sum;
        boolean chk= false;
        for (int i = 0; i < nums.length; i++) {
            int num1=  nums[i];
            for (int j = i+1; j < nums.length; j++) {
                int num2=  nums[j];
                for (int k = j+1; k < nums.length; k++) {
                    int num3=  nums[k];
                    sum = num1 + num2 + num3;
                    if (sum>=2) {
                      chk=decimalchk(sum);
                        if (chk==true) {
                            Count++;
                        }
                    }
                }
            }
        }
            return Count;
        }
        public static boolean decimalchk(int sum){
        boolean chk = true;
        if(sum==2){
            return chk;
        }
        for(int i =2; i<sum; i++){
            if (sum%i==0){
                chk=false;
                break;
            }
            return chk;
        }
        return chk;
        }
}
