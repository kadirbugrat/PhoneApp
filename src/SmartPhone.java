public class SmartPhone extends Phone{
    private int storage;
    private int ram;
    private int camera;

    public SmartPhone(int Id,String name,int price,int phoneNumber,int storage,int ram,int camera){
        super(Id,name,price,phoneNumber);
        this.storage=storage;
        this.ram=ram;
        this.camera=camera;
    }

    public int getStorage(){
        return storage;
    }
    public void setStorage(int storage){
        this.storage=storage;
    }
    public int getRam(){
        return ram;
    }
    public void setRam(int ram){
        this.ram=ram;
    }
    public int getCamera(){
        return camera;
    }
    public void setCamera(int camera){
        this.camera=camera;
    }

}
