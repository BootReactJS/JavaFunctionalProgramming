package programming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

public class PlayingWithOptional {
    public static void main(String args[]){
        //List<String> fruits = List.of("apple","banana","mango");
        List<String> fruits =   Arrays.asList("apple","banana","mango");
        Predicate<? super String> predicate =
                fruit -> fruit.startsWith("b");
        Optional<String> first = fruits.stream()
                .filter(predicate)
                .findFirst();

        System.out.println(first.isEmpty());
        System.out.println(first.isPresent());
        System.out.println(first.get());


    }
}
