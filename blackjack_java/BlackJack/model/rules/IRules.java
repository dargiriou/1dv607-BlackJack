package BlackJack.model.rules;

public interface IRules {

	public IHitStrategy GetHitRule();
	public INewGameStrategy GetNewGameRule();
	public IWinStrategy GetWinRule();
	public void accept(IRulesVisitor visitor);
}
