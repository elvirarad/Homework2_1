package HomeWork2_10;



import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args)  {
// "Задание 1"
        Predicate<Integer> testPlus = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 0;
            }
        };
        System.out.println(testPlus.test(14));
        System.out.println(testPlus.test(-54546));
        System.out.println("лямбда:");

        Predicate<Integer> testPlus1 = x -> x > 0;

        System.out.println(testPlus1.test(-14));
        System.out.println(testPlus1.test(-54546));

// "Задание 2"
        Consumer<String> name = new Consumer<String>() {
            @Override
            public void accept(String name) {
                System.out.println(name + ", привет");
            }
        };
        name.accept("Антон");

        System.out.println("лямбда:");
        Consumer<String> name2 = y -> System.out.println(y + ", привет");
        name2.accept("Алёна");

// "Задание 3"
        Function<Double, Long> roundLong = new Function<Double, Long>() {
            @Override
            public Long apply(Double num) {
                return Math.round(num);
            }
        };
        System.out.println(roundLong.apply(12.646));

        System.out.println("лямбда:");

        Function<Double, Long> roundLong1 = num -> Math.round(num) ;
        System.out.println(roundLong1.apply(2.646));

        // "Задание 4"

        Supplier<Integer> randomIn = new Supplier<Integer>() {
            @Override
            public Integer get() {
                Random random = new Random();
                return random.nextInt(100);
            }
        };
        System.out.println(randomIn.get());

        System.out.println("лямбда: ");
        Supplier<Integer> randomIn2 = () -> {
                Random random = new Random();
                return random.nextInt(100);
        };
        System.out.println(randomIn2.get());

        // "Задание 5"
        Predicate<Integer> even = e -> e % 2 == 0;
        Function<Integer, String> ifTrue = e -> "четное число";
        Function<Integer, String> ifFalse = e -> "нечетное число";
        Function<Integer, String> result = ternaryOperator(even, ifTrue, ifFalse);
        result.apply(15646);
        result.apply(15);
    }
    public static <T, U> Function <T, U> ternaryOperator(
            Predicate<? super T> condition,
            Function<? super T, ? extends U> ifTrue,
            Function<? super T, ? extends U> ifFalse){
        return t -> {
            U result = condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
            System.out.println(result);
            return result;
        };
    }
}
