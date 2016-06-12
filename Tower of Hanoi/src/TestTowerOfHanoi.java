
public class TestTowerOfHanoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		moveTower(4, "Start", "Final", "Spare");
	}

	public static void moveTower(int height, String fromTower, 
			String toTower, String spareTower){
		if(height>=1){
			moveTower(height - 1, fromTower, spareTower, toTower);
			moveDisc(height, fromTower, toTower);
			moveTower(height - 1, spareTower, toTower, fromTower);
		}
		
	}
	
	public static void moveDisc(int height, String fromTower, String toTower){
		System.out.println("Moving " + height + " from " + fromTower + " to " + toTower);
	}
}
