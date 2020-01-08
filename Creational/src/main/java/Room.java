import java.util.HashMap;

public class Room extends MapSite implements Cloneable {
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

    public Object clone() throws
            CloneNotSupportedException {
        return super.clone();
    }

    public void initialize(int roomNo) {
        this.roomNumber = roomNo;
    }


}
