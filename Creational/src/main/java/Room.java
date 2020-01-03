import java.util.HashMap;

public class Room extends MapSite {
    public int roomNumber;
    private HashMap<Direction, MapSite> sides = new HashMap<>();

    public Room(int roomNo) {
        this.roomNumber = roomNo;
    }

    public MapSite getSide (Direction direction) {
        return this.sides.get(direction);
    }

    public void setSide (Direction direction, MapSite mapSite) {
        this.sides.put(direction,mapSite);
    }


}
