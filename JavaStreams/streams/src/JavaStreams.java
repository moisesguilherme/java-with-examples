import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {

    public static void main(String[] args) throws IOException {
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


        // 7. Stream from List, filter and print
        List<String> people = Arrays.asList("Alex", "Bruno", "Sara" , "Amanda", "Hans");
        people
            .stream()
            .map(String::toLowerCase)
            .filter(x -> x.startsWith("a"))
            .forEach(System.out::println);


        // 8. Stream rows form text file, sort, filter and print
        Stream<String> bands = Files.lines(Paths.get("bands.txt"));
        bands
           .sorted()
           .filter(x -> x.length() > 13)
           .forEach(System.out::println);
        bands.close();
        //The Allman Brothers
        //The Rolling Stones
        //The Rolling Stones

        //9. Stream rows from txt file and save to List
        List<String> bands2 = Files.lines(Paths.get("bands.txt"))
                .filter(x -> x.contains("The"))
                .collect(Collectors.toList());

        bands2.forEach(x -> System.out.println(x));
        //The Beatles
        //The Rolling Stones
        //The Allman Brothers
        //The Rolling Stones
        */

        //10. Stream rows from CSV file and count
        Stream<String> rows1 = Files.lines(Paths.get("data.txt"));
        int rowCount = (int) rows1
                .map(x -> x.split(","))
                .filter(x -> x.length == 3)
                .count();

        System.out.println(rowCount + " rows.");
        rows1.close();
   }


}
