package grid;

public class Grid {
	Object[][] actors;

	public Grid() {
		actors = new Object[6][6];
	}
	
	public Object[][] getGrid() {
		return actors;
	}
	
	public void add(Object obj, int row, int col) {
		actors[row][col] = obj;
	}
	
	public void remove(int row, int col) {
		actors[row][col] = null;
	}
	
	// returns true if there is an object in the specified location
	public boolean check(int row, int col) {
		if(actors[row][col] == null) return false;
		else return true;
	}
}
