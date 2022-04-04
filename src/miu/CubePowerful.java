package miu;

public class CubePowerful {
    public static void main(String[] args) {

        System.out.println(cubePowerful(370));
        System.out.println(cubePowerful(371));
        System.out.println(cubePowerful(-93));
    }

    public static int cubePowerful(int n){
        int sum = 0;
        int num = n;

        while (n > 0){
            int i = n % 10;
            sum += i * i * i;
            n /= 10;
        }

        return sum == num ? 1 : 0;
    }
}
