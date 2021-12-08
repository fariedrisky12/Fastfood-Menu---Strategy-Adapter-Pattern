public class Burger extends FastfoodMenu{

    public Burger() {
        setPriceType(new TwoDollars());  //harga burger 2 dollar
        setTimeType(new FifteenMinutes()); //waktu penyajian 15 menit
    }
}
