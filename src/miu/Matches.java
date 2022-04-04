package miu;

public class Matches {
    public static void main(String[] args) {

        int[] a = {1, 2, 3, -5, -5, 2, 3, 18};
        int[] p = {1, 1, 1, -1, -1, 2, 1};

        System.out.println(matches(a, p));
    }

    public static int matches(int[] a, int[] p){
        int pointer = 0;
        for (int i = 0; i < p.length; i++) {

            for (int j = 0; j < Math.abs(p[i]); j++) {
                if(p[i] > 0 && a[pointer] < 0){
                    return 0;
                }
                if(p[i] < 0 && a[pointer] > 0){
                    return 0;
                }
                pointer++;
            }
        }
        return 1;
    }
}
