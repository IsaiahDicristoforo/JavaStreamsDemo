package Streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Integer[] randomAges = {10,20,19,32};

        List<String> ages = Stream.of(randomAges) //We start out with a stream of ints than print switch to a stream of strings
                .map(age -> "Age: " + age)
                .collect(Collectors.toList());
        ages.forEach(System.out::println);

        //Map accepts a function, peek accepts a consumer.

        Stream<Integer> infiniteStream = Stream.iterate(2, i -> i * 2);

        List<Integer> collect = infiniteStream
                .skip(3)
                .limit(5)
                .peek(System.out::println)
                .collect(Collectors.toList());


        Stream<Integer> fizzBuzzStream = Stream.iterate(1,i -> i + 1);

        System.out.println("Max is: " + fizzBuzzStream
                .limit(100)
                .max((num1, num2) -> num1 - num2)
                .get());

        List<ProduceItem> produceItems = Arrays.asList(
                new ProduceItem("Apple",12.99,ProduceType.FRUIT),
                new ProduceItem("Squash",20.99,ProduceType.VEGTABLE),
                new ProduceItem("Nuts",2,ProduceType.OTHER)
                );
        System.out.println("The most expensive produce item is the " + produceItems.stream().max(Comparator.comparingDouble(ProduceItem::getCost)).get().getName());
        System.out.println("The least expensive produce item is the " + produceItems.stream().min(Comparator.comparingDouble(ProduceItem::getCost)).get().getName());

        System.out.println("The average price is " + produceItems.stream().mapToDouble(ProduceItem::getCost).average().getAsDouble());
        System.out.println("The sum of all the produce items is " + produceItems.stream().mapToDouble(ProduceItem::getCost).sum());




















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
