public class ProjectCreate {
    private String name;
    private String description;
    public String elevatorPitch(){
            return (this.getName() + ":" + this.getDescription());
    }

    // constructors
    public ProjectCreate(){
        this.name = "";
        this.description = "";

    }
    public ProjectCreate(String projectName){
        this.name = projectName;
        this.description = "";
 
    }
    public ProjectCreate(String projectName, String projectDescription){
        this.name = projectName;
        this.description = projectDescription;
    }

    // setters
    public void setName(String newName){
        this.name = newName;
    }
    public void setDescription(String newDescription){
        this.description = newDescription;
    }
  
    // getters
    public String getName() {
        return (name);
    }
    public String getDescription(){
        return (description);
    }
  
    
}