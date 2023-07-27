package com.jad.map;

public class Land extends Map{
    private int nbNPC;
    private String leader;

    public Land(final String name, final int nbNPC, final String leader) {
        super(name);
        this.nbNPC = nbNPC;
        this.leader = leader;
    }

    public int getNbNPC() {
        return this.nbNPC;
    }

    public String getLeader() {
        return this.leader;
    }
}
