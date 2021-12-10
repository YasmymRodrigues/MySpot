package com.example.myspot

import android.animation.BidirectionalTypeConverter
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView
import org.w3c.dom.Text


class ListaParkAdapter: RecyclerView.Adapter<ListaParkAdapter.ViewHolder>() {
    //var onItemClick: ((Park) -> Unit)? = null
    private var parks = arrayOf(
        Park(
            "P019",
            "Park0001",
            true,
            300,
            50,
            "2018-11-05 18:06:30",
            38.7352591,
            -9.15528429,
            "Nao"
        ),
        Park(
            "P01khn",
            "Park0002",
            true,
            300,
            50,
            "2018-11-05 18:06:30",
            38.7352591,
            -9.15528429,
            "Nao"
        ),
        Park(
            "P01khn",
            "Park0002",
            true,
            300,
            50,
            "2018-11-05 18:06:30",
            38.7352591,
            -9.15528429,
            "Nao"
        ),
        Park(
            "P01khn",
            "Park0002",
            true,
            300,
            50,
            "2018-11-05 18:06:30",
            38.7352591,
            -9.15528429,
            "Nao"
        ),
        Park(
            "P01khn",
            "Park0002",
            true,
            300,
            50,
            "2018-11-05 18:06:30",
            38.7352591,
            -9.15528429,
            "Nao"
        ),
        Park(
            "P01khn",
            "Park0002",
            true,
            300,
            50,
            "2018-11-05 18:06:30",
            38.7352591,
            -9.15528429,
            "Nao"
        ),
        Park(
            "P01khn",
            "Park0002",
            true,
            300,
            50,
            "2018-11-05 18:06:30",
            38.7352591,
            -9.15528429,
            "Nao"
        ),
        Park(
            "P01khn",
            "Park0002",
            true,
            300,
            50,
            "2018-11-05 18:06:30",
            38.7352591,
            -9.15528429,
            "Nao"
        ),
        Park(
            "P01khn",
            "Park0002",
            true,
            300,
            50,
            "2018-11-05 18:06:30",
            38.7352591,
            -9.15528429,
            "Nao"
        ),
        Park(
            "P01khn",
            "Park0002",
            true,
            300,
            50,
            "2018-11-05 18:06:30",
            38.7352591,
            -9.15528429,
            "Nao"
        ),
        Park(
            "P01khn",
            "Park0002",
            true,
            300,
            50,
            "2018-11-05 18:06:30",
            38.7352591,
            -9.15528429,
            "Nao"
        ),
        Park(
            "P01khn",
            "Park0002",
            true,
            300,
            50,
            "2018-11-05 18:06:30",
            38.7352591,
            -9.15528429,
            "Nao"
        ),
        Park(
            "P01khn",
            "Park0002",
            true,
            300,
            50,
            "2018-11-05 18:06:30",
            38.7352591,
            -9.15528429,
            "Nao"
        )
    )
    // inner class ViewHolder(private val context: Context, itemView: View) : RecyclerView.ViewHolder(itemView) {
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        lateinit var itemPark: TextView
        lateinit var itemInfo: TextView
        lateinit var itemDistance: TextView
        //lateinit var itemDetalhes: TextView




        init {
            itemPark = itemView.findViewById(R.id.parkNameView)
            itemInfo = itemView.findViewById(R.id.kindView)
            itemDistance = itemView.findViewById(R.id.distanceView)
            //itemDetalhes = itemView.findViewById(R.id.detalhes)
            //itemView.setOnClickListener(context);

        /*itemView.setOnClickListener {
               Intent intent =
                onItemClick?.invoke(parks[adapterPosition])
           }*/
        }

        /*override fun onClick(v: View?) {
            val position = absoluteAdapterPosition // gets item position
            if (position != RecyclerView.NO_POSITION) { // Check if an item was deleted, but the user clicked it before the UI removed it
                val user = parks[position]
                // We can access the data within the views
                //Toast.makeText(context, .LENGTH_SHORT).show()
            }
        }*/
    }

        override fun onCreateViewHolder(
            parent: ViewGroup,
            viewType: Int
        ): ListaParkAdapter.ViewHolder {
            val v = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
            return ViewHolder(v)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            holder.itemPark.text = parks[position].toString()
            holder.itemInfo.text = parks[position].toString()
            holder.itemDistance.text = parks[position].toString()
            //holder.itemDetalhes.text = parks[position].toString()



        }

        override fun getItemCount(): Int {
            return parks.size
        }
    }






