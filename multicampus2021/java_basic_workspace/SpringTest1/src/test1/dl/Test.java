package test1.dl;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import my.model.Person;
import my.model.PersonImpl;

public class Test {

	public static void main(String[] args) {
		BeanFactory factory=new XmlBeanFactory(new FileSystemResource("person.xml"));
		
		Person p1=(Person) factory.getBean("Person1");
		System.out.println(p1.getName());
		
		Person p2=(Person) factory.getBean("Person2");
		System.out.println(p2.getName());
		
		Person p3=(Person) factory.getBean("Person3");
		System.out.println(p3.getName());
	}
}
