
package knauthbenjaminhw4;


public class KnauthBenjaminhw4 {

    public static void main(String[] args) {
       //Design and implement a Java class to represent a cube class. The class 
       //should contain a constructor, appropriate data fields and methods to 
       //return the volume of the cube, and the surface area of the cube.
      
      MyCube cube1 = new MyCube();
      System.out.println("The volume of a cube with side length " + 
        cube1.sideLength + " is " + cube1.getVolume() + ".  The area of the "
        + "perimeter is " + cube1.getSurfaceArea());
      
      MyCube cube2 = new MyCube(3);
      System.out.println("The volume of a cube with side length " + 
        cube2.sideLength + " is " + cube2.getVolume() + ".  The area of the "
        + "perimeter is " + cube2.getSurfaceArea());
      
    }
    
    static class MyCube {
      double sideLength;
       
      MyCube(){
      sideLength = 1;
      }
        
      MyCube(double newSideLength){
      sideLength = newSideLength;
      }
      
      double getVolume(){
        return sideLength * sideLength * sideLength;
      }
      
      double getSurfaceArea(){
        return (sideLength * sideLength) * 6;
      }
      
      void setSideLength(double newSideLength){
        sideLength = newSideLength;
      }
    }
}
