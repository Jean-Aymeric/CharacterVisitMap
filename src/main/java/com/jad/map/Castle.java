package com.jad.map;

public class Castle extends Map{
    private int nbLevels;
    private String king;

    public Castle(final String name, final int nbLevels, final String king) {
        super(name);
        this.nbLevels = nbLevels;
        this.king = king;
    }

    public int getNbLevels() {
        return this.nbLevels;
    }

    public String getKing() {
        return this.king;
    }
}
