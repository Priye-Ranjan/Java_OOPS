public class Inheritance {
    String fname="ABC";

}
class MiddleName extends Inheritance{
    String mid="MNO";
}
class FullName extends MiddleName{
    String lastname="XYZ";
    public static void main(String args[])
    {
        FullName ob=new FullName();
        System.out.println(ob.fname+" "+ob.mid+" "+ob.lastname);
    }
}

class LastName extends Inheritance{
    String lastname="XYZ";
}

class Name{
    public static void main(String[] args) {
        MiddleName ob=new MiddleName();
        System.out.println(ob.fname+" "+ob.mid);
     
        LastName ob1=new LastName();
        System.out.println(ob1.fname+" "+ob1.lastname);
    }
}
