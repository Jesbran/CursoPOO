class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Car car = new Car("ODS458", new Account("Jose Peréz", "ASD124"));
        car.passengers = 4;
        car.printDataCar();

        Car car2 = new Car("VFL831", new Account("Alegandro García", "IEB048"));
        car2.passengers = 5;
        car2.printDataCar();
    }
}