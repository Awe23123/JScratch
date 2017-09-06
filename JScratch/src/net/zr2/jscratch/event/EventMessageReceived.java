package net.zr2.jscratch.event;

public class EventMessageReceived extends Event {

	public final String message;

	public EventMessageReceived(String message) {
		this.message = message;
	}
	
}
