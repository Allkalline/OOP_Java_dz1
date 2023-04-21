package zad2;

public class Product {
    private String name;
    private Integer cost, volume, temperature;

    public Product(String name, Integer volume, Integer temperature, Integer cost) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
        this.cost = cost;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Integer getCost() {
        return cost;
    }
  
    public void setCost(Integer cost) {
        this.cost = cost;
    }
   
    public Integer getVolume() {
        return volume;
    }
    public void setVolume(Integer volume) {
        this.volume = volume;
    }
    public Integer getTemperature() {
        return temperature;
    }
    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
    }
    @Override
    public String toString() {
       return String.format("Название: %s, объем: %d, температура: %d, цена: %d", name, volume, temperature, cost);
    }
}
