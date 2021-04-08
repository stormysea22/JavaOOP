public class CreateProjectTest {
    public static void main(String[] args) {
        CreateProject project = new CreateProject("Repair Windlass", "Remove and repair leaking windlass", 340.00);

        project.setName("Windlass");
        project.setDiscription("Repair leaking windlass");
        project.setCost(390.00);
        System.out.println(project.elevatorPitch());
    
    }
}
