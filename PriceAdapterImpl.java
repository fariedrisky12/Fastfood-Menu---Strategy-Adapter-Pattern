public class PriceAdapterImpl implements PriceAdapter {
    private Price changesPrice;

    public PriceAdapterImpl(Price changesPrice) {
        this.changesPrice = changesPrice;
    }

    @Override
    public double getFriedChicken(int nilai) {
        Double price = changesPrice.getFriedChicken();
        return convertFriedChicken(price, nilai);
    }

    @Override
    public double getBurger(int nilai) {
        Double price = changesPrice.getBurger();
        return convertBurger(price, nilai);
    }

    @Override
    public double getFrenchFries(int nilai) {
        Double price = changesPrice.getFrenchFries();
        return convertFrenchFries(price, nilai);
    }

    private double convertFriedChicken(double price, int nilai) {
        return nilai * price;
    }

    private double convertBurger(double price, int nilai) {
        return nilai * price;
    }

    private double convertFrenchFries(double price, int nilai) {
        return nilai * price;
    }
}
