package HomeWork2_11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        //стримы
        // задача 1
        List<Integer> integerList = new ArrayList<>();
        integerList.add(154);
        integerList.add(7);
        integerList.add(33);
        integerList.add(-12);
        integerList.add(61);
        integerList.add(13);
        integerList.add(120);
        integerList.add(21);
        integerList.add(44);
        Stream<Integer> integerStream = integerList.stream();
        System.out.println(integerList);
        findMinMax(integerStream, Integer::compareTo,
                (x, y) -> System.out.println("Минимальное значение в стриме: " + x +
                        "   Максимальное  значение в стриме: " + y));

        // задача 2
        countEvenNumbers(integerList);
    }
    public static <T> void findMinMax (Stream<? extends T> stream,
                                       Comparator<? super T> order,
                                       BiConsumer<? super T, ? super T> minMaxConsumer){
        List<T> arrayList;
        T min = null;
        T max = null;
        arrayList = stream
                .sorted(order)
                .collect(Collectors.toList());
        if (arrayList.size() != 0){
            min = arrayList.get(0);
            max = arrayList.get(arrayList.size() - 1);
        }
        minMaxConsumer.accept(min, max);
    }
    public static void countEvenNumbers(List<Integer> list){
        System.out.println("Количество чётных чисел: " + list.stream()
                .filter(x -> x%2 == 0)
                .count());
    }
}
