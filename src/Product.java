public class Product {
    int Id;
    String name;
    int price;

   public Product(int Id, String name, int price){
        this.Id=Id;
        this.name=name;
        this.price=price;

    }

    public int getId(){
        return Id;
    }
    public void setId(int Id){
        this.Id=Id;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price=price;
    }

    public void print(){
        System.out.println(this.Id+" Id numaralı "+ this.name+" isimli ücreti "+this.price+ " dolar olan telefon.");
    }

}
