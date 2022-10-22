class Main {
    public static void main(String[] args) {
        //System.out.println("Hola Mundo");
        UberX car = new UberX("ODS458", new Account(329077 , "Jose Peréz", "ASD124", "jose123@gmail.com", "********"), "mercedes", "a45s");
        car.setPassenger(3);
        car.printDataCar();

        /*Car car2 = new Car("VFL831", new Account(149009 ,"Alegandro García", "IEB048", "Alegandro795@gmail.com", "*********"));
        //car2.passengers = 5;
        car2.printDataCar();*/
    }
}