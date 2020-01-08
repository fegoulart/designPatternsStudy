public class MazeGame {

    public Maze createMaze(MazeBuilder builder) {
        builder.buildMaze();

        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildDoor(1,2);

        return builder.getMaze();
    }

    public Maze createComplexMaze(MazeBuilder builder) {
        builder.buildRoom(1);
        builder.buildRoom(2);
        builder.buildRoom(3);
        builder.buildRoom(4);
        builder.buildRoom(5);
        builder.buildRoom(6);
        builder.buildRoom(7);

        return builder.getMaze();
    }
}
