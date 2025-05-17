package en.ase.sqt.texteditor.flyweight.models;

import en.ase.sqt.texteditor.flyweight.abstracts.Displayable;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private final Map<String, Displayable> flyweights = new HashMap<>();

    public Displayable getCharacter(String font, String weight, String color) {
        String key = font + "-" + weight + "-" + color;
        return flyweights.computeIfAbsent(key, k -> new Character(font, weight, color));
    }
}
