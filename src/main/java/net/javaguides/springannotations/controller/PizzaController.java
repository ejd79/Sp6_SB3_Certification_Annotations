package net.javaguides.springannotations.controller;

import net.javaguides.springannotations.service.Pizza;

/**
 * Examples of Inject Spring Beans using @Autowired Annotations at one
 * of the following types: Constructor, Setter, or Fields.
 * <p>
 * In order to guarantee loose coupling it is better to use "Interfaces" instances.
 * We must to use @Qualifier to set the Instance to be instantiated, in case to be more than one
 */

public class PizzaController {

    private Pizza pizza;

    public PizzaController(Pizza pizza) {
        this.pizza = pizza;
    }

    public String getPizza() {
        return pizza.getPizza();
    }

    public void init(){
        System.out.println("Initialization logic");
    }

    public void destroy() {
        System.out.println("Destruction logic");
    }
}
