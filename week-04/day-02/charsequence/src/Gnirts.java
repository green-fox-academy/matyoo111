public class Gnirts implements CharSequence {

  String gnirts;

  public Gnirts(String gnirts) {
    this.gnirts = gnirts;
  }

  @Override
  public int length() {
    return 0;
  }

  @Override
  public char charAt(int index) {
    return gnirts.charAt(gnirts.length() -1 - index);
  }

  @Override
  public CharSequence subSequence(int start, int end) {
    return null;
  }
}
