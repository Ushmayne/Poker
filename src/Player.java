
public class Player {

    //Needed Objects
    PlayerHand playerHand;

    //Needed Variables
    String userName;

    Player(int cardsForHand)
    {
        playerHand = new PlayerHand(cardsForHand);
    }

    /*
     * Name: Set Username Function
     * Type: void
     * Description: This Function is used to set the Player's Username
     */
    public void setUsername(String userName)
    {
        //Updating Global userName
        this.userName = userName;
    }
}
