package com.nitin.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ClientTest {

	public static void main (String[] args)
	{
		List<Student> list = new ArrayList<>();
		list.add(new Student("Nitin",22));
		list.add(new Student("Ni",2));
		list.add(new Student("itin",223));
		list.add(new Student("Nitn",222));
		list.add(new Student("Niti",122));
		list.add(new Student("Niti",122));
	
	Stream<Student> parallelStream=list.parallelStream();
	System.out.println("Studentsdata");
	parallelStream.forEach(s->doProcess(s));
	
	}

	private static void doProcess(Student s) {
		// TODO Auto-generated method stub
		System.out.println(s);
	}
}
	
