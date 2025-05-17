package en.ase.sqt.texteditor.flyweight.models;

public class CharacterContext {
    private final char character;
    private final int position;
    private final int fontSize;

    public CharacterContext(char character, int position, int fontSize) {
        this.character = character;
        this.position = position;
        this.fontSize = fontSize;
    }

    public char getCharacter() {
        return this.character;
    }

    public int getPosition() {
        return this.position;
    }

    public int getFontSize() {
        return this.fontSize;
    }

}
