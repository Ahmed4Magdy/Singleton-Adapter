public class MainAdapter {
     public static void main (String [] args){

         RoundHole Hole = new RoundHole(5);
         RoundPeg Peg = new RoundPeg(2.5);


         SquarePeg smallSquarePeg = new SquarePeg(2);
         SquarePeg largeSquarePeg = new SquarePeg(5);

         RoundPeg smallSquareAdapter = new SquarePegAdapter(smallSquarePeg);
         RoundPeg largeSquareAdapter = new SquarePegAdapter(largeSquarePeg);




         if (Hole.fits(largeSquareAdapter)) {
             System.out.println("Large square peg fits into round hole.");
         } else {
             System.out.println("Large square peg does not fit into round hole.");
         }

     }
}
