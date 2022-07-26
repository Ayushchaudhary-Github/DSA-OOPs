//overriding
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }

    class common extends Vehicle {
        void run() {
            System.out.println("Main is running");
        }

        public static void main(String[] args) {
            common m = new common();
            m.run();
        }
    }
}