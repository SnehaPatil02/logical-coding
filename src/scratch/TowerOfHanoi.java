package scratch;

public class TowerOfHanoi {

	public static void main(String[] args) {
		int n = 3;
		towerOfHanoi(n, 'A', 'C', 'B');
		
	}
	public static void towerOfHanoi(int n, char source, char destination, char intermidiate) {
		if(n == 0) {
			
			return;
		}
		
		towerOfHanoi(n-1, source, intermidiate, destination);
		
		System.out.println("Move a disk "+ n +" from rod " + source + " to rod " + destination);
		
		towerOfHanoi(n-1, intermidiate, destination, source);
		
	}
}
