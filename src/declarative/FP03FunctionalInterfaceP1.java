package declarative;

import java.util.List;
import java.util.function.*;

public class FP03FunctionalInterfaceP1 {

    public static void main(String[] args){

        Predicate<Integer> evenPredicate = x -> x%2 == 0;

        Function<Integer,Integer> squareFunction = x -> x*x ;

        Consumer<Integer> sysoutConsumer =  System.out::println;

        List<Integer> list = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);

       /* list.stream()
                .filter(evenPredicate)
                .map(squareFunction)
                .forEach(System.out::println);*/


        BinaryOperator<Integer> sumBN = Integer::sum;
        int sum = list.stream()
                .reduce(0,sumBN);
        //System.out.println(sum);

    }


}
