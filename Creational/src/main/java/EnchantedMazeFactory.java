public class EnchantedMazeFactory extends MazeFactory {
    protected Spell spell;

    Room makeRoom(int n) {
        return new EnchantedRoom(n, spell);
    }

    Door makeDoor(Room r1, Room r2) {
        return new DoorNeedingSpell(r1, r2);
    }
}
