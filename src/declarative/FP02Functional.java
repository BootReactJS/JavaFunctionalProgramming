package declarative;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FP02Functional {

    static void main(String[] args){
        methodNumbersStream();
        //List<Integer> list = List.of(67,232,8987,12,45,74,-1);
        //System.out.println( addList(list) );
        methodStringStream();
        //methodFileStream();

    }

    private static void methodFileStream() {
        try (
                Stream<String> strStrm =
                        Files.lines(Paths.get("./FP02Functional.java"));
                // strStrm.forEach(System.out::println)
        ) {
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

    private static void methodStringStream() {
        Stream.Builder<String> s = Stream.builder();
        Stream<String> sb = s.add("Java").add("Javascript").add("JSX").build();
        sb.forEach(System.out::println);

    }

    private static void methodNumbersStream() {
        //Stream<Integer> nosStream = Stream.of(10,20,30,40);
        IntStream nosStream = Arrays.stream(new int[] {10,20,30});
        nosStream.forEach(System.out::println);
        Stream<Double> dblS = Stream.generate(Math::random).limit(6);
        dblS.forEach(System.out::println);
        IntStream.range(1,5).forEach(System.out::println);
        System.out.println("===");
        IntStream.rangeClosed(1,5).forEach(System.out::println);

    }

    private static int addList(List<Integer> numbers){
        return numbers.stream().reduce(0, Integer::max);
    }


}
