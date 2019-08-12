package zz2;

public class demo2 {
    public static void main(String[] args) {
        method1();
        System.out.println("============");
        method2(3,8);

    }

    public static void method2(int a, int b){
        int sum=a=b;
        System.out.println("the result is:"+sum);
    }

    public static void method1() {
        for(int i=0;i<10;i++){
            System.out.println("hi,there!");
        }
    }
}
