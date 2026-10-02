import java.util.Scanner;

public class PyramidExample {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Adjon meg egy számot: ");
        int num = sc.nextInt();
        char star = '*';
        for (int i = 1; i < num + 1; i++){
            for (int j = 0; j < i; j++){
                System.out.print(star);
            }
            System.out.println();
        }
    }
}
