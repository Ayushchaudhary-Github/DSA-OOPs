//overriding
class Vehicle {
    void run(){
        System.out.println("Vehicle is running");
    }
}

class Main extends Vehicle{
    void run(){
        System.out.println("Main is running");
    }
    public  static void main(String[] args){
        Main m = new Main();
        m.run();
    }
}