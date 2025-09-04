package oop.ch02.clock;

public class Clock3 {
  public static final int MINUTES_PER_DAY = 60 * 24;
  private int mins;

  public Clock3(int hour, int minute) {
    if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60)
      throw new IllegalArgumentException("Invalid time " + hour + ":" + minute);
    this.mins = 60 * hour + minute;
  }

  public int getHour() {
    return mins / 60;
  }

  public int getMinute() {
    return mins % 60;
  }

  public void tick() {
    mins = (mins + 1) % MINUTES_PER_DAY;
  }
}
