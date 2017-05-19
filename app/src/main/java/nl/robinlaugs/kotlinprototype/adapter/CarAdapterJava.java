package nl.robinlaugs.kotlinprototype.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import nl.robinlaugs.kotlinprototype.R;
import nl.robinlaugs.kotlinprototype.adapter.viewholder.CarViewHolderJava;
import nl.robinlaugs.kotlinprototype.domain.CarJava;

public class CarAdapterJava extends ArrayAdapter<CarJava> {

    private CarJava[] cars;

    public CarAdapterJava(Context context, int resource, CarJava[] cars) {
        super(context, resource, cars);

        this.cars = cars;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(parent.getContext());
            view = inflater.inflate(R.layout.list_item_car, parent, false);

            CarViewHolderJava viewHolder = new CarViewHolderJava(view);

            view.setTag(viewHolder);
        }

        CarViewHolderJava viewHolder = (CarViewHolderJava) view.getTag();

        CarJava car = cars[position];
        viewHolder.set(car);

        return view;
    }
}
