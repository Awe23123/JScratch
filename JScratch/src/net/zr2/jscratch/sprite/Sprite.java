package net.zr2.jscratch.sprite;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import net.zr2.jscratch.event.Event;

public class Sprite {
	
	protected final List<Costume> costumes = new ArrayList<>();
	public final Map<Event, Runnable> eventHandlers = new HashMap<>();
	
	public final String name;
	public double x = 0;
	public double y = 0;
	public double direction = 90;
	
	public int costumeNumber = 0;
	public int size = 100;
	
	public double volume = 100;
	public double videoMotion = -1;
	
	public Sprite(String name) {
		this.name = name;
	}
	
	public Costume getCurrentCostume() {
		return this.costumes.get(this.costumeNumber);
	}
	
	public boolean addCostume(Costume costume) {
		if (this.costumes.contains(costume)) {
			return false;
		} else {
			this.costumes.add(costume);
			return true;
		}
	}
	
}
