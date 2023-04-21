package zad2;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMachine {
    private int amount = 0;
    private List<Product> list = new ArrayList<>();
    public CoffeeMachine addProduct(Product product){
        list.add(product);
        return this;
    }
    public List<Product> getList() {
        return list;
    }
    public Product findProduct(String string) {
        for (int i = 0; i < getList().size(); i++) {
            if (getList().get(i).getName().equals(string)){
                return getList().get(i);
            }
        }
        return null;
    }

    public Product sellProduct(Product product){
        try{
            Product prodFound = findProduct(product.getName());
            amount += prodFound.getCost();
            return prodFound;
        }
        catch(Exception ex){
            throw new RuntimeException("Товар не найден");
        }
       
    }

  
   

public int getAmount() {
    return amount;
}
    
}
