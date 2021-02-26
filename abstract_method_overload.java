abstract class A{             
	abstract void disp1();  
	
}  
abstract class B extends A{   
	abstract void disp2();

}
class ClassC extends B{
	void disp1(){
		System.out.println("class A");
	}

    void disp2()
    {
        System.out.println("class B");
    }
	public static void main(String args[]){  
	
	ClassC obj = new ClassC();
	obj.disp1();
	obj.disp2();
	}  
}