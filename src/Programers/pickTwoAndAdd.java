package Programers;

import java.util.ArrayList;
import java.util.Arrays;

public class pickTwoAndAdd {
    public static void main(String[] args) {

        int[] i = {
                2,1,3,4,1
        };

        int[] answer = solution(i);


    }//main
    public static int[] solution(int[] numbers) {

        ArrayList<Integer> arr = new ArrayList<>();

        int[] answer = {};
        int idx =0;
        for( int i=0; i< numbers.length -1; i++){
            for( int j=i+1; j<numbers.length; j++){
                int sum = numbers[i] + numbers[j];
                System.out.println("****** sum *******"+sum);
                if ( arr.indexOf(sum) < 0){
                    arr.add(sum);
                }

            }
        }

        answer = new int[arr.size()];

        for( int i=0; i<arr.size(); i++){
            answer[i] = arr.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }

}