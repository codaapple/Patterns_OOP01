package oop.ch02.clock;

public class Clock1 {
  private int hour;
  private int minute;

  public Clock1(int hour, int minute) {
    if (hour < 0 || hour >= 24 || minute < 0 || minute >= 60)
      throw new IllegalArgumentException("Invalid time " + hour + ":" + minute);
    this.hour = hour;
    this.minute = minute;
  }

  public int getHour() {
    return hour;
  }

  public void setHour(int hour) {
    if (hour < 0 || hour >= 24)
      throw new IllegalArgumentException("Invalid hour " + hour);
    this.hour = hour;
  }

  public int getMinute() {
    return minute;
  }

  public void setMinute(int minute) {
    if (minute < 0 || minute >= 60)
      throw new IllegalArgumentException("Invalid minute " + minute);
    this.minute = minute;
  }
}
