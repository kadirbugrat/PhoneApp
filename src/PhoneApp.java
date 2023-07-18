public class PhoneApp{
    public static void main(String[] args) {
        SmartPhone[] smartPhones = new SmartPhone[5];

        smartPhones[0] = new SmartPhone(1, "Phone 1", 1000, 101, 64, 2, 4);
        smartPhones[1] = new SmartPhone(2, "Phone 2", 1200, 102, 128, 4, 8);
        smartPhones[2] = new SmartPhone(3, "Phone 3", 900, 103, 256, 6, 16);
        smartPhones[3] = new SmartPhone(4, "Phone 4", 800, 104, 512, 8, 40);
        smartPhones[4] = new SmartPhone(5, "Phone 5", 1500, 105, 1024, 12, 64);

        for(int i=0 ; i<5;i++){
            smartPhones[i].print();
        }

        double totalPrice = calculateTotalPrice(smartPhones);
        System.out.println("Toplam Fiyat: " + totalPrice);
    }
    public static double calculateTotalPrice(SmartPhone[] smartPhoneArray) {
        double total = 0.0;
        for (SmartPhone smartPhone : smartPhoneArray) {
            total =total+ smartPhone.getPrice();
        }
        return total;
    }

}


