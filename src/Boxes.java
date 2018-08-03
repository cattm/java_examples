
public class Boxes {
	static int LB = 5;
    public static int minimalNumberOfBoxes(int products, int availableLargeBoxes, int availableSmallBoxes) {
    	int lbcap = availableLargeBoxes * LB;
        if ( (lbcap + availableSmallBoxes) >= products ) {
        	int nlbused = 0;
        	int nsbused = 0;
        	int nlreq = 0;
        	int nsreq = 0;
        	
        	switch (products) {
        	case 1 : // small boxes only
        	case 2 :
        	case 3 :
        	case 4 :
        		// revised check - we have enough small boxes?
        		nsbused = (availableSmallBoxes >= products) ? availableSmallBoxes : -1; 
        		break;
        	default:
        		// fill the large boxes then the rest in small;
        		nlreq = products / LB;
        		nlbused = (availableLargeBoxes >= nlreq) ? nlreq : availableLargeBoxes;
        		nsreq = products - (nlbused * LB);
        		nsbused = nsreq;
        		break;
        	}
        	System.out.println ("large " + nlbused + " small " + nsbused);
        	return nlbused + nsbused;
        	
        	
        	
        } else {
        	return -1;
        }
    	
    }
    
    public static void main(String[] args) {
        System.out.println(minimalNumberOfBoxes(16, 2, 10));
        System.out.println(minimalNumberOfBoxes(7, 2, 1));
        System.out.println(minimalNumberOfBoxes(15, 2, 6));
        System.out.println(minimalNumberOfBoxes(16, 1, 4));
    }
}
