import java.util.Arrays;
import java.util.Collection;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Задание 1: (добавить число/посчитать сумму)");
        System.out.println("Введите i: ");
        int i = scanner.nextInt();
        System.out.println("Введите j: ");
        int j = scanner.nextInt();
        int[][] arr = new int[i][j];
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[k].length; l++) {
                arr[k][l] = random.nextInt(0, 10);
                System.out.print(arr[k][l] + " ");
            }
            System.out.println();
        }
        int sum = 0;
        System.out.println("Введите значения, которые хотите добавить к числам: ");
        for (int k = 0; k < arr.length; k++) {
            for (int l = 0; l < arr[k].length; l++) {
                int s= scanner.nextInt();
                arr[k][l] += s;
                sum+=arr[k][l];

            }

        }
        System.out.println("Новый массив: "+Arrays.deepToString(arr));
        System.out.println("Сумма всех значений: " + sum);

        System.out.println();

        System.out.println("Задание 2: (раскраска шахматной доски)");
        String[][] ar = new String[8][8];

        for (int k = 0; k < ar.length; k++) {
            for (int l = 0; l < ar[k].length; l++) {
                if(k%2!=0 && l%2!=0 || k%2==0 && l%2==0){
                    ar[k][l] = "W";
                }else {
                    ar[k][l] = "B";
                }
                System.out.print(ar[k][l]+" ");
            }
            System.out.println();
        }


        System.out.println();

        System.out.println("Задание *: (змейка)");
        System.out.println("Введите n: ");
        int n = scanner.nextInt();
        System.out.println("Введите m: ");
        int m = scanner.nextInt();

        int[][] snake = new int[n][m];
        


        for (int k = 0; k < n*m; k++) {
            int a=k/m;
            int b;
            if(a%2==0){
                b=k%m;
            } else{
                b=m-1-k%m;
            }
            snake[a][b]=k;
        }
        for (int k = 0; k < snake.length; k++) {
            for (int l = 0; l < snake[k].length; l++) {
                System.out.print(snake[k][l]+" ");
            }
            System.out.println();
        }

    }
}