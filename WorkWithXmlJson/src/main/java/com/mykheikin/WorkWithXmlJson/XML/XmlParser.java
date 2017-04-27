package com.mykheikin.WorkWithXmlJson.XML;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class XmlParser {

	// // Initialize the employees list
	// static Employees employees = new Employees();
	// static {
	// employees.setEmployees(new ArrayList<Employee>());
	// // Create two employees
	// Employee emp1 = new Employee();
	// emp1.setId(1);
	// emp1.setFirstName("Lokesh");
	// emp1.setLastName("Gupta");
	// emp1.setIncome(100.0);
	//
	// Employee emp2 = new Employee();
	// emp2.setId(2);
	// emp2.setFirstName("John");
	// emp2.setLastName("Mclane");
	// emp2.setIncome(200.0);
	//
	// // Add the employees in list
	// employees.getEmployees().add(emp1);
	// employees.getEmployees().add(emp2);
	// }

	private static void marshalingExample(Object ob, File file) throws JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(ob.getClass());
		Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

		jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

		// Marshal the employees list in console
		jaxbMarshaller.marshal(ob, System.out);

		// Marshal the employees list in file
		jaxbMarshaller.marshal(ob, file);
		System.out.println("Marshaller is copleted...");
	}

	private static Object unMarshalingExample(Object ob, File file) throws JAXBException {

		JAXBContext jaxbContext = JAXBContext.newInstance(ob.getClass());
		Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		
		System.out.println("Unmarshaller is copleted...");
		// We had written this file in marshalling example
		return jaxbUnmarshaller.unmarshal(file);
		
	}

	public static void main(String[] args) throws Exception {

		File file = new File(
				"C:\\Users\\User\\workspace\\WorkWithXmlJson\\src\\main\\java\\com\\mykheikin\\WorkWithXmlJson\\XML\\cars.xml");
		Cars cars = new Cars();
		
		Car car = new Car();
		car.setId(1);
		car.setYear(2001);
		car.setCarName("Mercedes");
		car.setColor("Red");
		
		Car car2 = new Car();
		car2.setId(2);
		car2.setYear(2000);
		car2.setCarName("Subaru");
		car2.setColor("green");
		
		cars.getCars().add(car);
		cars.getCars().add(car2);
		
		marshalingExample(cars, file);
	}

}
