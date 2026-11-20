package declarative;

import java.util.List;

public class FP02Functional {

    public static void main(String[] args){
        List<Integer> list = List.of(67,232,8987,12,45,74,-1);
        System.out.println( addList(list) );
    }

    private static int addList(List<Integer> numbers){
        return numbers.stream().reduce(0, Integer::max);
    }

}
