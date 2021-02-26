abstract class Vehicle { 
        Vehicle() { 
        System.out.println("Vehicle constructor"); 
        } 
    } 
    class Car extends Vehicle { 
        void run() { 
        System.out.println("Car created"); 
        } 
        public static void main(String[] args) 
        { 
            Car ob = new Car(); 
            ob.run(); 
        } 
    } 