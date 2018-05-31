package main.java.music;

public class Violin extends StringedInstrument {

  public Violin() {
    instrumentName = "Violin";
    numberOfStrings = 4;
  }

  public Violin(int numberOfStrings) {
    instrumentName = "Violin";
    this.numberOfStrings = numberOfStrings;
  }


  @Override
  public String Sound() {
    return " Screech";
  }
}

