public class product {
    private String name;
    private Integer cost;

    public product(String name, Integer cost) {
        this.name = name;
        this.cost = cost;
    }
    public String getName() {
        return name;
    }
    public Integer getCost() {
        return cost;
    }
  
    public void setCost(Integer cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
       return String.format("%s, %d", name, cost);
    }
}
