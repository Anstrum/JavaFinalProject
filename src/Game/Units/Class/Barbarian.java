package Game.Units.Class;

import Game.Enums.WeaponList;
import Game.Units.Character;

public class Barbarian extends Character {
    public Barbarian(String _name) {
        super(_name, 300, 500);
        weapons.addAll(WeaponList.twoHandedWeapon);
    }
}
