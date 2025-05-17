package en.ase.sqt.texteditor.flyweight.models;

import en.ase.sqt.texteditor.flyweight.abstracts.Displayable;

public class Character implements Displayable {
    private final String font;
    private final String weight;
    private final String color;

    public Character(String font, String weight, String color) {
        this.font = font;
        this.weight = weight;
        this.color = color;
    }



    @Override
    public void display(CharacterContext var1) {

    }
}
