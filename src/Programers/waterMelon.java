package Programers;

public class waterMelon {
    public static void main(String[] args) {

        System.out.println(solution(3));


    }//main
        public static String solution(int n) {
            String answer="";
            for(int i=1; i<=n; i++){
                if(i%2==1){
                    answer=answer+"수";
                }
                else{
                    answer=answer+"박";
                }
            }
            return answer;
        }
    }
