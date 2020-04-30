
public class TesteHanoiTower {

	public static void main(String[] args) {
		HanoiTower hanoiTower = new HanoiTower();

		System.out.println("Situacao inicial:");
		hanoiTower.print();

		hanoiTower.move('A', 'B');
		hanoiTower.print();

		hanoiTower.move('A', 'C');
		hanoiTower.print();

		hanoiTower.move('A', 'B');
		hanoiTower.print();

		hanoiTower.move('B', 'A');
		hanoiTower.print();

	}
}
