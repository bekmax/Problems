package miu;

public class Mercurial {
    public static void main(String[] args) {

        int[] a = {1,3,3,5,1,2,9};

        System.out.println(isMercurial(a));
    }

    public static int isMercurial(int[] a) {
        int startIndex = 0;
        int endIndex = a.length - 1;

        if (a.length == 0 || a.length == 1) return 1;

        while (startIndex < endIndex) {
            if (a[startIndex] == 1 && a[endIndex] == 1) {
                break;
            } else if (a[startIndex] == 1 || a[endIndex] == 1) {
                if (a[startIndex] == 1) endIndex--;
                if (a[endIndex] == 1) startIndex++;
            } else {
                startIndex++;
                endIndex--;
            }
        }

        if (startIndex == endIndex) return 0;

        for (int i = startIndex + 1; i < endIndex; i++) {
            if (a[i] == 3) return 0;
        }
        return 1;
    }
}
