public class Customer {
    
    private int id;
    private String name;
    private String gender;
    private String location;

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    public String getLocation(){
        return location;
    }

    public void setLocation(String location){
        this.location = location;
    }

    @Override
    public String toString(){
        return "Customer  [ id="+id+",name ="+name+",gender ="+gender+",location ="+location+"]";
    }

    public Customer(int id,String name,String gender,String location){
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.location = location;    
    }

    
}
