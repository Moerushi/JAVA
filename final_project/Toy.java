package final_project;

public class Toy {
    private int id;
    private String name;
    private String type;
    private double frequency;

    public Toy(int id, String type, String name, double frequency) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.frequency = frequency;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return frequency;
    }

    public void setWeight(double frequency) {
        this.frequency = frequency;
    }

    public String toString() {
        return "ID:" + id + " > Type: " + type + " > Name: " + name + " > Frequency: " + (int) (frequency * 100) + "%";
    }
}