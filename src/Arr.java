import java.util.Scanner;
public class Arr {
    public static void main(String[] args) {
        int arr[]= new int [5];
        Scanner sc = new Scanner(System.in);
        for (int i=1; i< arr.length; i++){
            System.out.format("a[%d]", i);
            arr[i] = sc.nextInt();
                }
        for (int i = 0; i < arr.length; i++){
            System.out.format("a[%d]=%d \t", i, arr[i]);
        }
        System.out.println();
    
    }
}
