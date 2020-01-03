public class MazeFactory {

    Maze makeMaze() {
        return new Maze();
    }

    Wall makeWall() {
        return new Wall();
    }

    Room makeRoom(int n) {
        return new Room(n);
    }

    Door makeDoor(Room r1, Room r2) {
        return new Door(r1, r2);
    }
}
