package zz2;

public class demo3 {
    public static void main(String[] args) {
        int num=method4(5,6);
        System.out.println("返回值是："+num);
        method3(5,6);

    }

    public static void method3(int a,int b){
        int result=a+b;
        System.out.println("结果是："+result);
    }

    public static int method4(int a,int b) {
        int result=a+b;
        return result;
    }
}
