
public class ComputerDesk {
//attributes of desk class

    private double lengthOfDesk;
    private double widthOfDesk;
    private String woodType;
    private int numberOfDrawers;
    public static final String MAHAG = "Mahagony";
    public static final String OAK = "Oak";
//constants 
    public static final int MIN_PRICE = 200;
    public static final int LARGE_PRICE = 50;
    public static final int MAHOG_PRICE = 150;
    public static final int OAK_PRICE = 125;
    public static final int DRAWER_PRICE = 30;
//constracter which takes two parameter length and width

    public ComputerDesk(double newLengthOfDesk, double newWidthOfDesk) {
        lengthOfDesk = newLengthOfDesk;
        widthOfDesk = newWidthOfDesk;
    }
//set method to set wood type

    public void setWoodType(String newWoodType) {
        woodType = newWoodType;
    }
//set method to set count of drawers

    public void setNumberOfDrawers(int newNumberOfDrawers) {
        numberOfDrawers = newNumberOfDrawers;
    }
// for getting area use this method

    public double getAreaConvertedToInches() {
        return (lengthOfDesk * widthOfDesk / 2.54);
    }
//method for getting price for desk 

    public double getPrice() {
        int price = MIN_PRICE;
        if (getAreaConvertedToInches() > 750) {
            price = price + LARGE_PRICE;
        }
        if (woodType == MAHAG) {
            price = price + MAHOG_PRICE;
        } else if (woodType == OAK) {
            price = price + OAK_PRICE;
        }

        price = price + numberOfDrawers * DRAWER_PRICE;

        return price;
    }
//override with string tostring method to get output

    public String toString() {

        return "For the Desk of wood type : " + woodType + "\nThe dimantion of the desk " + lengthOfDesk + ":"
                + widthOfDesk + "\nThe number of Drawers in the desk " + numberOfDrawers + "\nTotal cost of desk " + getPrice() + "\n";

    }

}
