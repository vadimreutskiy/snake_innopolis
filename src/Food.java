
public class Food extends PlayObject {
	public Food(int x, int y) {
		Tile tile = new Tile(x, y);
		tile.setEatable(true);
		tiles.add(tile);
	}
}
