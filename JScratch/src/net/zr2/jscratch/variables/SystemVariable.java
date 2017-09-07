package net.zr2.jscratch.variables;

public class SystemVariable extends Variable {

	public SystemVariable() {
		super("");
	}
	
	public SystemVariable(String name) {
		super(name);
	}
	
	public SystemVariable(String name, Object value) {
		super(name);
		this.setValue(value.toString());
	}
	
	@Override
	public boolean equals(Object paramObject) {
		return false;
	}
	
	@Override
	public int hashCode() {
		return System.identityHashCode(this);
	}

}
