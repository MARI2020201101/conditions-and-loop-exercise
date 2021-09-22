package exercise;

import java.util.Scanner;

public class Exercise13 {
    public static void main(String[] args) {
        int answer = (int)(Math.random()*100)+1;
        int input = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        do{
            count++;
            System.out.println("1과 100사이의 값을 입력해주세요");
            input = scanner.nextInt();
            if(input==answer){
                System.out.println(count +" 번 만에 맞추셨습니다."); break;
            }
        }while (true);
    }
}
