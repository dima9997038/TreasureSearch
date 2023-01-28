package model;

public class Blank extends Artifact {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Blank(int excavationTime) {
		super(excavationTime);
	}

	@Override
	public Category getCategory() {
		return Category.EMPTY;
	}

}
