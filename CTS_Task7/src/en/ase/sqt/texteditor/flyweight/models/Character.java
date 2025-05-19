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
    public void display(CharacterContext context) {
        System.out.printf(
                "Char: '%s' at pos %d, size %d, font='%s', weight='%s', color='%s'%n",
                context.getCharacter(),
                context.getPosition(),
                context.getFontSize(),
                font, weight, color
        );
    }
}
