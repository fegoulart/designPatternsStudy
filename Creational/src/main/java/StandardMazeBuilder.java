public class StandardMazeBuilder extends MazeBuilder {
    private Maze currentMaze;
    private Direction directionOfCommonWall;

    @Override
    public void buildMaze() {
        this.currentMaze = new Maze();
    }

    @Override
    public void buildRoom(int n) {
        Room room = new Room(n);
        this.currentMaze.addRoom(room);

        room.setSide(Direction.NORTH, new Wall());
        room.setSide(Direction.SOUTH, new Wall());
        room.setSide(Direction.EAST, new Wall());
        room.setSide(Direction.WEST, new Wall());
    }

    @Override
    public void buildDoor(int roomFrom, int roomTo) {
        Room r1 = currentMaze.getRoom(roomFrom);
        Room r2 = currentMaze.getRoom(roomTo);
        Door d = new Door(r1, r2);

        r1.setSide(CommonWall(r1, r2), d);
        r2.setSide(CommonWall(r2, r1), d);
    }

    @Override
    public Maze getMaze() {
        return this.currentMaze;
    }

    private Direction CommonWall(Room r1, Room r2) {
        //TODO implement an algorithm to determine it
        if (r1.roomNumber == 1) {
            return Direction.EAST;
        } else {
            return Direction.WEST;
        }
    }
}
