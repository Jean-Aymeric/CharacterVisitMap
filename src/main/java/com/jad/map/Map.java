package com.jad.map;

public abstract class Map {
    private String name;

    public Map(final String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
