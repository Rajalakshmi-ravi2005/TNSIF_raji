package day8_streamapi;

import java.util.*;
import java.util.stream.Collectors;

public class StreamApiDemo {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        // <> Generics and inside it we are defining the data types
        // asList is a built-in method used for converting the array into the list

        List<Integer> evenSquares = numbers.stream() // built-in method numbers.stream()
        		// evenSquares is the variable used to store the below operations and .stream() is used for filter, map and collections.
                .filter(n -> n % 2 == 0)       // keep even numbers
                .map(n -> n * n)               // square them
                .collect(Collectors.toList()); // collect into list

        System.out.println("Even Squares: " + evenSquares);
    }
}
