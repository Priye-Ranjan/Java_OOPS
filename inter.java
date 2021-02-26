
interface myInterface{
    void display();
    static int  average(int a,int b)
    {
        return (a+b)/2;
    }
}
class Average implements myInterface{
    public void display()
    {
        System.out.print("Average= ");
    }
}
class TestInterface{
    public static void main(String[] args) {
        Average avg=new Average();
        avg.display();
        System.out.print(myInterface.average(10, 20));
    }
}
