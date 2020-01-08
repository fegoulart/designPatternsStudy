public class MazeFactory {

    Maze makeMaze() throws CloneNotSupportedException {
        return new Maze();
    }

    Wall makeWall() throws CloneNotSupportedException {
        return new Wall();
    }

    Room makeRoom(int n) throws CloneNotSupportedException {
        return new Room(n);
    }

    Door makeDoor(Room r1, Room r2) throws CloneNotSupportedException {
        return new Door(r1, r2);
    }
}
