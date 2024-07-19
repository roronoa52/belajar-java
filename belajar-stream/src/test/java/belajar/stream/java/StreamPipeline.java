package belajar.stream.java;

import org.junit.jupiter.api.Test;

import java.util.List;

public class StreamPipeline {

    @Test
    void testCreateStreamPipelineOk() {
        List<String> list = List.of("Farhan", "Yudha", "Pratama");

        list.stream()
                .map(name -> name.toUpperCase())
                .map(upper -> "Mr." + upper)
                .forEach(System.out::println);
    }

}
