package com.example.myspot

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.lifecycle.ViewModelStore
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myspot.Park
import kotlin.collections.ArrayList
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.navigation.NavigationView




public class ListaParkActivity : AppCompatActivity() {

    private var layoutManager: RecyclerView.LayoutManager? = null
    private var adapter: RecyclerView.Adapter<ListaParkAdapter.ViewHolder>? = null
    lateinit var toggle: ActionBarDrawerToggle

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_park2)

        val rvParks = findViewById<RecyclerView>(R.id.recyclerView) as RecyclerView


        layoutManager = LinearLayoutManager(this)
        adapter = ListaParkAdapter()

        rvParks.layoutManager = layoutManager
        rvParks.adapter = adapter

        //NavBar
       /* var drawerLayout : DrawerLayout = findViewById(R.id.drawer_layout)
        var navView: NavigationView = findViewById(R.id.nav_view)

        toggle = ActionBarDrawerToggle(this, drawerLayout, R.string.open, R.string.close)
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()

        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        navView.setNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_home -> Toast.makeText(applicationContext, "Click", Toast.LENGTH_SHORT).show()
            }
            true
        }
*/

        //Filtro Lista Park
        val button = findViewById<Button>(R.id.filtersButton)
        button.setOnClickListener{
            //startActionMode(Intent(this, ))
        }


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu,menu)
        return super.onCreateOptionsMenu(menu)
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.action_parkmenow -> {
                Toast.makeText(this, "21810092", Toast.LENGTH_SHORT).show()
                return true
            }
        }
        //NavBar
        /*if (toggle.onOptionsItemSelected(item)){

            return true
        }*/
        return super.onOptionsItemSelected(item)
    }


    }






