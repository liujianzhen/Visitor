package visitor;

public interface Visitor {

	//定义访问各具体元素的方法
	public void visitElementA(ElementA elementA);
	public void visitElementB(ElementB elementB);
}
