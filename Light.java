// Compute distance light travels using long variables.
class Light{
  public static void main(String args[]){
  int lightspeed;
  long days;
  long seconds;
  long distance;

    // approximate speed of light in miles per second 
    lightspeed = 186000;

    days = 1000;//specify number of days here
    seconds = days*24*60*60;//convert to seconds
    distance = lightspeed * seconds;// compute distance

    System.out.println("In" + days);

    System.out.println("days light will travel about");

    System.out.print(distance + "miles.");
  }
}
