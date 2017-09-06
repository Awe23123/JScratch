package net.zr2.jscratch.event;

public abstract class Event {

	@Override
	public boolean equals(Object paramObject) {
		return paramObject.getClass() == this.getClass();
	}
	
	@Override
	public int hashCode() {
		return 0b1101010010110110101010101011111 ^ (this.getClass().getName().hashCode() << 16);
	}
	
}
