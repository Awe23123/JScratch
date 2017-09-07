package net.zr2.jscratch.stage;

import java.awt.Image;
import java.awt.image.BufferedImage;

public class Backdrop {

	public final String name;
	public final int index;
	public final Image texture;

	public int volume = 100;

	public Backdrop(String name, int index, BufferedImage image) {
		this.name = name;
		this.index = index;
		this.texture = resize(image);
	}

	private Image resize(BufferedImage image) {
		return image.getScaledInstance(480, 360, Image.SCALE_SMOOTH);
	}

}
