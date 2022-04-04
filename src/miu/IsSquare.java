package miu;

public class IsSquare {
    public static void main(String[] args) {

        System.out.println(isSquare(0));
        System.out.println(isSquare(1));
        System.out.println(isSquare(2));
        System.out.println(isSquare(3));
        System.out.println(isSquare(4));
        System.out.println(isSquare(5));
    }

    public static int isSquare(int n){

        if(n < 0) return 0;

        for (int i = 0; i <= n; i++) {
            if (i*i == n){
                return 1;
            }
        }
        return 0;
    }
}
