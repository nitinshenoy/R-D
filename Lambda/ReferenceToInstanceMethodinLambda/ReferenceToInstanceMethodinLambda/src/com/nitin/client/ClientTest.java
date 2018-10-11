package com.nitin.client;

import java.util.ArrayList;
import java.util.List;

public class ClientTest {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("Goku");
		names.add("Vegeta");
		names.add("Deadpool");
		names.add("Nitin");
		names.add("Hulk");
		
		//names.forEach(x->System.out.println(x));
		names.forEach(System.out::println);
	}

}
