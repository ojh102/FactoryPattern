package com.ojh.www.factorypattern;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ojh.www.factorypattern.factorymethod.ChicagoPizzaStore;
import com.ojh.www.factorypattern.factorymethod.NYPizzaStore;
import com.ojh.www.factorypattern.factorymethod.Pizza;
import com.ojh.www.factorypattern.factorymethod.PizzaStore;

public class MainActivity extends AppCompatActivity {

    Button btnNY, btnChicago;
    Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mContext = this;

        btnNY = (Button)findViewById(R.id.btnNY);
        btnNY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PizzaStore nyStore = new NYPizzaStore(mContext);
                Pizza pizza = nyStore.orderPizza("cheese");
                Toast.makeText(mContext, "JaeHwan ordered a  "+pizza.getName(), Toast.LENGTH_SHORT).show();
            }
        });

        btnChicago = (Button)findViewById(R.id.btnChicago);
        btnChicago.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PizzaStore chicagoStore = new ChicagoPizzaStore(mContext);
                Pizza pizza = chicagoStore.orderPizza("cheese");
                Toast.makeText(mContext, "JaeHwan ordered a  "+pizza.getName(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}
