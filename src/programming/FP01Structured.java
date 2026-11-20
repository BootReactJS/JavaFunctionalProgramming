package programming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args){

        printEvenNumbersInListLambda
                (
                        List.of(67,232,8987,12,45,74,-1)
                );
        /*printEvenNumbersInListFunctional
                (
                        List.of(67,232,8987,12,45,74,-1)
                );*/
        /*printAllNumbersInListFunctional
                (
                        List.of(67,232,8987,12,45,74,-1)
                );*/
        /*printAllNumbersInListStructured
                (
                   List.of(67,232,8987,12,45,74,-1)
                );*/
    }

    private static void  printEvenNumbersInListLambda(List<Integer> integers){
        integers.stream()
                .filter( number -> number %2 == 0)
                .forEach(System.out::println);
    }
    private static void  printEvenNumbersInListFunctional(List<Integer> integers){
        integers.stream()
                .filter(FP01Structured::evenMethod)
                .forEach(FP01Structured::printMethod);
    }



    private static void printAllNumbersInListFunctional(List<Integer> integers){
        integers.stream()
                .forEach(FP01Structured::printMethod);
    }

    private static void printAllNumbersInListStructured(List<Integer> integers) {
        for(int number: integers)
            System.out.println(number);
    }

    private static void printMethod(int no){
        System.out.println(no);
    }

    private static boolean evenMethod(int no){
        return no%2 == 0;
    }

}
