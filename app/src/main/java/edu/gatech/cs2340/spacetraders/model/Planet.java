package edu.gatech.cs2340.spacetraders.model;

import java.util.Random;

import static java.lang.Math.floor;

public class Planet {

    private String name;
    private double xLoc;
    private double yLoc;
    private TechLevel techLevel;
    private Resource resource;
    private Government politicalSystem;

    public Planet(String name) {
        this.name = name;
        xLoc = floor(new Random().nextDouble() * GameLogistics.MAX_WIDTH);
        yLoc = floor(new Random().nextDouble() * GameLogistics.MAX_HEIGHT);
        techLevel = TechLevel.values()[new Random().nextInt(TechLevel.numElements())];
        resource = Resource.values()[new Random().nextInt(Resource.numElements())];
        politicalSystem = null;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        } else if (!(other instanceof Planet)) {
            return false;
        } else {
            Planet that = (Planet) other;
            return this.name.equals(that.name) && Double.compare(xLoc, that.xLoc) == 0
                   && Double.compare(yLoc, that.yLoc) == 0;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder().
                append("\n\t\t\tPlanet: " + name).
                append(String.format("\n\t\t\tLocation: (%.0f, %.0f)", xLoc, yLoc)).
                append("\n\t\t\tTech level: " + techLevel).
                append("\n\t\t\tResource: " + resource);
        return stringBuilder.toString();
    }


}
