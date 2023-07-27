package com.jad;

import com.jad.map.*;
import com.jad.character.Character;

import java.util.ArrayList;

public class Main {
    public static void main(final String[] args) {
        ArrayList<Map> maps = new ArrayList<>();
        maps.add(new Dungeon("Donjon", "Gros méchant", "Méga stuff de la mort"));
        maps.add(new Castle("Chateau", 5, "Dagobert"));
        maps.add(new Crypt("Crypte", 15, "Gross liche"));
        maps.add(new Land("Région", 23, "Sissi l'impératrice"));


        Character jad = new Character();
        for (final Map map : maps) {
            jad.explore(map);
        }
    }
}
