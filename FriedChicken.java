public class FriedChicken extends FastfoodMenu{

    public FriedChicken() {
        setPriceType(new FiveDollars());  //harga fried chicken 5 dollar
        setTimeType(new FifteenMinutes()); //waktu penyajian 15 menit
    }
}
