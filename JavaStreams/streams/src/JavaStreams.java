import java.util.stream.IntStream;

public class JavaStreams {

    public static void main(String[] args) {

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

    }


}
