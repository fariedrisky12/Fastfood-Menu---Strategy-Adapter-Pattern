public class Burger extends FastfoodMenu{

    public Burger() {
        setPriceType(new TwoDollars());
        setTimeType(new FifteenMinutes());
    }
}
