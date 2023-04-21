public class Product {
    
    int id;
    String name;
    double prize;
    String details;

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

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public String geDetails(){
        return details;
    }

    public void setDetails(String details){
        this.details = details;
    }

    @Override
    public String toString(){
            return "Product [id="+id+",name ="+name+", prize ="+prize+", details ="+details+"]";
    }

    public Product(int id,String name,double prize,String details){
        this.id = id;
        this.name = name;
        this.prize = prize;
        this.details = details;
    }
}
