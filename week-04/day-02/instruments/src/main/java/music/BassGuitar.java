package main.java.music;

public class BassGuitar extends StringedInstrument {

  public BassGuitar() {
    instrumentName = "Bass Guitar";
    numberOfStrings = 4;
  }

  public BassGuitar(int numberOfStrings) {
    instrumentName = "Bass Guitar";
    this.numberOfStrings = numberOfStrings;
  }


  @Override
  public String Sound() {
    return " Duum-duum-duum";
  }
}
