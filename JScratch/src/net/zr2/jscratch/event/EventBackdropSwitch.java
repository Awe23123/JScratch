package net.zr2.jscratch.event;

import net.zr2.jscratch.stage.Backdrop;

public class EventBackdropSwitch extends Event {

	public final Backdrop backdrop;

	public EventBackdropSwitch(Backdrop backdrop) {
		this.backdrop = backdrop;
	}
	
}