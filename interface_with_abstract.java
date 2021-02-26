interface Math {
    void calculateArea(int l, int b);
    void multiply(int a,int b);
}

abstract class Arithmetic implements Math{
    public void multiply(int x,int y){
        System.out.print("Sum= "+(x*y));
    }
}

class Rectangle extends Arithmetic {
    public void calculateArea(int l, int b) {
        System.out.println("Area " + (l * b));
    }
}
 
class Main  {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();      
        rect.calculateArea(10, 20); 
        Rectangle ob=new Rectangle();
        ob.multiply(5,5);
    }
}