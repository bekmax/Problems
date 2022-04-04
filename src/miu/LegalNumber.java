package miu;

public class LegalNumber {
    public static void main(String[] args) {

        int[] a = {0,1,1,1};
        int base = 2;

        System.out.println(isLegalNumber(a, base));

        System.out.println(convertToBase10(a, base));
    }

    public static int isLegalNumber(int[] a, int base){

        for (int i = 0; i < a.length; i++) {
            if (a[i] >= base){
                return 0;
            }
        }
        return 1;
    }

    public static int convertToBase10(int[] a, int base){
        if(isLegalNumber(a, base) == 0){
            return 0;
        }

        int result = 0;
        int power = 0;
        for (int i = a.length-1; i >=0; i--) {
            result += a[i] * (int) Math.pow(base, power++);
        }

        return result;
    }
}
