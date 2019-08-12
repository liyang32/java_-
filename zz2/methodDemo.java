package zz2;

public class methodDemo {
    public static void main(String[] args) {
        method();
        System.out.println("==========");
        System.out.println(sum(20,30));
//        int result=sum(3,4);
//        System.out.println(result);
    }

    public static void method() {
        for(int i=0;i<5;i++){
            for(int j=0;j<20;j++){
                System.out.print("*");
            }
            System.out.println("");
        }

    }

    public static int sum(int a,int b){
        int sum=a+b;
        System.out.println("have done");
        return sum;

    }
}
