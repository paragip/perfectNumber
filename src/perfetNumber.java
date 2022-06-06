public class perfetNumber {

    public static void main(String[] args) {
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number){

        int sum = 0;

        if (number<1) {
            return false;
        } else {

            for (int i = 1; i <= number/2; i++) {
                if (number % i == 0) {
                    sum += i;
                }
            }
            if (number == sum) {
                return true;
            } else {
                return false;
            }

        }

    }

}
