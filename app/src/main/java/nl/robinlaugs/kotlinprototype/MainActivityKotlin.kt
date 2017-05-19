package nl.robinlaugs.kotlinprototype

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import nl.robinlaugs.kotlinprototype.adapter.CarAdapterKotlin
import nl.robinlaugs.kotlinprototype.domain.CarKotlin

class MainActivityKotlin : AppCompatActivity() {

    private val cars = arrayOf(
            CarKotlin("Mercedes-Benz", "C-Class", 2016),
            CarKotlin("Audi", "A3", 2015),
            CarKotlin("Volvo", "V90", 2017)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadActivity()
    }

    private fun loadActivity() {
        listView.adapter = CarAdapterKotlin(applicationContext, R.layout.list_item_car, cars)
    }

}
