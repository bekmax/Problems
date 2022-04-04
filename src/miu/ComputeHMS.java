package miu;

public class ComputeHMS {
    public static void main(String[] args) {

        int[] hms = computeHMS(380);

        System.out.println("H: "+hms[0]);
        System.out.println("M: "+hms[1]);
        System.out.println("S: "+hms[2]);
    }

    public static int[] computeHMS(int n){
        int[] result = new int[3];

        result[2] = n % 60;
        n /= 60;
        result[1] = n % 60;
        n /= 60;
        result[0] = n % 60;

        return result;
    }
}
