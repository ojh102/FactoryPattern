package com.ojh.www.factorypattern.factorymethod;

import android.content.Context;

/**
 * Created by JaeHwan Oh on 2016-05-24.
 */
public abstract class PizzaStore {

    Context mContext;

    PizzaStore(Context context) {
        mContext = context;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
