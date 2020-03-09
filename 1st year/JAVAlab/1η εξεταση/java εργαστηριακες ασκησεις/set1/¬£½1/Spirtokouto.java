public class Spirtokouto extends Box
{ //variables
    double weight;
    //constructor
    Spirtokouto(double length, double width, double height, double weight)
    {
        super(length,width,height);
        this.weight=weight;
    }
    //methods
    public String toString()
    {
        return ("MatchBox Calculation " + Double.toString(calculate()) + ", Volume " + Double.toString(volume()) + ", Weight " + Double.toString(weight));
      
    }
}


