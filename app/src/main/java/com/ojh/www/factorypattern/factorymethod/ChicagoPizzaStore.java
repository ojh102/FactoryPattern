package com.ojh.www.factorypattern.factorymethod;

import android.content.Context;

import com.ojh.www.factorypattern.abstractfactory.ChicagoPizzaIngredientFactory;
import com.ojh.www.factorypattern.abstractfactory.PizzaIngredientFactory;

/**
 * Created by JaeHwan Oh on 2016-05-24.
 */
public class ChicagoPizzaStore extends PizzaStore {
    public ChicagoPizzaStore(Context context) {
        super(context);
    }

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new ChicagoPizzaIngredientFactory();

        if(type.equals("cheese")) {
            pizza = new CheesePizza(mContext, ingredientFactory);
            pizza.setName("Chicago Style Cheese Pizza");
        } else if(type.equals("clam")) {
            pizza = new ClamPizza(mContext, ingredientFactory);
            pizza.setName("Chicago Style Clam Pizza");
        }

        return pizza;
    }
}
