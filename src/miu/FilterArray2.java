package miu;

public class FilterArray2 {
    public static void main(String[] args) {

        int[] a = {1, 2, 7, 3, 9, 6, 11};

        System.out.println(isFilter(a));
    }

    public static int isFilter(int[] a) {
        boolean does9Exist = false;
        boolean does11Exist = false;
        boolean does7Exist = false;
        boolean does13Exist = false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 9) does9Exist = true;
            if (a[i] == 11) does11Exist = true;
            if (a[i] == 7) does7Exist = true;
            if (a[i] == 13) does13Exist = true;
        }

        if (does9Exist && !does11Exist) return 0;
        if (!does9Exist && does11Exist) return 0;

        if (does7Exist && does13Exist) return 0;

        return 1;
    }
}
