interface myInterface1{
    void display();
    static int average(int a,int b)
    {
        return (a+b)/2;
    }
    interface innerInterface{
        void display();
        static int sum(int a,int b)
        {
            return a+b;
        }
    }
}
class Average1 implements myInterface1{
    public void display()
    {
        System.out.print("Average= ");
    }
}
class Sum implements myInterface1.innerInterface{
    public void display()
    {
        System.out.print("Sum= ");
    }
}
class TestInterface1{
    public static void main(String[] args) {
        Average1 avg=new Average1();
        avg.display();
        System.out.println(myInterface1.average(10, 20));
        Sum s=new Sum();
        s.display();
        System.out.print(myInterface1.innerInterface.sum(10, 20));
    }
}
