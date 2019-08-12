package zz3;

public class demo6 {
    public static void main(String[] args) {
        byte a=10;
        byte b=20;
        System.out.println(isSame(a,b));

    }
    public static boolean isSame(byte a,byte b){
        System.out.println("byte");
        boolean result;
        if(a==b){
            return true;
        }else{
            return false;
        }
    }

    public static boolean isSame(short a,short b) {
        System.out.println("short");
        boolean result;
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isSame(int a,int b) {
        System.out.println("int");
        boolean result;
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }
}
