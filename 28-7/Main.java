public class Main {

    public static void main(String[] args) {

        Pizza pizza1 = new PlainPizza();
        displayPizza(pizza1);

        Pizza pizza2 = new Cheese(new PlainPizza());
        displayPizza(pizza2);

        Pizza pizza3 = new Mushroom(new Cheese(new PlainPizza()));
        displayPizza(pizza3);

        Pizza pizza4 = new Olive(new Mushroom(new Cheese(new PlainPizza())));
        displayPizza(pizza4);
    }

    public static void displayPizza(Pizza pizza) {
        System.out.println("Description : " + pizza.getDescription());
        System.out.println("Cost        : " + pizza.getCost());
        System.out.println();
    }
}
