package BlackJack.model.rules;

public class InternationalPlayerWinsComboSoft17 implements IRules
{

	@Override
	public IHitStrategy GetHitRule()
	{
		return new Soft17Strategy();
	}

	@Override
	public INewGameStrategy GetNewGameRule()
	{
		return new InternationalNewGameStrategy();
	}

	@Override
	public IWinStrategy GetWinRule()
	{
		return new PlayerWinsStrategy();
	}
	
	@Override
	public void accept(IRulesVisitor visitor)
	{
		visitor.visitSoft17HitStrategy(GetHitRule());
		visitor.visitInternationalNewGameStrategy(GetNewGameRule());
		visitor.visitPlayerWinsStrategy(GetWinRule());
	}

}
