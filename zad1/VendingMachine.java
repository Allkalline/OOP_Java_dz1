import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    private int amount = 0;
    private List<product> list = new ArrayList<>();
    public VendingMachine addProduct(product product){
        list.add(product);
        return this;
    }
    public List<product> getList() {
        return list;
    }


public product findProduct(String string) {
    for (int i = 0; i < getList().size(); i++) {
        if (getList().get(i).getName().equals(string)){
            return getList().get(i);
        }
    }
    return null;
}
public product sellProduct(product product){
    try{
        product prodFound = findProduct(product.getName());
        getList().remove(prodFound);
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
