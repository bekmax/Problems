package miu;

public class ClusterCompression {
    public static void main(String[] args) {

        int[] a = {2, 2, 2, 3, 3, 4, 6, 6, 2, 4};

        for (int n : clusterCompression(a)) {
            System.out.print(n +" ");
        }
    }

    public static int[] clusterCompression(int[] a) {
        int numClusters = 1;
        int index = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] != a[i]) {
                numClusters++;
            }
        }

        int[] result = new int[numClusters];
        result[index++] = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i - 1] != a[i]) {
                result[index++] = a[i];
            }
        }

        return result;
    }
}
