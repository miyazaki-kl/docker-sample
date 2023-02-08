public class Fizzbuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    public static void printSosu(){
        int count = 0;
        for (int i = 2; i <= 10000; i++) {
            boolean isSosu = true;
            for (int j = 2; j < i; j++) {
                count++;
                if (i % j == 0) {
                    isSosu = false;
                    break;
                }
            }
            if (isSosu) {
                System.out.println(i);
            }
        }
        System.out.println("count: " + count);
    }
}
