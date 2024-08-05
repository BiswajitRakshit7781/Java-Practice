package coreJava.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numberList = new ArrayList<>();
        numberList.add(10);
        numberList.add(20);
        numberList.add(30);
        numberList.add(40);
        List<Integer> squareList = numberList.stream().map(x -> x*x).toList();
        System.out.println("Square List : "+ squareList);
        Set<Integer> squareSet = numberList.stream().map(x -> x*x).collect(Collectors.toSet());
        System.out.println("Square Set : "+ squareSet);
//        int sum = numberList.stream().reduce(0,(ans,i) -> ans+i);
        int sum = numberList.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        ArrayList<String> languages = new ArrayList<>();
        languages.add("java");
        languages.add("python");
        languages.add("scala");
        languages.add("kotlin");
        List<String> languagesFilter = languages.stream().filter(s->s.startsWith("p")).toList();
        System.out.println("Languages starts with p : " + languagesFilter);
        List<String> sorted = languages.stream().sorted().toList();
        System.out.println("Sorted List : "+ sorted);
        System.out.println("Printing all elements :");
        languages.forEach(x -> System.out.println("Elements is : "+ x));
    }
}
