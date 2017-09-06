package net.zr2.jscratch.event;

public class EventMessageReceived extends Event {

	public final String message;

	public EventMessageReceived(String message) {
		this.message = message;
	}

	@Override
	public boolean equals(Object paramObject) {
		return super.equals(paramObject) && ((EventMessageReceived) paramObject).message.equals(this.message);
	}
	
	@Override
	public int hashCode() {
		return super.hashCode() ^ (this.message.hashCode() << 8);
	}

}
