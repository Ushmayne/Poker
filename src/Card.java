import javafx.scene.image.Image;

public class Card
{

    //Variables Kept In
    int cardNumber;
    String cardSuit;
    Image cardImage;

    /*
     * Name: Default Constructor
     * Description: This constructor is used to create a card object with a unique set of values
     * */
    public Card (int cardNumber, String cardSuit)
    {
        this.cardNumber = cardNumber;
        this.cardSuit = cardSuit;
    }
}
