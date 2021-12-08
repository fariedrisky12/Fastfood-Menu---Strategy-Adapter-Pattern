
public class FastfoodMenu
{
private PriceBehavior priceType;
private TimeBehavior timeType;

public void lookPrice() {
        this.priceType.price();
} 

public void lookTime() {
        this.timeType.time();
}
// set value 
public void setPriceType(PriceBehavior priceType) {
        this.priceType = priceType;
}

public void setTimeType(TimeBehavior timeType) {
        this.timeType = timeType;
}

}
