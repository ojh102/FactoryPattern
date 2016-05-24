package com.ojh.www.factorypattern.factorymethod;

import android.content.Context;

import com.ojh.www.factorypattern.abstractfactory.NYPizzaIngredientFactory;
import com.ojh.www.factorypattern.abstractfactory.PizzaIngredientFactory;

/**
 * Created by JaeHwan Oh on 2016-05-24.
 */
public class NYPizzaStore extends PizzaStore {
    public NYPizzaStore(Context context) {
        super(context);
    }

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();

        if(type.equals("cheese")) {
            pizza = new CheesePizza(mContext, ingredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if(type.equals("clam")) {
            pizza = new ClamPizza(mContext, ingredientFactory);
            pizza.setName("New York Style Clam Pizza");
        }

        return pizza;
    }
}
