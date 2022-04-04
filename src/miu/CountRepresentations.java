package miu;

public class CountRepresentations {
    public static void main(String[] args) {

        System.out.println(countRepresentations(35));
    }

    public static int countRepresentations(int numRupees) {

        int[] combinations = new int[numRupees + 1];
        combinations[0] = 1;
        int[] moneyBills = {1, 2, 5, 10, 20};

        for (int bill: moneyBills){
            for (int i = bill; i <= numRupees; i++) {
                combinations[i] += combinations[i - bill];
            }
        }
        return combinations[numRupees];
    }
}
