public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        int secfromhours = currentHours*3600;
        int secfromminutes = currentMinutes*60;
        int allpassedsec = secfromhours + secfromminutes + currentSeconds;

        int secinaday = 24 * 3600;

        int remainingsec = secinaday - allpassedsec;
        System.out.println(remainingsec);
    }
}
