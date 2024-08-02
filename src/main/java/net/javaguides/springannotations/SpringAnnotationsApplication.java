package net.javaguides.springannotations;

import net.javaguides.springannotations.configurationproperties.AppPropertiesDemo;
import net.javaguides.springannotations.controller.MyController;
import net.javaguides.springannotations.controller.PizzaController;
import net.javaguides.springannotations.propertysource.PropertySourceDemo;
import net.javaguides.springannotations.repository.MyRepository;
import net.javaguides.springannotations.service.MyService;
import net.javaguides.springannotations.value.ValueAnnotationDemo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class SpringAnnotationsApplication {

	public static void main(String[] args) {

		var context = SpringApplication.run(SpringAnnotationsApplication.class, args);

//     	PizzaController pizzaController = (PizzaController) context.getBean("pizzaController");
//		System.out.println(pizzaController.getPizza());

//		MyController myController = context.getBean(MyController.class);
//		System.out.println(myController.hello());
//
//		MyService myService = context.getBean(MyService.class);
//		System.out.println(myService.hello());
//
//		MyRepository myRepository = context.getBean(MyRepository.class);
//		System.out.println(myRepository.hello());
//
//		ValueAnnotationDemo valueAnnotationDemo = context.getBean(ValueAnnotationDemo.class);
//		System.out.println(valueAnnotationDemo.getDefaultName());
//		System.out.println(valueAnnotationDemo.getEmail());
//		System.out.println(valueAnnotationDemo.getHost());
//		System.out.println(valueAnnotationDemo.getPassword());
//		System.out.println(valueAnnotationDemo.getJava_home());
//		System.out.println(valueAnnotationDemo.getHomeDir());


//		VegPizza vegPizza = (VegPizza) context.getBean("vP");
//		System.out.println(vegPizza.getPizza());
//
//		NonVegPizza nonVegPizza = (NonVegPizza) context.getBean("nonVP");
//		System.out.println(nonVegPizza.getPizza());

		PropertySourceDemo propertySourceDemo = context.getBean(PropertySourceDemo.class);
		System.out.println(propertySourceDemo.getEmail());
		System.out.println(propertySourceDemo.getHost());
		System.out.println(propertySourceDemo.getPassword());
//		System.out.println(propertySourceDemo.getAppName());
//		System.out.println(propertySourceDemo.getAppDesc());

		AppPropertiesDemo appPropertiesDemo = (AppPropertiesDemo) context.getBean("appPropertiesDemo");
		appPropertiesDemo.display();

	}

}
