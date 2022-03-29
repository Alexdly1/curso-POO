package Java;

class Car {
    private Integer id;
    private String license;
    private Account driver;
    protected Integer passengers; /*si no se pone modificador es default por defecto*/

                /*parametro obligatorio para que se cree el objeto tipo car*/
    public Car(String license, Account driver){
        this.license = license;
        this.driver = driver;
    }
    
    void printDataCar() {
        if(passengers != null){
            System.out.println("License: " + license + " Name Driver: " + driver.name + " Passengers: " + passengers);
        }
    }
    // passenfers ==============================
    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(Integer passengers) {
        if(passengers == 4){
            this.passengers = passengers; 
        }else{
            System.out.println("Necesitas asignar 4 pasajeros");
        }
    }
    //id =========================================
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    //license ====================================
    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }
    //driver ======================================
    public Account getDriver() {
        return driver;
    }

    public void setDriver(Account driver) {
        this.driver = driver;
    }

}