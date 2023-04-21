
public class sok extends product{
    private final String vkus;
    public sok(String name, Integer cost, String vkus) {
        super(name, cost);
        this.vkus = vkus;
    }
    @Override
    public String toString() {
        return String.format("%s, %s",super.toString(),vkus);
    }
    

    
}