package edu.gatech.cs2340.spacetraders.model;

import java.util.HashSet;
import java.util.Set;

public class Universe {
    private static final Universe ourInstance = new Universe();

    public static Universe getInstance() {
        return ourInstance;
    }

    private Set<SolarSystem> solarSystems;

    private Universe() {
        solarSystems = new HashSet<>();
        for (int i = 0; i < GameLogistics.MAX_SOLAR_SYSTEMS; i++) {
            solarSystems.add(new SolarSystem(GameLogistics.SOLAR_SYSTEM_NAMES[i]));
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (SolarSystem curr : solarSystems) {
            stringBuilder.append("\n\t" + curr.toString());
        }
        return stringBuilder.toString();
    }
}
