public class Trip {
    private String country;
    private int duration;
    private int price;
    private boolean paid;
    
    public Trip(String country, int duration, int price, boolean paid){
        this.country = country;
        this.duration = duration;
        this.price = price;
        this.paid = paid;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String newCountry){
        country = newCountry;
    }

    public int getDuration() {
        return duration;
    }

    public int getPrice() {
        return price;
    }

    public boolean isPaid() {
        return paid;
    }
    
}
