// Import statement:
import java.util.ArrayList;

class PrimeDirective {

    // Add your methods here:
    public boolean isPrime(int number){
        if (number == 2) {
            //     System.out.println("Number is 2");
            return true;
        }
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public ArrayList<Integer> onlyPrimes(int[] numbers) {
        ArrayList<Integer> primes = new ArrayList<>();
        for (int number : numbers) {
            if (isPrime(number)){
                primes.add(number);
            }
        }
        return primes;
    }

    public ArrayList<Integer> filter(ArrayList<Integer> number, boolean state){
        ArrayList<Integer> temp = new ArrayList<>(number);
        if (state){
            for(int i = 0; i < temp.size(); i++) {
                if (temp.get(i) % 2 != 0) {
                    temp.remove(i);
                }
            }
        } else {
            for(int i = 0; i < temp.size(); i++) {
                if (temp.get(i) % 2 == 0) {
                    temp.remove(i);
                }
            }
        }
        return temp;
    }

    public ArrayList<Integer> arrayListPrimes(int number){
        ArrayList<Integer> arrayListPrimes = new ArrayList<>();
//    System.out.println("Test");
        int i = 0;
        int help = 0;
        while(help < number) {
            if (isPrime(i)) {
                arrayListPrimes.add(i);
                //       System.out.println("Test" + arrayListPrimes);
                help++;
            }
            i++;
        }
        System.out.println("The first " + number + " prime-numbers are: ");
        return arrayListPrimes;
    }

    public ArrayList<Integer> fibonacciNumbers(int number) {
        ArrayList<Integer> arrayListFibonacci = new ArrayList<>();
        int help;
        System.out.println("Test");
        if (number <= 2){
            System.out.println("The first two Fibonacci-numbers are 0 and 1");
        }
        arrayListFibonacci.add(0);
        arrayListFibonacci.add(1);
        int i = 2;
        int j = 1;
        while(i <= number){
            help = (arrayListFibonacci.get(j)) + (arrayListFibonacci.get(j - 1));
            arrayListFibonacci.add(help);
            i++;
            j++;
        }

        return arrayListFibonacci;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        ArrayList<Integer> test = new ArrayList<>();
        for(int i = 0; i <= 20; i++) {
            test.add(i);
        }
        System.out.println(pd.isPrime(33));
        System.out.println(pd.onlyPrimes(numbers));
        System.out.println(test.toString());
        System.out.println(pd.filter(test, false));
        System.out.println(pd.arrayListPrimes(10));
        System.out.println(pd.fibonacciNumbers(20));
    }
}