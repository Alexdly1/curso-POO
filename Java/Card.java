package Java;

class Card extends Payment {
    Integer number;
    Integer ccv;
    String date;

    public Card(Integer id, Integer number, Integer ccv, String date){
        super(id);
        this.number = number;
        this.ccv = ccv;
        this.date = date;

    }
}