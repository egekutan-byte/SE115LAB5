import java.util.Scanner;

public class RecursivePower{
    public static int myRecursivePower(int x,int y){
        if(y==0){
            return 1;
        }else{
            return x * myRecursivePower(x,y-1);
        }
    }public static int myIterativePower(int a,int b){
        int result=1;
        for(int i=b;i>=1;i--){
            result*=a;
        }return result;
    }

    public static void myIterativePower1(int a,int b){
        int result=1;
        for(int i=b;i>=1;i--) {
            result *= a;
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base: ");
        int x= sc.nextInt();
        System.out.println("Enter the exponent:");
        int y=sc.nextInt();
        System.out.println(myRecursivePower(x,y));
        System.out.println(myIterativePower(x,y));
        myIterativePower1(x,y);
    }
}





