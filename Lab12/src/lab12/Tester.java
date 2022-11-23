package lab12;
public class Tester {
	public static void main(String[] args) {
		Pacman maze1 = new Pacman("mazes/tinyMaze.txt", "out.txt");
		System.out.println(maze1);
		maze1.writeOutput();
	}

}
