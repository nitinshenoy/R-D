package com.nitin.client;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import com.nitin.model.Person;

public class ReferenceToInstanceMethodinLambda {

	public static void main(String[] args) {

		List<Person> persons = new ArrayList<>();
		persons.add(new Person("Goku", 27));
		persons.add(new Person("Deadpool", 21));
		persons.add(new Person("Hulk", 45));
		persons.add(new Person("Vegeta", 27));
		
		
	List<String> personNames =ReferenceToInstanceMethodinLambda.getPersonsName(persons,Person::getName);
	personNames.forEach(System.out::println);
	}

	private static List<String> getPersonsName(List<Person> persons, Function<Person, String> f) {
		List<String> results  = new ArrayList<>();
		persons.forEach(n->results.add(f.apply(n)));
		return results;
	}

}
