public class MazePrototypeFactory extends MazeFactory {
    
    private Maze prototypeMaze;
    private Room prototypeRoom;
    private Wall prototypeWall;
    private Door prototypeDoor;
    
    public MazePrototypeFactory (Maze m, Wall w, Room r, Door d) {
        prototypeMaze = m;
        prototypeWall = w;
        prototypeRoom = r;
        prototypeDoor = d;
    }
    
    public Wall makeWall() throws CloneNotSupportedException {
        return (Wall) prototypeWall.clone();
    }

    public Door makeDoor(Room r1, Room r2) throws CloneNotSupportedException {
         Door door = (Door) prototypeDoor.clone();
         door.initialize(r1,r2);
         return door;
    }

    public Room makeRoom(int n) throws CloneNotSupportedException {
        Room room = (Room) prototypeRoom.clone();
        room.initialize(n);
        return room;
    }

    public Maze makeMaze() throws CloneNotSupportedException {
        return (Maze) prototypeMaze.clone();
    }

}
