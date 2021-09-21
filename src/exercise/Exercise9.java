package exercise;

public class Exercise9 {
    public static void main(String[] args) {
        int num = 12345;
        int sum=0;
        while(num>0){
            int tmp=0;
            tmp = num%10;
            num/=10;
            sum+=tmp;
        }
        System.out.println(sum);
    }
}
