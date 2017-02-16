package visitor;

public class ElementA implements IElement{

	private String name = "ElementA";
	
	@Override
	public void accept(Visitor vistor) {
		vistor.visitElementA(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
