package net.zr2.jscratch.event;

public class EventKeyPressed extends Event {

	public final int keyCode;

	public EventKeyPressed(int keyCode) {
		this.keyCode = keyCode;
	}

	@Override
	public boolean equals(Object paramObject) {
		return super.equals(paramObject) && ((EventKeyPressed) paramObject).keyCode == this.keyCode;
	}

}
