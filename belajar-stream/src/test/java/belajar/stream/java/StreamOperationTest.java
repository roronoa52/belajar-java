package belajar.stream.java;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Stream;

public class StreamOperationTest {

    @Test
    void testStreamOperation() {

        List<String> names = List.of("Farhan", "Yudha", "Pratama");

        Stream<String> streamNames = names.stream();
        Stream<String> streamUpper = streamNames.map(name -> name.toUpperCase());

        streamUpper.forEach(System.out::println);

        var resultFilter = names.stream().filter( name -> name.equals("Farhan") );
        resultFilter.forEach(System.out::println);

    }

}
