public class DZ_meat extends product {
    private final String type;
    public DZ_meat(String name, Integer cost, String type) {
        super(name, cost);
        this.type = type;
    }
    @Override
    public String toString() {
        return String.format("%s, %s",super.toString(), type);
    }

    
    
    
}
