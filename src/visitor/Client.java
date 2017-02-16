package visitor;

import java.util.ArrayList;

public class Client {

	public static void main(String[] args) {
		
		IElement elementA = new ElementA();
		IElement elementB = new ElementB();
		
		Visitor visitorA = new VisitorA();
		Visitor visitorB = new VisitorB();
		
		elementA.accept(visitorA);
		elementB.accept(visitorB);
	}
}
