
public class MyTestMain {

	public static void main(String[] args) {
		int i, j;
		lab: for (i=0; i<6; i++) {
			for (j=5; j>2; j--) {
				if ( i == j) {
					System.out.print(" " + j );
					break lab;
				}
			}
		}

	}

}
