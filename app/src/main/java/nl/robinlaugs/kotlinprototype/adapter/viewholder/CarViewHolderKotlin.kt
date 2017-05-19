package nl.robinlaugs.kotlinprototype.adapter.viewholder

import android.view.View
import kotlinx.android.synthetic.main.list_item_car.view.*
import nl.robinlaugs.kotlinprototype.domain.CarKotlin

class CarViewHolderKotlin(val itemView: View) {

    fun set(car: CarKotlin) = with(itemView) {
        textViewListItemCarBrand.text = car.brand
        textViewListItemCarType.text = car.type
        textViewListItemCarYear.text = car.year.toString()
    }

}
