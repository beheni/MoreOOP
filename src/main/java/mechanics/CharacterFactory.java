package mechanics;

import lotr.*;
import lotr.Character;

import java.util.Random;

public class CharacterFactory {
    public Character createCharacter(){
        Random generator = new Random();
        Elf elf = new Elf();
        Hobbit hobbit = new Hobbit();
        King king = new King();
        Knight knight = new Knight();
        Character[] arr_charachers = {elf, hobbit, king, knight};
        int randomIndex = generator.nextInt(arr_charachers.length);
        return arr_charachers[randomIndex];
    }
}
