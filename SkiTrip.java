public class SkiTrip extends Trip{

    private boolean onSnowboard;
    private int altitude;
    

    public SkiTrip(String country, int duration, int price, boolean paid, boolean onSnowboard, int altitude){
        super(country, duration, price, paid);
        this.onSnowboard = onSnowboard;
        this.altitude = altitude; 
    }

    
    public String toString(){
        return "Country: " + getCountry() + "\n" + "Duration: " + getDuration() + "\n" + "Price: " + getPrice() + ",-" + "\n" + "Paid: " + isPaid() + "\n" + "On snowboard: " + onSnowboard + "\n" + "Altitude: " + altitude + " m";
    }
}