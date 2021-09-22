package exercise;

public class Exercise14 {
    public static void main(String[] args) {
        int number = 123421;
        int tmp = number;

        int result = 0;
        while(tmp!=0){
            result*=10; //0 , 10 ,120
            result += tmp%10; //1 , 10+2 ,
            tmp/=10; //1232 ,123
        }
        if(number==result){
            System.out.println(number +" 는 회문수입니다.");
        }else{
            System.out.println(number + "는 회문수가 아닙니다.");
        }
    }
}
