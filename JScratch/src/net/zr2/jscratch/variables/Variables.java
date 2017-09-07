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

	public static Variable getTempo() {
		return new SystemVariable("tempo", TEMPO);
	}

	public static void setTempo(double tempo) {
		TEMPO = tempo;
	}

	public static Variable getLoudness() {
		return new SystemVariable("loudness", LOUDNESS);
	}

	public static void setLoudness(int loudness) {
		LOUDNESS = loudness;
	}

	public static Backdrop getBackdrop() {
		return BACKDROP;
	}

	public static Variable getBackdropName() {
		return new SystemVariable("backdrop", BACKDROP.name);
	}

	public static void setBackdrop(Backdrop backdrop) {
		BACKDROP = backdrop;
	}

	public static Variable getAnswer() {
		return new SystemVariable("answer", ANSWER);
	}

	public static void setAnswer(String answer) {
		ANSWER = answer;
	}

	public static Variable getTimer() {
		return new SystemVariable("timer", TIMER);
	}

	public static void setTimer(float timer) {
		TIMER = timer;
	}

	public static Variable getCurrentSecond() {
		return new SystemVariable("second", LocalDateTime.now().getSecond());
	}

	public static Variable getCurrentMinute() {
		return new SystemVariable("minute", LocalDateTime.now().getMinute());
	}

	public static Variable getCurrentHour() {
		return new SystemVariable("hour", LocalDateTime.now().getHour());
	}

	public static Variable getCurrentDayOfWeek() {
		return new SystemVariable("day of week", Calendar.getInstance().get(Calendar.DAY_OF_WEEK));
	}

	public static Variable getCurrentDate() {
		return new SystemVariable("date", LocalDate.now().getDayOfMonth());
	}

	public static Variable getCurrentMonth() {
		return new SystemVariable("month", LocalDate.now().getMonthValue());
	}

	public static Variable getCurrentYear() {
		return new SystemVariable("year", LocalDate.now().getYear());
	}

}
