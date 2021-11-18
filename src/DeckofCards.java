import javafx.scene.image.Image;

import java.util.Random;

public class DeckofCards {

    //Variables Kept In
    Card card, tempCard;
    int[] cardNumbers = {2,3,4,5,6,7,8,9,10,11,12,13,14};
    String[] cardSuits = {"Hearts","Spades","Clubs","Diamonds"};
    int cardID=0;
    int shuffleNum;

    //Variables Sent Out
    Card[] Deck = new Card[52];

    /*
     * Name: Default Constructor
     * Description:
     */
    public DeckofCards()
    {
        ShuffleDeck(PopulateDeck());
    }

    /*
     * Name: Deck Populate Function
     * Type: Card[]
     * Description: This function is used to generate a standard deck of 52 unique cards
     * 				Each card object is then stored in the Deck[] which is returned by the function
     */
    private Card[] PopulateDeck()
    {
        for(int i=0;i<cardSuits.length;i++)
        {
            for(int j=0;j<cardNumbers.length;j++)
            {
                card = new Card(cardNumbers[j],cardSuits[i]);
                Deck[cardID]=card;
                cardID++;
            }
        }

        for(int i=0;i<52;i++){
            if(Deck[i].cardNumber==2){

                if(Deck[i].cardSuit.equals("Hearts")){
                    Deck[i].cardImage = new Image("./JPEG/2H.jpg");
                }else if(Deck[i].cardSuit.equals("Spades")){
                    Deck[i].cardImage = new Image("./JPEG/2S.jpg");
                }else if(Deck[i].cardSuit.equals("Clubs")){
                    Deck[i].cardImage = new Image("./JPEG/2C.jpg");
                }else {
                    Deck[i].cardImage = new Image("./JPEG/2D.jpg");
                }

            }else if(Deck[i].cardNumber==3){

                if(Deck[i].cardSuit.equals("Hearts")){
                    Deck[i].cardImage = new Image("./JPEG/3H.jpg");
                }else if(Deck[i].cardSuit.equals("Spades")){
                    Deck[i].cardImage = new Image("./JPEG/3S.jpg");
                }else if(Deck[i].cardSuit.equals("Clubs")){
                    Deck[i].cardImage = new Image("./JPEG/3C.jpg");
                }else {
                    Deck[i].cardImage = new Image("./JPEG/3D.jpg");
                }

            }else if(Deck[i].cardNumber==4){

                if(Deck[i].cardSuit.equals("Hearts")){
                    Deck[i].cardImage = new Image("./JPEG/4H.jpg");
                }else if(Deck[i].cardSuit.equals("Spades")){
                    Deck[i].cardImage = new Image("./JPEG/4S.jpg");
                }else if(Deck[i].cardSuit.equals("Clubs")){
                    Deck[i].cardImage = new Image("./JPEG/4C.jpg");
                }else {
                    Deck[i].cardImage = new Image("./JPEG/4D.jpg");
                }

            }else if(Deck[i].cardNumber==5){

                if(Deck[i].cardSuit.equals("Hearts")){
                    Deck[i].cardImage = new Image("./JPEG/5H.jpg");
                }else if(Deck[i].cardSuit.equals("Spades")){
                    Deck[i].cardImage = new Image("./JPEG/5S.jpg");
                }else if(Deck[i].cardSuit.equals("Clubs")){
                    Deck[i].cardImage = new Image("./JPEG/5C.jpg");
                }else {
                    Deck[i].cardImage = new Image("./JPEG/5D.jpg");
                }

            }else if(Deck[i].cardNumber==6){

                if(Deck[i].cardSuit.equals("Hearts")){
                    Deck[i].cardImage = new Image("./JPEG/6H.jpg");
                }else if(Deck[i].cardSuit.equals("Spades")){
                    Deck[i].cardImage = new Image("./JPEG/6S.jpg");
                }else if(Deck[i].cardSuit.equals("Clubs")){
                    Deck[i].cardImage = new Image("./JPEG/6C.jpg");
                }else {
                    Deck[i].cardImage = new Image("./JPEG/6D.jpg");
                }

            }else if(Deck[i].cardNumber==7){

                if(Deck[i].cardSuit.equals("Hearts")){
                    Deck[i].cardImage = new Image("./JPEG/7H.jpg");
                }else if(Deck[i].cardSuit.equals("Spades")){
                    Deck[i].cardImage = new Image("./JPEG/7S.jpg");
                }else if(Deck[i].cardSuit.equals("Clubs")){
                    Deck[i].cardImage = new Image("./JPEG/7C.jpg");
                }else {
                    Deck[i].cardImage = new Image("./JPEG/7D.jpg");
                }

            }else if(Deck[i].cardNumber==8){

                if(Deck[i].cardSuit.equals("Hearts")){
                    Deck[i].cardImage = new Image("./JPEG/8H.jpg");
                }else if(Deck[i].cardSuit.equals("Spades")){
                    Deck[i].cardImage = new Image("./JPEG/8S.jpg");
                }else if(Deck[i].cardSuit.equals("Clubs")){
                    Deck[i].cardImage = new Image("./JPEG/8C.jpg");
                }else {
                    Deck[i].cardImage = new Image("./JPEG/8D.jpg");
                }

            }else if(Deck[i].cardNumber==9){

                if(Deck[i].cardSuit.equals("Hearts")){
                    Deck[i].cardImage = new Image("./JPEG/9H.jpg");
                }else if(Deck[i].cardSuit.equals("Spades")){
                    Deck[i].cardImage = new Image("./JPEG/9S.jpg");
                }else if(Deck[i].cardSuit.equals("Clubs")){
                    Deck[i].cardImage = new Image("./JPEG/9C.jpg");
                }else {
                    Deck[i].cardImage = new Image("./JPEG/9D.jpg");
                }

            }else if(Deck[i].cardNumber==10){

                if(Deck[i].cardSuit.equals("Hearts")){
                    Deck[i].cardImage = new Image("./JPEG/10H.jpg");
                }else if(Deck[i].cardSuit.equals("Spades")){
                    Deck[i].cardImage = new Image("./JPEG/10S.jpg");
                }else if(Deck[i].cardSuit.equals("Clubs")){
                    Deck[i].cardImage = new Image("./JPEG/10C.jpg");
                }else {
                    Deck[i].cardImage = new Image("./JPEG/10D.jpg");
                }

            }else if(Deck[i].cardNumber==11){

                if(Deck[i].cardSuit.equals("Hearts")){
                    Deck[i].cardImage = new Image("./JPEG/AH.jpg");
                }else if(Deck[i].cardSuit.equals("Spades")){
                    Deck[i].cardImage = new Image("./JPEG/AS.jpg");
                }else if(Deck[i].cardSuit.equals("Clubs")){
                    Deck[i].cardImage = new Image("./JPEG/AC.jpg");
                }else {
                    Deck[i].cardImage = new Image("./JPEG/AD.jpg");
                }

            }else if(Deck[i].cardNumber==12){

                if(Deck[i].cardSuit.equals("Hearts")){
                    Deck[i].cardImage = new Image("./JPEG/JH.jpg");
                }else if(Deck[i].cardSuit.equals("Spades")){
                    Deck[i].cardImage = new Image("./JPEG/JS.jpg");
                }else if(Deck[i].cardSuit.equals("Clubs")){
                    Deck[i].cardImage = new Image("./JPEG/JC.jpg");
                }else {
                    Deck[i].cardImage = new Image("./JPEG/JD.jpg");
                }

            }else if(Deck[i].cardNumber==13){

                if(Deck[i].cardSuit.equals("Hearts")){
                    Deck[i].cardImage = new Image("./JPEG/QH.jpg");
                }else if(Deck[i].cardSuit.equals("Spades")){
                    Deck[i].cardImage = new Image("./JPEG/QS.jpg");
                }else if(Deck[i].cardSuit.equals("Clubs")){
                    Deck[i].cardImage = new Image("./JPEG/QC.jpg");
                }else {
                    Deck[i].cardImage = new Image("./JPEG/QD.jpg");
                }

            }else{
                if(Deck[i].cardSuit.equals("Hearts")){
                    Deck[i].cardImage = new Image("./JPEG/KH.jpg");
                }else if(Deck[i].cardSuit.equals("Spades")){
                    Deck[i].cardImage = new Image("./JPEG/KS.jpg");
                }else if(Deck[i].cardSuit.equals("Clubs")){
                    Deck[i].cardImage = new Image("./JPEG/KC.jpg");
                }else {
                    Deck[i].cardImage = new Image("./JPEG/KD.jpg");
                }

            }
        }
        return Deck;
    }

    /*
     * Name: Deck Display Function
     * Type: Void
     * Description: This function is used to display Deck[] to the User
     */
    public void DisplayDeck(Card[] Deck)
    {
        for(int i=0;i<Deck.length;i++)
        {
            System.out.println(Deck[i].cardNumber+" of "+Deck[i].cardSuit);
        }
    }

    /*
     * Name: Deck Shuffle Function
     * Type: Card[]
     * Description: This function is used to shuffle the populated Deck[]
     */
    public Card[] ShuffleDeck(Card[] Deck)
    {
        Random random = new Random();

        for(int i=0;i<Deck.length;i++)
        {
            shuffleNum = i + random.nextInt(52 - i);

            tempCard = Deck[shuffleNum];
            Deck[shuffleNum] = Deck[i];
            Deck[i] = tempCard;
        }

        return Deck;
    }

    /*
     * Name: Main
     * Type: Void
     */

}
