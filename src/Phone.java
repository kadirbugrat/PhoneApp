public class Phone extends Product{
    int phoneNumber;

    public Phone(int Id, String name, int price,int phoneNumber){
        super(Id,name,price);
        this.phoneNumber=phoneNumber;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber=phoneNumber;
    }

}
