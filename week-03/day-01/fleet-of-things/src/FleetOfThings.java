public class FleetOfThings {

  public static void main(String[] args) {
    Fleet fleet = new Fleet();
    Thing milk = new Thing("Get milk");
    Thing obstacles = new Thing("Remove obstacles");
    Thing lunch = new Thing("Eat lunch");
    lunch.complete();
    Thing standUp = new Thing("Stand up");
    standUp.complete();
    fleet.add(milk);
    fleet.add(obstacles);
    fleet.add(standUp);
    fleet.add(lunch);


    // Create a fleet of things to have this output:
    // 1. [ ] Get milk
    // 2. [ ] Remove the obstacles
    // 3. [x] Stand up
    // 4. [x] Eat lunch

    System.out.println(fleet);
  }
}
