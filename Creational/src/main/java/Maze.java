import java.util.HashMap;

public class Maze {
    private HashMap<Integer,Room> rooms = new HashMap<Integer,Room>();

    public void addRoom (Room room) {
        rooms.put(room.roomNumber,room);
    }
    public Room getRoom (Integer roomNo) {
        return rooms.get(roomNo);
    }
}
