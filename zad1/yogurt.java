public class yogurt extends product {
    private final String flavor;

    public yogurt(String name, Integer cost, String flavor) {
        super(name, cost);
        this.flavor = flavor;
        
    }

    @Override
    public String toString() {
        return super.toString()+", "+flavor;
    }
    
}
