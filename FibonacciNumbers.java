import java.util.Scanner;

public class FibonacciNumbers {
    public static int fib(int x) {
        if(x==1) return 1;
        if(x==0) return 0;
        else return fib(x-1)+fib(x-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x= sc.nextInt();
        System.out.println("The "+x+"th. number in the fibonacci sequence is "+ fib(x));
    }
}
