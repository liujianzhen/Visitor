package visitor;

public interface IElement {

	//定义每个元素都要有接收访问者的方法，注入访问者用于调用访问者的方法
	public void accept(Visitor vistor);
}
