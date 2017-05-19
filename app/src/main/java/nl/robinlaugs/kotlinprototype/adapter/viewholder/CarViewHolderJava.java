package nl.robinlaugs.kotlinprototype.adapter.viewholder;

import android.view.View;
import android.widget.TextView;

import nl.robinlaugs.kotlinprototype.R;
import nl.robinlaugs.kotlinprototype.domain.CarJava;

public class CarViewHolderJava {

    private View itemView;

    private TextView textViewListItemCarBrand;
    private TextView textViewListItemCarType;
    private TextView textViewListItemCarYear;

    public CarViewHolderJava(View itemView) {
        this.itemView = itemView;

        bindViews();
    }

    private void bindViews() {
        textViewListItemCarBrand = (TextView) itemView.findViewById(R.id.textViewListItemCarBrand);
        textViewListItemCarType = (TextView) itemView.findViewById(R.id.textViewListItemCarType);
        textViewListItemCarYear = (TextView) itemView.findViewById(R.id.textViewListItemCarYear);
    }

    public void set(CarJava car) {
        textViewListItemCarBrand.setText(car.getBrand());
        textViewListItemCarType.setText(car.getType());
        textViewListItemCarYear.setText(car.getYear());
    }

}
