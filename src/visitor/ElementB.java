package visitor;

public class ElementB implements IElement{

	private String name = "ElementB";
	
	@Override
	public void accept(Visitor vistor) {
		vistor.visitElementB(this);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
