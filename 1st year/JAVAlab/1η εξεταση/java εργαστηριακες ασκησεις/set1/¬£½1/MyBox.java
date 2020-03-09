public class MyBox extends Box
{
    //constructor
    MyBox(double width, double height, double length)
{
    super(length,width,height);
        if (this.length != this.width || this.width != this.height )
        {
            System.out.println("This is not a cube :-( ");
        }
        else
        {
         System.out.println("This is a cube! :-)" );
        }
   }
   //methods
   double calculate()
 {  
 return 2 * ( this.width * this.height +
 this.width * this.length +
this.height * this.length ); 
}
 double volume()
 {
  return (this.width*this.height*this.length);
 }
public String toString()
 {
     return ("Cube Calculation " + Double.toString(calculate()) + ", Volume " + Double.toString(volume())) ;
 }
}
        