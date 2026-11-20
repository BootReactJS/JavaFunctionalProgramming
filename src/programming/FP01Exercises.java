package programming;

import java.util.List;

public class FP01Exercises {
    public static void main(String[] args){

        List<String> courses = List.of(
                "Core Java","SpringBoot","AWS"
        );
        printCharsCourse(courses);
        //printCoursesLetters4(courses);
        //printSpringCoursesLambda(courses);
        //printAllCoursesLambda(courses);
        /*printOddNumbersInListLambda
                (
                        List.of(67,232,8987,12,45,74,-1)
                );*/
        //printSquaresEvened(List.of(67,232,8987,12,45,74,-1));
        //printCubesOdded(List.of(67,232,8987,12,45,74,-1));

    }

    private static void printCharsCourse(List<String> courses) {
        courses.stream()
                .map(course -> course.length())
                .forEach(System.out::println);
    }

    private static void printCubesOdded(List<Integer> integers) {
        integers.stream()
                .filter( number -> number%2 !=0)
                .map(number -> number*number*number)
                .forEach(System.out::println);
    }

    private static void printSquaresEvened(List<Integer> integers) {
        integers.stream()
                .filter(number -> number%2 == 0)
                .map( number -> number*number)
                .forEach(System.out::println);
    }

    private static void printCoursesLetters4(List<String> courses) {
        courses.stream()
                .filter( course -> course.length() >= 4)
                .forEach(System.out::println);
    }

    private static void printSpringCoursesLambda(List<String> courses) {
        courses.stream()
                .filter( course -> course.contains("Spring"))
                .forEach(System.out::println);
    }

    private static void printAllCoursesLambda(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }
    private static void  printOddNumbersInListLambda(List<Integer> integers){
        integers.stream()
                .filter( number -> number %2 != 0)
                .forEach(System.out::println);
    }




}
