public class CreateProject {
    private String name;
    private String description;
    private Double cost;

    public String elevatorPitch() {
        return (this.getName() + "($" + Double.toString(getCost()) + ")" + " : " + this.getDescription());
    }

    // constructors

    public void ProjectCreate() {
        this.name = "";
        this.description = "";
        this.cost = 0.00;
    }

    public void ProjectCreate(String projectName) {
        this.name = "";
        this.description = "";
        this.cost = 0.00;
    }

    public void ProjectCreate(String projectName, String projectDescription) {
        this.name = "";
        this.description = "";
        this.cost = 0.00;
    }

    public void ProjectCreate(String ProjectName, String projectDescription, Double projectCost) {
        this.name = "";
        this.description = "";
        this.cost = 0.00;
    }

    // 
    public void setName(String newName) {
        this.name = newName;
    }

    public void setDiscription(String newDescription) {
        this.description = newDescription;
    }

    public void setCost(Double newCost) {
        this.cost = newCost;
    }

    // getter

    public String getName() {
        return (name);
    }

    public String getDescription() {
        return (description);
    }

    public Double getCost() {
        return (cost);
    }
}
