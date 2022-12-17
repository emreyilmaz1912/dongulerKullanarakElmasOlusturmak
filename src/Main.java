import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Yıldızları Kullanarak Elmas Oluşturmak");

        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        int n = input.nextInt();

       for (int i = 0; i <= n; i++){
            for (int x = 1; x <= (n - i); x++){
                System.out.print(" ");
            }
            for (int y = 1; y <= (2*i) - 1 ; y++){
                System.out.print("*");
            }

            System.out.println();
        }

        for (int a = n-1; a >= 1; a--){

            for (int x = 1; x <= (n - a) ; x++) {
                System.out.print(" ");

            }
            for (int z = 1; z <= (2 * a) - 1; z++ ){
                System.out.print("*");
            }
            System.out.println();

        }

    }
}