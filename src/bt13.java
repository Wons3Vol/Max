import java.util.Scanner;
public class bt13 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so x");
        double x = sc.nextDouble();
        double eps = 0.001;
        int dau = 1;
        double n = 1;
        double first = 1;
        double second = first + dau * (n/((n+1)*(n+2))) * Math.pow(x, n);
        
        while (Math.abs(first - second) > eps){
            n++;
            dau = -dau;
            first = second;
            second = first + dau * (n/((n+1)*n+2)) * Math.pow(x, n);
        }
        System.out.format("Gia tri la %f", first);
    }

    
}

