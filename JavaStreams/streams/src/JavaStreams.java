import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {

    public static void main(String[] args) {
        /*
        // 1. Integer Stream
        IntStream
            .range(1, 10)
            .forEach(System.out::print);
        //123456789

        System.out.println();

        // 2. Integer Stream with skip
        IntStream
            .range(1, 10)
            .skip(5)
            .forEach(x -> System.out.print(x));
        //6789

        System.out.println();

        // 3. Integer Stream with sum
        System.out.print(
            IntStream
                .range(1, 5)
                .sum()
        );
        // 10

        System.out.println();

        // 4. Stream.of, sorted and findFirst
        Stream.of("Maria", "José", "Marcos", "Alberto")
                .sorted()
                .findFirst()
                .ifPresent(System.out::println);
        // Alberto


        // 5. Stream from Array, sort and filter
        String[] names = {"Annita", "Zelinda", "Alzira", "Kiko", "Zana"};
        Arrays.stream(names)
                //.peek(name -> System.out.println("Antes do filter: " + name)) // Debug
                .filter(x -> x.startsWith("Z"))
                .sorted()
                .forEach(System.out::println);

        //Zana
        //Zelinda


        // 6. Average of squares of an int array
        Arrays.stream(new int[] {2, 4, 6, 8, 10})
                .map(x -> x * x)
                .average()
                .ifPresent(System.out::println);
        // 44.0
        */

        // 7. Stream from List, filter and print
        List<String> people = Arrays.asList("Alex", "Bruno", "Sara" , "Amanda", "Hans");
        people
            .stream()
            .map(String::toLowerCase)
            .filter(x -> x.startsWith("a"))
            .forEach(System.out::println);

   }


}
