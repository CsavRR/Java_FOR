import java.util.Scanner;

public class PyramidReverse {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy számot: ");
        int num = sc.nextInt();
        char star = '*';
        for (int i = num; i > 0; i--){
            for (int j = i; j > 0 ; j--){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
