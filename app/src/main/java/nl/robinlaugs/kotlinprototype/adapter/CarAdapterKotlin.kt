package nl.robinlaugs.kotlinprototype.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import nl.robinlaugs.kotlinprototype.R
import nl.robinlaugs.kotlinprototype.adapter.viewholder.CarViewHolderKotlin
import nl.robinlaugs.kotlinprototype.domain.CarKotlin

class CarAdapterKotlin(context: Context, resource: Int, private val cars: Array<CarKotlin>) :
        ArrayAdapter<CarKotlin>(context, resource, cars) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var view = convertView

        if (view == null) {
            val inflater = LayoutInflater.from(parent?.context)
            view = inflater.inflate(R.layout.list_item_car, parent, false)

            val viewHolder = CarViewHolderKotlin(view)

            view.tag = viewHolder
        }

        val viewHolder = view?.tag as CarViewHolderKotlin
        viewHolder.set(cars[position])

        return view
    }

}
