package com.davidvargas.recycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_post.*

class PostActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_post)
        postActivityTextPost.text= intent.getStringExtra(Constante.POST)
        postActivityFotoPost.setImageResource(intent.getIntExtra(Constante.FOTO,0))
    }
}