package oop.ch02.clock;

public class Clock2 {
  private int hour;
  private int minute;

  public Clock2(int hour, int minute) {
    if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60)
      throw new IllegalArgumentException("Invalid time " + hour + ":" + minute);
    this.hour = hour;
    this.minute = minute;
  }

  public int getHour() {
    return hour;
  }

  public int getMinute() {
    return minute;
  }

  public void tick() {
    minute = (minute + 1) % 60;
    if (minute == 0)
      hour = (hour + 1) % 24;
  }
}
