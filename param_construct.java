class Area{
 int l;
 double r;
    Area(int x)
    {
        l=x;
    }
    Area(double y)
    {
        r=y;
    }
    int calculate()
    {
        return l*l;
    }
    double area()
    {
        return 3.14*r*r;
    }
    public static void main(String args[]) {
        Area a=new Area(5);
        Area circle=new Area(5.0);
        System.out.println(a.calculate());
        System.out.println(circle.area());
    }
}