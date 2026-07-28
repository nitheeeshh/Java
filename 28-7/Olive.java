public class Olive extends PizzaDecorator {

    public Olive(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Olive";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20.0;
    }
}
