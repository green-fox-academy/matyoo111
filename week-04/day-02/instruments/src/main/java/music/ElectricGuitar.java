package main.java.music;

public class ElectricGuitar extends StringedInstrument {

  String sound = "Twang";


  public ElectricGuitar() {
    instrumentName = "Electric Guitar";
    this.numberOfStrings = 6;
  }

  public ElectricGuitar(int numberOfStrings) {
    instrumentName = "Electric Guitar";
    this.numberOfStrings = numberOfStrings;
  }
  @Override
  public String Sound() {
    return " Twang";
  }
}
