package en.ase.sqt.texteditor;

import en.ase.sqt.texteditor.flyweight.abstracts.Displayable;
import en.ase.sqt.texteditor.flyweight.models.Character;
import en.ase.sqt.texteditor.flyweight.models.CharacterContext;
import en.ase.sqt.texteditor.flyweight.models.CharacterFactory;

public class VordDocument {
    public static void main(String[] args) {
        CharacterFactory factory = new CharacterFactory();

        String text = "Vord";
        String font = "Arial";
        String weight = "Bold";
        String color = "Black";

        Displayable sharedChar = factory.getCharacter(font, weight, color);

        for (int i = 0; i < text.length(); i++) {
            CharacterContext context = new CharacterContext(text.charAt(i), i, 14);
            sharedChar.display(context);
        }
    }
}
