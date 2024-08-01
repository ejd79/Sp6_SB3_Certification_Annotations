package net.javaguides.springannotations.config;

import net.javaguides.springannotations.controller.PizzaController;
import net.javaguides.springannotations.service.NonVegPizza;
import net.javaguides.springannotations.service.Pizza;
import net.javaguides.springannotations.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * We can define Spring Beans definitions using @Bean annotation
 */
@Configuration
public class AppConfig {

    /**
     * The @Bean annotation tells Spring IoC Container to manage VegPizza object
     */
//    @Bean(name = "vP")
    public Pizza vegPizza() {
        return new VegPizza();
    }

//    @Bean(name = "nonVP")
    public Pizza nonVegPizza(){
        return new NonVegPizza();
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController() {
        return new PizzaController(nonVegPizza());
    }
}
