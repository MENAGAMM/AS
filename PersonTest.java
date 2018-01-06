package com.capgemini.lab5.jUnit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import com.capgemini.lab5.Person;

class PersonTest {

	@Test
	void testGetFirstName() {
		
		Person person = new Person("abc", "def");
		assertEquals("abc", person.getFirstName());
	}

	@Test
	void testGetLastName() {
		Person person = new Person("abc", "def");
		assertEquals("def", person.getLastName());
	}
	
	@Test
	void negativeTestFirstName() {
		Person person = new Person("abc", "def");
		assertNotEquals("xyz", person.getFirstName());
		
	}
	
	@Test 
	void negativeTestLastName() {
		Person person = new Person("abc", "def");
		assertNotEquals("kml", person.getLastName());
	}

}
