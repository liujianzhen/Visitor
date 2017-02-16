package visitor;

/**
 * 假定该访问者只想访问元素B
 * @author Administrator
 *
 */
public class VisitorB implements Visitor {

	@Override
	public void visitElementA(ElementA elementA) {
		
	}

	@Override
	public void visitElementB(ElementB elementB) {
		System.out.println("我是VisitorB，正在访问"+elementB.getName());
	}

}
