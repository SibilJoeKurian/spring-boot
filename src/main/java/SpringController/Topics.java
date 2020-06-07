package SpringController;

public class Topics {
    String id;
    String description;
    String name;
    @Override
    public String toString(){
        return id+" "+description+" "+name;
    }

    public Topics(){

    }
    public Topics(String id, String description, String name) {
        this.id = id;
        this.description = description;
        this.name = name;
    }

    public String getId() {

        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {

        return name;
    }
}
