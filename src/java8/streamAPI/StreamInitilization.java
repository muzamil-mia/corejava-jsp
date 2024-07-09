package java8.streamAPI;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamInitilization {
	
	public static void main(String[] args) {
		
		
		
		//1. From Collection object
		List<String> list = Arrays.asList("one", "two", "three");
		
		//Stream init
		Stream<String> stream1 = list.stream();
		
		//Array of values
		String[] names = {"pne","two","three"};
		Stream<String> stream2 = Arrays.stream(names);
		
		//Stream methods
		Stream<String> stream3 = Stream.of("one","two","tree");
		
		//generic()
		Stream<String> stream4 =  Stream.generate(() -> "one");
		
		//builder()
		    Stream.Builder<String> streamBuilder = Stream.builder();
		   Stream<String> stream5 =  streamBuilder.add("one").add("two").add("three").build();
		   
		   //Empty Stream
		   //empty()
		   
		   Stream<String> stream6 = Stream.empty(); 
;	}
}
