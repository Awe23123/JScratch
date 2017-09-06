package net.zr2.jscratch.event;

public class EventWhenValueGreater extends Event {

	public final Value value;
	public final int numericValue;

	public EventWhenValueGreater(Value value, int numericValue) {
		this.value = value;
		this.numericValue = numericValue;
	}

	public EventWhenValueGreater(Value value) {
		this(value, 10);
	}

	@Override
	public boolean equals(Object paramObject) {
		if (super.equals(paramObject)) {
			EventWhenValueGreater event = (EventWhenValueGreater) paramObject;
			return event.numericValue == this.numericValue && event.value == this.value;
		}
		return false;
	}

	@Override
	public int hashCode() {
		return (super.hashCode() ^ (this.numericValue << 24)) * this.value.hashCode();
	}

	public static enum Value {
		LOUDNESS, TIMER, VIDEO_MOTION;
	}

}
