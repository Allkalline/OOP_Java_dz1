
public class main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.addProduct(new product("cheese", 300))
                .addProduct(new product("water", 10))
                .addProduct(new product("wine", 330))
                .addProduct(new yogurt("danone", 300, "sweet"))
                .addProduct(new sok("Rich", 150, "apple"));




        vendingMachine.addProduct(new DZ_meat("Свинина", 200, "Лопатка"));
        for (int i = 0; i < vendingMachine.getList().size(); i++) {
            System.out.println(vendingMachine.getList().get(i));
        }

        // System.out.println("Нашли: ");
        // product found = vendingMachine.findProduct("water");
        // System.out.println(found);
        // product sold = vendingMachine.sellProduct(found);
        // System.out.println("В атомате столько денег: ");
        // System.out.println(vendingMachine.getAmount());
        // System.out.println("Остаток: ");
        // for (int i = 0; i < vendingMachine.getList().size(); i++) {
        // System.out.println(vendingMachine.getList().get(i));
        // }
        product sokProduct =
        vendingMachine.sellProduct(vendingMachine.findProduct("Rich"));
        System.out.println();
        System.out.println(sokProduct);
        // System.out.println("В атомате столько денег: ");
        // System.out.println(vendingMachine.getAmount());
        // System.out.println("Остаток: ");
        // for (int i = 0; i < vendingMachine.getList().size(); i++) {
        // System.out.println(vendingMachine.getList().get(i));
        // }
        // try {
        // product sokProductsProduct =
        // vendingMachine.sellProduct(vendingMachine.findProduct("Rich"));
        // System.out.println(sokProductsProduct);
        // } catch (RuntimeException e) {
        // System.out.println(e.getMessage());
        // }

    }
}