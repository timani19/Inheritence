package Inheritence;

public class TestLaptop {
    public static void main(String[] args) {
        Dell myDell=new Dell();
        myDell.getLaptopSize(12.4);
        myDell.getLaptopOS("Windows");

        Lenovo myLenovo= new Lenovo();
        myLenovo.getPrice(1600.55);

    }
}
