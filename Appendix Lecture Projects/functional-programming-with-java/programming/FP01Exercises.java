package programming;

import java.util.List;

public class FP01Exercises {

    public static void main(String[] args) {

          List<Integer> numbers = List.of(12,9,13,4,6,2,12,15);
//        printOddNumbersInListFunctional(numbers);
          printCubeOfOddNumbersInListFunctional(numbers);

        List<String> courses =
                List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

//        Courses.stream()
//                .forEach(System.out::println);

//        courses.stream()
//                .filter(course -> course.contains("Spring"))
//                .forEach(System.out::println);

//        courses.stream()
//                .filter(course -> course.length() >= 4)
//                .forEach(System.out::println);

        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);

    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers){

        numbers.stream() // Convert to Stream
                .filter(number -> number%2 != 0) // Lambda Expression
                .forEach(System.out::println); // Method Reference
    }


    private static void printCubeOfOddNumbersInListFunctional(List<Integer> numbers){
        //What to do?

        numbers.stream()
                .filter(number -> number%2 != 0) // Lambda Expression
                // Mapping - X -> X * X * X
                .map(number -> number * number * number)
                .forEach(System.out::println); // Method Reference
    }

}
