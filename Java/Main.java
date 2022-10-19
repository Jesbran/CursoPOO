class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("ODS458", new Account(329077 , "Jose Peréz", "ASD124", "jose123@gmail.com", "********"));
        car.passengers = 4;
        car.printDataCar();

        Car car2 = new Car("VFL831", new Account(149009 ,"Alegandro García", "IEB048", "Alegandro795@gmail.com", "*********"));
        car2.passengers = 5;
        car2.printDataCar();
    }
}