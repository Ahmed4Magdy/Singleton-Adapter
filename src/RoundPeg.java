public class RoundPeg {

    private double radius;

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

}

 class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        return this.getRadius() >= peg.getRadius();
    }
}

// SquarePeg class representing a square peg (an incompatible class)
class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }
}

// Adapter class to adapt SquarePeg to fit into RoundHole
class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        // Assuming the adapter can handle a square peg by calculating an equivalent radius
        super(Math.sqrt(Math.pow(squarePeg.getWidth() / 2, 2) * 2)); // Calculating radius of the circle which has the same area as the square
        this.squarePeg = squarePeg;



    }
}
