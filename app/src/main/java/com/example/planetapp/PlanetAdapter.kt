package com.example.planetapp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class PlanetAdapter: BaseAdapter {
    lateinit var context: Context;
    lateinit var planets: ArrayList<Planet>;

    constructor(context: Context, planets: ArrayList<Planet>) {
        this.context = context;
        this.planets = planets;
    }

    override fun getCount(): Int {
        return planets.size;
    }

    override fun getItem(position: Int): Any {
        return planets.get(position);
    }

    override fun getItemId(position: Int): Long {
        return position.toLong();
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val viewHolder: ViewHolder;
        val newConvertView: View;

        if (convertView == null) {
            newConvertView = LayoutInflater.from(context).inflate(R.layout.lv_item_planet, parent, false);
            viewHolder = ViewHolder();
            viewHolder.tvPlanetName = newConvertView.findViewById(R.id.tv_planet_name);
            viewHolder.tvPlanetMoons = newConvertView.findViewById(R.id.tv_planet_moons);
            viewHolder.ivPlanetImage = newConvertView.findViewById(R.id.iv_planet_image);

            newConvertView.setTag(viewHolder);
        } else {
            newConvertView = convertView;
            viewHolder = newConvertView.getTag() as ViewHolder;
        }

        viewHolder.tvPlanetName.setText(planets[position].getName());
        viewHolder.tvPlanetMoons.setText(planets[position].getMoons().toString() + " Moons");
        viewHolder.ivPlanetImage.setBackgroundResource(context.getResources().getIdentifier(planets[position].getImage(), "drawable", context.getPackageName()));

        return newConvertView;
    }

    class ViewHolder {
        lateinit var tvPlanetName: TextView;
        lateinit var tvPlanetMoons: TextView;
        lateinit var ivPlanetImage: ImageView;
    }
}