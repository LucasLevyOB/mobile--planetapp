package com.example.planetapp

class Planet {
    lateinit var name: String;
    var moons: Int;
    lateinit var image: String;

    constructor(name: String, moons: Int, image: String) {
        this.name = name;
        this.moons = moons;
        this.image = image;
    }

    fun getName(): String {
        return name;
    }

    fun setName(name: String) {
        this.name = name;
    }

    fun getMoons(): Int {
        return moons;
    }

    fun setMoons(moons: Int) {
        this.moons = moons;
    }

    fun getImage(): String {
        return image;
    }

    fun setImage(image: String) {
        this.image = image;
    }
}