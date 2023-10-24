import org.example.Myprog;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        Myprog  myprog=new Myprog();
        //creation de la liste
        int n = 50;

        List<Integer> list = IntStream.range(1, n + 1)
                .boxed()
                .collect(Collectors.toList());

         list.stream().map(
                i -> myprog.divisibleby(i)
        ).forEach(
                s -> System.out.println(" "+s));


    }
}