public class Main {

    // Funcao muito complicada para apenas criar um maze com 2 rooms
    // Funcao INFLEXIVEL - Layout é hardcoded - Nao promove reuso
    // Objetivo dos Creational Patterns é trazer flexibilidade / reuso (nao obrigatoriamente diminuir o tamanho)
    public static Maze createMaze() {
        Maze aMaze = new Maze(); // E se ja recebessemos um objeto como parametro ? -> Abstract Factory
        // Se este parametro recebido pudesse criar um maze totalmente novo usando operacoes internas -> Builder
        Room r1 = new Room(1); // E se chamassesmos virtual functions ao inves de new NomeDaClasse ? -> Factory Method
        Room r2 = new Room(2); // E se ao inves de usar new Room, tivessemos um Room prototipado que pudessemos copiar e adicionar ao maze -> Prototype
        Door theDoor = new Door(r1, r2);

        aMaze.addRoom(r1);
        aMaze.addRoom(r2);

        r1.setSide(Direction.NORTH, new Wall());
        r1.setSide(Direction.EAST, theDoor);
        r1.setSide(Direction.SOUTH, new Wall());
        r1.setSide(Direction.WEST, new Wall());

        r2.setSide(Direction.NORTH, new Wall());
        r2.setSide(Direction.EAST, new Wall());
        r2.setSide(Direction.SOUTH, new Wall());
        r2.setSide(Direction.WEST, theDoor);

        return aMaze;

    }

    public static void main(String args[]) {
        //  Maze myMaze = createMaze();
        //  System.out.println(myMaze.getRoom(1).roomNumber);

        Maze myMaze = new MazeGame().createMaze(new MazeFactory());
        System.out.println(myMaze.getRoom(1).roomNumber);

        // Desafio: reutilizar um layout existente para um novo jogo com enchanted mazes
        // Novos componentes:
        // DoorNeedingSpell - abrir e fechar só se tiver feitico
        // EnchantedRoom - quarto com itens especiais como chaves magicas e feiticos

    }

}
