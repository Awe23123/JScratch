package net.zr2.jscratch.variables;

public class Variable {

	public final String name;
	private String value = "0";

	public Variable(String name) {
		this.name = name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public void setValue(double value) {
		this.value = Double.toString(value);
	}

	public String getValue() {
		return this.value;
	}

	public double getValueAsNumber() {
		try {
			return Double.parseDouble(this.value);
		} catch (NumberFormatException ex) {
			return 0;
		}
	}

	public int getAlpha() {
		int color = (int) this.getValueAsNumber();
		return (color >> 24) & 0xFF;
	}

	public int getRed() {
		int color = (int) this.getValueAsNumber();
		return (color >> 16) & 0xFF;
	}

	public int getGreen() {
		int color = (int) this.getValueAsNumber();
		return (color >> 8) & 0xFF;
	}

	public int getBlue() {
		int color = (int) this.getValueAsNumber();
		return color & 0xFF;
	}

	public boolean isValueEqual(Object object) {
		if (object instanceof Variable) {
			Variable variable = (Variable) object;
			return this.value.equals(variable.getValue());
		} else if (object instanceof Number || object instanceof String) {
			return String.valueOf(object).equals(this.value);
		} else {
			return false;
		}
	}

	@Override
	public boolean equals(Object object) {
		return object instanceof Variable && !(object instanceof SystemVariable)
				&& object.hashCode() == this.hashCode();
	}

	@Override
	public int hashCode() {
		return this.name.hashCode();
	}

}
