package Programers;

public class numberHide {
 public static void main(String[] args) {
        System.out.println(solution("01090550119"));
    }
    public static String solution(String phone_number) {
        String answer = "";
        int length= phone_number.length();
        for (int i=0; i<=length-4; i++){
            answer+="*";
        }
        String end= phone_number.substring(length-4);
        answer+=end;
        return answer;
    }
}
