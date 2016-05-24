package com.ojh.www.factorypattern.factorymethod;

import android.content.Context;
import android.widget.Toast;

import com.ojh.www.factorypattern.abstractfactory.PizzaIngredientFactory;

/**
 * Created by JaeHwan Oh on 2016-05-24.
 */
public class ClamPizza extends Pizza {
    public ClamPizza(Context context, PizzaIngredientFactory ingredientFactory) {
        super(context, ingredientFactory);
    }

    @Override
    void prepare() {
        Toast.makeText(mContext, "Preparing "+name, Toast.LENGTH_SHORT).show();
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clams = ingredientFactory.createClam();
    }
}
