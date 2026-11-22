package declarative;

import java.util.Random;
import java.util.function.BiPredicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class FP03FunctionalInterfaceP2 {
    static Supplier<Integer> randomIntSupplier = () -> {
        Random random = new Random();
        return random.nextInt();
    };
    static UnaryOperator<Integer> unaryOps= (x) ->
            x*3;

    static BiPredicate<Integer, String> bipredicateOps= (number, str) ->
        number <10 && str.length()>5;

    public static void main(String[] args){
        //System.out.println(bipredicateOps.test(5, "in28minutes"));

        //System.out.println(randomIntSupplier.get());

        //System.out.println(unaryOps.apply(4));



    }
}
