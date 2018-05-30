package main.java.music;

public abstract class StringedInstrument extends Instrument {

  protected int numberOfStrings;

  public abstract String Sound();

  public void play() {
    System.out.println(instrumentName + ", a " + numberOfStrings + "-stringed instrument that goes" + this.Sound());
  }
}
