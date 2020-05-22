package Streams;

public class ProduceItem {

    private String name;
    private double cost;
    private ProduceType produceType;

    public ProduceItem(String name, double cost, ProduceType produceType) {
        this.name = name;
        this.cost = cost;
        this.produceType = produceType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public ProduceType getProduceType() {
        return produceType;
    }

    public void setProduceType(ProduceType produceType) {
        this.produceType = produceType;
    }

    @Override
    public String toString() {
        return "ProduceItem{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", produceType=" + produceType +
                '}';
    }
}

