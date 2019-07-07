import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int arr[];
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = sc.nextInt();
            if (size > 20) {
                System.out.println("vuot qua gioi han mang");
            }
        } while (size > 20);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("nhap vao phan tu thu " + (i + 1) + " ");
            arr[i] = sc.nextInt();
        }
        System.out.println("mang da nhap la: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
        for (int j = 0; j < arr.length / 2; j++) {
            int temp = arr[j];
            arr[j] = arr[size - 1 - j];
            arr[size - 1 - j] = temp;
        }
        System.out.println("mang dao nguoc la: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j] + " ");
        }
    }
}
