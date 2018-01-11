package BlackJack.model.rules;

public interface IRulesVisitor
{
	public void visitAmericanNewGameStrategy(INewGameStrategy americanNewGameStrategy);
	public void visitInternationalNewGameStrategy(INewGameStrategy internationalNewGameStrategy);
	public void visitBasicHitStrategy(IHitStrategy basicHitStrategy);
	public void visitSoft17HitStrategy(IHitStrategy soft17HitStrategy);
	public void visitDealerWinsStrategy(IWinStrategy dealerWinsStrategy);
	public void visitPlayerWinsStrategy(IWinStrategy playerWinsStrategy);
}
