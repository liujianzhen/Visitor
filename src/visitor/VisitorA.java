package visitor;

/**
 * 假定该访问者只想访问元素A
 * @author Administrator
 *
 */
public class VisitorA implements Visitor {

	@Override
	public void visitElementA(ElementA elementA) {
		System.out.println("我是VisitorA，正在访问"+elementA.getName());
	}

	@Override
	public void visitElementB(ElementB elementB) {
		// TODO Auto-generated method stub

	}

}
