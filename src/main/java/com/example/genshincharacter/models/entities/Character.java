package com.example.genshincharacter.models.entities;

public class Character {
    public int id;
    public String name;
    public String sex;
    public String element;
    public String weapon;

    public Character(int id, String name, String sex, String element, String weapon) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.element = element;
        this.weapon = weapon;
    }
}
