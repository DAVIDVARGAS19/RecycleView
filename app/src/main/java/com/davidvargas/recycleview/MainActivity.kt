package com.davidvargas.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var muro = ArrayList<Muro>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainActivityBtEnviar.setOnClickListener {

            data()
            mainActivityRecyclerView.layoutManager = LinearLayoutManager(this)
            mainActivityRecyclerView.adapter = MuroAdapter(muro)

        }
    }

    fun data() {
        var contador = 6000

        do {
            muro.add(Muro(R.drawable.ic_cake, "Feliz Cumpleaños", R.drawable.ic_david, "David"))
            muro.add(
                Muro(
                    R.drawable.ic_bike,
                    "Salgo con la bici",
                    R.drawable.ic_santiago,
                    "Santiago"
                )
            )
            muro.add(
                Muro(
                    R.drawable.ic_coffe,
                    "Tomando cafe CON LOS AMIGOS",
                    R.drawable.ic_vago,
                    "EL VAGO"
                )
            )
            contador--
        } while (contador != 0)
    }

}
