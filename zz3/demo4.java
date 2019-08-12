package zz3;

public class demo4 {
    public static void main(String[] args) {
        System.out.println(isSame(33,22));
        System.out.println("结果是："+sumNum(99));
    }
    public static boolean isSame(int a,int b){
        boolean result;
//        if(a==b){
//            result=true;
//        }
//        else{
//            result=false;
//        }
//        return result;
        return a==b;
    }

    public static int sumNum(int z){
        int sum=0;
        for(int i=0;i<z;i++){
            sum+=i;
        }
        return sum;
    }
}
