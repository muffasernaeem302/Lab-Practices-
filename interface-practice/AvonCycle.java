 abstract class AvonCycle implements Bicycle{
    int speed = 7 ;
     public void applyBrake(int decrement ){
        speed = speed-decrement;
        System.out.println(" Applying Brakes to Decrease Speed " +speed);
    }
   public void speedup(int increment)
    {
        speed = speed +increment;
        System.out.println(" Applying Brakes to Decrease Speed "+speed);
    }
}
