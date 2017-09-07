package net.zr2.jscratch.variables;

import java.util.ArrayList;

public class VariableList extends ArrayList<Variable> {

	private static final long serialVersionUID = 1L;

	public void addValue(Object object) {
		if (object instanceof Variable) {
			this.add((Variable) object);
		} else {
			Variable variable = new SystemVariable();
			variable.setValue(object.toString());
			this.add(variable);
		}
	}

	@Override
	public int indexOf(Object object) {
		int i;
		if (object == null) {
			for (i = 0; i < this.size(); i++) {
				if (this.get(i) == null) {
					return i;
				}
			}
		} else {
			for (i = 0; i < this.size(); i++) {
				if (this.get(i) != null && this.get(i).isValueEqual(object)) {
					return i;
				}
			}
		}
		return -1;
	}

}
