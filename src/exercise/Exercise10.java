package exercise;

public class Exercise10 {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 1;

        String result = num1+" , "+num2 + " , ";
        for(int i=0;i<8;i++){
            int tmp = 0;
            tmp = num2;
            num2 = num1; //1,2 ,3
            num1 = num2 + tmp; //2 ,3 ,5
            result += num1 + " , "; //2 , 3
        }
        System.out.println(result);
    }
}
