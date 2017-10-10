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
        int hitPoints = getHitPoints();
        hitPoints = hitPoints - (damage /2);
        setHitPoints(hitPoints);
    }
}
