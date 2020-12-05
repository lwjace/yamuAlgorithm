package Programers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class kNumber {
    public static void main(String[] args) {
       int array[] ={1, 5, 2, 6, 3, 7, 4};
       int array1[][]= {{2, 5, 3}, {4, 4, 1} ,{1, 7, 3}};
        System.out.println(solution(array,array1));
    }
    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i= 0; i<commands.length; i++) {
            ArrayList arr= new ArrayList();
            for (int j = commands[i][0]-1; j <= commands[i][2-1]-1; j++) {
           arr.add(array[j]);
            }
            Collections.sort(arr);
            answer[i]= (int) arr.get(commands[i][2]-1);

        }
        return answer;
    }
}
