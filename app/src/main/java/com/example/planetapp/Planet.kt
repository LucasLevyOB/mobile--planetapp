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
}