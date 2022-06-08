package com.davidvargas.recycleview

import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_item_muro.view.*


class MuroAdapter(val muro: ArrayList<Muro>) : RecyclerView.Adapter<MuroAdapter.MuroViewHolder>() {

    override fun onBindViewHolder(holder: MuroViewHolder, position: Int) {

        val itemMuro = muro[position]
        holder.bindMuro(itemMuro)

    }

    override fun getItemCount(): Int {
        return muro.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MuroViewHolder {
        var layoutInflate = LayoutInflater.from(parent.context)
            .inflate(R.layout.list_item_muro, parent, false)
        return MuroViewHolder(layoutInflate)
    }


    class MuroViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindMuro(muro1: Muro) {
            itemView.setOnClickListener(){
                Log.d("TAG", " PRESIONANDO CLICK")
                val intent = Intent(itemView.context, PostActivity::class.java)
                intent.putExtra(Constante.FOTO,muro1.foto)
                intent.putExtra(Constante.POST,muro1.post)
                itemView.context.startActivity(intent)
            }
            itemView.limFotoPost.setImageResource(muro1.foto)
            itemView.limTextPost.text = muro1.post
            itemView.limFotoUser.setImageResource(muro1.fotoUser)
            itemView.limNombreUser.text =muro1.nameUser
        }
    }


}