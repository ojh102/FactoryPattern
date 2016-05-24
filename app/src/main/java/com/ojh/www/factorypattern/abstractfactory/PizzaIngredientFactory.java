package com.ojh.www.factorypattern.abstractfactory;

/**
 * Created by JaeHwan Oh on 2016-05-24.
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClam();
}
