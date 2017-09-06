package net.zr2.jscratch.event;

public abstract class Event {

	@Override
	public boolean equals(Object paramObject) {
		return paramObject.getClass() == this.getClass();
	}
	
}
