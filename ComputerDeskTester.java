
public class ComputerDeskTester {

    public static void main(String[] args) {
        // two object of computerDesk class are desk1 ,desk2 defined
        ComputerDesk desk1;
        ComputerDesk desk2;
        //desk1 takes parameter as length 18.34 and width 24.12
        //desk2 takes parameter as length 20 and width 14
        desk1 = new ComputerDesk(18.34, 24.12);
        desk2 = new ComputerDesk(20, 14);
        // set wood type and drawers count by calling setter method
        desk1.setWoodType(ComputerDesk.MAHAG);
        desk2.setWoodType(ComputerDesk.OAK);
        desk1.setNumberOfDrawers(2);
        desk2.setNumberOfDrawers(1);

        System.out.println(desk1);
        System.out.println(desk2);
       
       
        
    }

}
