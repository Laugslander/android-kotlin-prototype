package nl.robinlaugs.kotlinprototype;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import nl.robinlaugs.kotlinprototype.adapter.CarAdapterJava;
import nl.robinlaugs.kotlinprototype.domain.CarJava;

public class MainActivityJava extends AppCompatActivity {

    private ListView listView;

    private final CarJava[] cars = new CarJava[]{
            new CarJava("Mercedes-Benz", "C-Class", 2016),
            new CarJava("Audi", "A3", 2015),
            new CarJava("Volvo", "V90", 2017)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bindViews();
        loadActivity();
    }

    private void bindViews() {
        listView = (ListView) findViewById(R.id.listView);
    }

    private void loadActivity() {
        CarAdapterJava adapter = new CarAdapterJava(getApplicationContext(), R.layout.list_item_car, cars);
        listView.setAdapter(adapter);
    }

}
