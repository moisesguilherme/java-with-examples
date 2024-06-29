import java.util.stream.IntStream;

public class JavaStreams {

    public static void main(String[] args) {

        // 1. Integer Stream
        IntStream
              .range(1, 10)
              .forEach(System.out::print);
    }
    //output
    //123456789
}
