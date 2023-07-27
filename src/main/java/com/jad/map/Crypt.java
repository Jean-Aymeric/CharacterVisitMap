package com.jad.map;

public class Crypt extends Map{
    private int nbMonsters;
    private String boss;

    public Crypt(final String name, final int nbMonsters, final String boss) {
        super(name);
        this.nbMonsters = nbMonsters;
        this.boss = boss;
    }

    public int getNbMonsters() {
        return this.nbMonsters;
    }

    public String getBoss() {
        return this.boss;
    }
}
