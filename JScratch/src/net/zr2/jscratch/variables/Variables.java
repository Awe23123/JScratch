package net.zr2.jscratch.variables;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Calendar;

import net.zr2.jscratch.stage.Backdrop;

public final class Variables {

	private static double TEMPO = 60;
	private static int LOUDNESS = 0;
	private static Backdrop BACKDROP = null;
	private static String ANSWER = "";
	private static float TIMER = 0;

	private Variables() {
		throw new IllegalAccessError();
	}

	public static double getTempo() {
		return TEMPO;
	}

	public static void setTempo(double tempo) {
		TEMPO = tempo;
	}

	public static int getLoudness() {
		return LOUDNESS;
	}

	public static void setLoudness(int loudness) {
		LOUDNESS = loudness;
	}

	public static Backdrop getBackdrop() {
		return BACKDROP;
	}

	public static String getBackdropName() {
		return BACKDROP.name;
	}

	public static void setBackdrop(Backdrop backdrop) {
		BACKDROP = backdrop;
	}

	public static String getAnswer() {
		return ANSWER;
	}

	public static void setAnswer(String answer) {
		ANSWER = answer;
	}

	public static float getTimer() {
		return TIMER;
	}

	public static void setTimer(float timer) {
		TIMER = timer;
	}

	public static int getCurrentSecond() {
		return LocalDateTime.now().getSecond();
	}

	public static int getCurrentMinute() {
		return LocalDateTime.now().getMinute();
	}

	public static int getCurrentHour() {
		return LocalDateTime.now().getHour();
	}

	public static int getCurrentDayOfWeek() {
		return Calendar.getInstance().get(Calendar.DAY_OF_WEEK);
	}

	public static int getCurrentDate() {
		return LocalDate.now().getDayOfMonth();
	}

	public static int getCurrentMonth() {
		return LocalDate.now().getMonthValue();
	}

	public static int getCurrentYear() {
		return LocalDate.now().getYear();
	}

}
