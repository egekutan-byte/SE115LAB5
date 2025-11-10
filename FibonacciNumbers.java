import java.util.ArrayList;

public class BonusProject {
    public static ArrayList<Integer> fibList;

    public static int fib(int n) {
        if (fibList == null) {
            fibList = new ArrayList<Integer>();
            fibList.add(0);
            fibList.add(1);
        }
        if (n >= fibList.size()) {
            Integer a=fib(n-1)+fib(n-2);
            fibList.add(a);
            return a;
        }else{
            return fibList.get(n);
        }
    }
    public static void main(String[] args) {
        System.out.println(fib(5));
        System.out.println(fibList);
        System.out.println(fib(10));
        System.out.println(fibList);
    }
}
