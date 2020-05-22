package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        //Prints out each produce Item. Terminal operation.
        System.out.println("Produce Items");
        createStreamFromArray().forEach(System.out::println);

        List<ProduceItem> items = Arrays.asList(new ProduceItem("Orange",12,ProduceType.FRUIT),
                new ProduceItem("Lettuce",1,ProduceType.VEGTABLE));

        items.stream().map(item -> {
            item.setCost(21);
            return item;
        }).collect(Collectors.toList());

        items.forEach(System.out::println);











    }

    public static Stream<ProduceItem> createStreamFromArray(){

        ProduceItem[] items = {
                new ProduceItem("Apple",3.2, ProduceType.FRUIT),
                new ProduceItem("Squash", 7.77,ProduceType.VEGTABLE),
                new ProduceItem("Oranges", 10.99,ProduceType.FRUIT)

        };

        return Stream.of(items);
    }





}
