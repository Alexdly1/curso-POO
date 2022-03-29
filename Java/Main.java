package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola mundo");
        /* Creamos un objeto de la clase Car */
        /* tipo de clase => Nombre del objeto => 
        palabra reservada new => Metodo Constructor*/
        /*el compilador crea el metodo construtor*/
        /* Car car = new Car();
        car.license = "AMQ123";
        car.driver = "Andres Herrera";
        car.passengers = 4;
        car.printDataCar(); */
        UberX uberX = new UberX("AMQ123", new Account("Andres Herrera", "AND123"),"Chevrolet","Sonic");
        /* uberX.passengers = 4; */ /* ya no se puede acceder por se  private*/
        uberX.setPassengers(4);
        uberX.printDataCar(); 

        UberVan uberVan = new UberVan("FGH345", new Account("Andres Herrera", "AND123"));
        uberVan.setPassengers(6);
        uberVan.printDataCar();
        /* Car car2 = new Car("QWE567", new Account("Andrea herrera", "ANDA876"));
        car2.passengers = 3;
        car2.printDataCar(); */
    }
}