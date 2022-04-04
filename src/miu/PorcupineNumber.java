package miu;

public class PorcupineNumber {
    public static void main(String[] args) {

        System.out.println(findPorcupineNumber(409));
    }

    public static int findPorcupineNumber(int n) {
        int number = n;
        int nextNumber;
        int result;
        boolean search1 = true;
        boolean search2 = false;

        while (search1){
            number += 1;

            if(isPrime(number) && number % 10 == 9){
                nextNumber = number + 1;
                search2 = true;

                while (search2){
                    nextNumber += 1;

                    if (isPrime(nextNumber)){
                        if (nextNumber % 10 == 9){
                            result = number;
                            search1 = false;
                        }
                        search2 = false;
                    }
                }
            }
        }
        return number;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
