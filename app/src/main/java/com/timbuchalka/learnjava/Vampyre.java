package com.timbuchalka.learnjava;

/**
 * Created by Solierboix on 08.10.2017.
 */

public class Vampyre extends Enemy {
    public Vampyre(String name) {
        super(name, 27, 1);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage / 2);
    }
}
