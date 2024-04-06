package com.example.planetapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val planets = ArrayList<Planet>();
        planets.add(Planet("Mercury", 0, "mercury.png"));
        planets.add(Planet("Venus", 0, "venus.png"));
        planets.add(Planet("Earth", 1, "earth.png"));
        planets.add(Planet("Mars", 2, "mars.png"));
        planets.add(Planet("Jupiter", 79, "jupiter.png"));
        planets.add(Planet("Saturn", 82, "saturn.png"));
        planets.add(Planet("Uranus", 27, "uranus.png"));
        planets.add(Planet("Neptune", 14, "neptune.png"));

        val adapter = PlanetAdapter(applicationContext, planets);

        val lvPlanets = findViewById<ListView>(R.id.lv_planets);

        lvPlanets.adapter = adapter;

        lvPlanets.setOnItemClickListener { adapterView, view, position, id ->
            val planet = adapterView.getItemAtPosition(position) as Planet;
            val itemPos = adapterView.getItemIdAtPosition(position) + 1;

            val message = "Clicou no planeta ${planet.getName()}, na posição $itemPos";

            Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show();
        }
    }
}