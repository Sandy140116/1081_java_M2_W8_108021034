import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a , b , c = 0;
        while (true){
            n = scn.nextInt();
            if (n == -999){
                break;
            }
            if (n > 0){
                a ++;
            }
            else if (n == 0){
                b ++;
            }
            else {
                c ++;
            }
            n = scn.nextInt();
        }

    }
}
