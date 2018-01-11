package BlackJack.view;

public interface IView
{
  enum EnumInput{play,hit,stand,quit};
  EnumInput GetEnumInput();
  void DisplayWelcomeMessage();
  void DisplayCard(BlackJack.model.Card a_card);
  void DisplayPlayerHand(Iterable<BlackJack.model.Card> a_hand, int a_score);
  void DisplayDealerHand(Iterable<BlackJack.model.Card> a_hand, int a_score);
  void DisplayGameOver(boolean a_dealerIsWinner);
  void CreateSpace();
  void DisplayInstructions();
  void DisplayRules();
}