package com.jad.map;

public class Dungeon extends Map{
    private String boss;
    private String loot;

    public Dungeon(final String name, final String boss, final String loot) {
        super(name);
        this.boss = boss;
        this.loot = loot;
    }

    public String getBoss() {
        return this.boss;
    }

    public String getLoot() {
        return this.loot;
    }
}
