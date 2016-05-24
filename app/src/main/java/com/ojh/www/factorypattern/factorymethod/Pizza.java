package com.ojh.www.factorypattern.factorymethod;

import android.content.Context;
import android.widget.Toast;

import com.ojh.www.factorypattern.abstractfactory.Cheese;
import com.ojh.www.factorypattern.abstractfactory.Clams;
import com.ojh.www.factorypattern.abstractfactory.Dough;
import com.ojh.www.factorypattern.abstractfactory.Pepperoni;
import com.ojh.www.factorypattern.abstractfactory.PizzaIngredientFactory;
import com.ojh.www.factorypattern.abstractfactory.Sauce;
import com.ojh.www.factorypattern.abstractfactory.Veggies;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by JaeHwan Oh on 2016-05-24.
 */
public abstract class Pizza {

    String name;
    Dough dough;
    Sauce sauce;
    Veggies veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;

    PizzaIngredientFactory ingredientFactory;

    Context mContext;

    public Pizza(Context context, PizzaIngredientFactory ingredientFactory) {
        mContext = context;
        this.ingredientFactory = ingredientFactory;
    }

    abstract void prepare();

    void bake() {
        Toast.makeText(mContext, "Bake for 25 minutes at 350", Toast.LENGTH_SHORT).show();
    }

    void cut() {
        Toast.makeText(mContext, "Cutting the pizza into diagonal slices", Toast.LENGTH_SHORT).show();
    }

    void box() {
        Toast.makeText(mContext, "Place pizza in official PizzaStore box", Toast.LENGTH_SHORT).show();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
