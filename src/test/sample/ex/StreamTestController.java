package test.sample.ex;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<String> list = Arrays.asList("a1", "a2", "a3", "b1", "b2", "b3", "c1", "c2", "c3");
		
		
		list.stream().filter(s -> s.startsWith("c"))
				.map(String::toUpperCase)
				.sorted()
				.forEach(System.out::println);
		
		stremBuild();
			
	}
	
	public static void stremBuild() {
		
		Stream<String> builderStream = Stream.<String>builder()
											.add("java").add("oracle").add("mysql")
											.build();
		
		
		System.out.println("::::::::::::::::::");
		builderStream.forEach(System.out::println);
		
	}

}
