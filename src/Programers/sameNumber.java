package Programers;

import java.util.HashSet;

public class sameNumber {
    public static void main(String[] args) {
        int[] arr={1,1,3,3,0,1,1};
        System.out.println(solution(arr));
    }

        public static HashSet solution(int []arr) {
            HashSet hash=new HashSet();
           for (int num:arr){
               hash.add(num);
           }

            return hash;
        }

}
