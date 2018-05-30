public class Shifter implements CharSequence {

  String shifter;
  int toShift;

  public Shifter(String shifter, int toShift) {
    this.toShift = toShift;
    this.shifter = shifter;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    //return (char) (shifter.charAt(index) + 2);
    return shifter.charAt(index + 2);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
