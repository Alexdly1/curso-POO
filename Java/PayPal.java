package Java;

class PayPal extends Payment {
    String emai;

    public PayPal(Integer id, String email){
        super(id);
        this.emai = email;
    }
}