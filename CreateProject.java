
public class CreateProject {
    private String name;
    private String description;
    private double cost;

    public void elevatorPitch() {
        System.out.println(name + " (" + cost + "): " + description);
    }

    // constructors

    public void ProjectCreate() {
        this.name = "";
        this.description = "";
        this.cost = 0.00;
    }

    public void ProjectCreate(String projectName) {
        this.name = projectName;
        this.description = "";
        this.cost = 0.00;
    }

    public void ProjectCreate(String projectName, String projectDescription) {
        this.name = projectName;
        this.description = projectDescription;
        this.cost = 0.00;
    }

    public void ProjectCreate(String projectName, String projectDescription, double projectCost) {
        this.name = projectName;
        this.description = projectDescription;
        this.cost = projectCost;
    }

    // 
    public void setName(String newName) {
        this.name = newName;
    }

    public void setDiscription(String newDescription) {
        this.description = newDescription;
    }

    public void setCost(double newCost) {
        this.cost = newCost;
    }

    // getter

    public String getName() {
        return (name);
    }

    public String getDescription() {
        return (description);
    }

    public double getCost() {
        return (cost);
    }
}
