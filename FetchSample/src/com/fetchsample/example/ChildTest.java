package com.fetchsample.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fetchsample.example.dao.ChildDAO;
import com.fetchsample.example.domain.Child;
import com.fetchsample.example.domain.Toy;

public class ChildTest {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/fetchsample/example/spring-context.xml");

		/**
		 * First we initialize a child
		 */
		Child child = new Child();

		/**
		 * A cool ben 10 action figure
		 */
		Toy ben10 = new Toy();
		ben10.setToyName("Ben 10 figure");

		/**
		 * A even more cooler spider man action figure
		 */
		Toy spiderMan = new Toy();
		spiderMan.setToyName("Spider man figure");

		child.setChildName("John");
		/**
		 * Add the toys to the collection
		 */
		child.addToy(ben10);
		child.addToy(spiderMan);

		ChildDAO childDAO = (ChildDAO) context.getBean("childDAO");

		childDAO.persistChild(child);

		Child childWithoutToys = childDAO.getChildByIdWithoutToys(1L);
		// The following line will throw a lazy initialization error since we
		// have
		// defined fetch type as LAZY in the Child domain class.
		// System.out.println(childWithToys.getToyList().size());

		Child childWithToys = childDAO.getChildByIdWithToys(1L);
		System.out.println(childWithToys.getToyList().size());

		Child childByNameWithToys = childDAO.getChildByNameWithToys("John");

		System.out.println(childByNameWithToys.getToyList().size());
		
		System.out.println(childWithoutToys.getChildName());

	}
}
