package exercise;

public class Exercise11 {
    public static void main(String[] args) {

        //practice1();
        //practice2();
        practice3();
    }

    private static void practice1() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + "*" + j + "=" + i * j);
            }
        }
    }

    private static void practice2() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 3; j++) {
                int x = i % 3;
                String tab = "";
                switch (x) {
                    case 1:
                        tab = "                 ";
                        break;
                    case 2:
                        tab = "";
                        break;
                    case 0:
                        tab = "        ";
                        break;
                }
                System.out.println(tab + i + "*" + j + "=" + i * j);
            }
        }
    }
    private static void practice3() {
        for (int i = 2; i <= 9; i++) {
            for (int j = 1; j <= 3; j++) {
                int x = i % 3;
                int y = j % 3;
                String tab = "";
                String enter = "";
                switch (x) {
                    case 1:
                        tab = "                 ";
                        break;
                    case 2:
                        tab = "";
                        break;
                    case 0:
                        tab = "        ";
                        break;
                }

                switch (y){
                    case 1:enter="\n";break;
                    case 2:enter="\n\n";break;
                    case 0:enter="";break;
                }
                System.out.print(tab + i + "*" + j + "=" + i * j +enter);
            }
        }
    }
}
