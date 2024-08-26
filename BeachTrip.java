public class BeachTrip extends Trip{
    private boolean breakfast;

    public BeachTrip(String country, int duration, int price, boolean paid, boolean breakfast){
        super(country, duration, price, paid);
        this.breakfast = breakfast;
    }

    public String toString(){
        return "Country: " + getCountry() + "\n" + "Duration: " + getDuration() + "\n" + "Price: " + getPrice() + "\n" + "Paid: " + isPaid() + "\n" + "Breakfast included: " + breakfast;
    }
}
