public class ProjectCreateTest{
    public static void main(String[] args){
        ProjectCreate testProject = new ProjectCreate("Bloomsbury rooftop", "An amazing live work co-working space");
        testProject.setName("Bloomsbury Co-Working");
        testProject.setDescription("New Co-Working offering in London");
        // System.out.println(testProject.getName());
        // System.out.println(testProject.getDescription());
        // System.out.println(testProject.getCost());
        System.out.println(testProject.elevatorPitch());
    }
}