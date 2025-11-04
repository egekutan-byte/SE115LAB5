import java.util.Scanner;

public class RecursiveDecimal {
    public static int sumDigits(int n){
        if(0<n && n<10) return n;
        if(n<0) return -((n % 10) + sumDigits(n / 10));
        else return (n % 10) + sumDigits(n / 10);
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a decimal number: ");
    int n= sc.nextInt();
    System.out.println(sumDigits(n));
    }
}

