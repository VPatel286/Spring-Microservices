package programming;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {

        List<Integer> numbers = List.of(12,9,13,4,6,2,12,15);

       //printAllNumbersInListFunctional(numbers);
       //printEvenNumbersInListFunctional(numbers);
        printSquareOfEvenNumbersInListFunctional(numbers);

    }

//    private static void print(int number){
//        System.out.println(number);
//    }

//    private static boolean isEven(int number){
//        return number%2==0;
//    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers){
        //What to do?
        numbers.stream()
                .forEach(System.out::println); // Method Reference
    }


    // number -> number%2 == 0
    private static void printEvenNumbersInListFunctional(List<Integer> numbers){
        //What to do?

        numbers.stream()
                .filter(number -> number%2 == 0) // Lambda Expression
                .forEach(System.out::println); // Method Reference

        //  .filter(FP01Functional::isEven)  // Filter - Only even number allow
    }

    private static void printSquareOfEvenNumbersInListFunctional(List<Integer> numbers){
        //What to do?

        numbers.stream()
                .filter(number -> number%2 == 0) // Lambda Expression
                // Mapping - X -> X * X
                .map(number -> number * number)
                .forEach(System.out::println); // Method Reference

    }

}
