package BlackJack.model.rules;

public interface IRulesFactory {

	public IRules ProduceAmericanDealerWinsCombo();
	public IRules ProduceAmericanPlayerWinsCombo();
	public IRules ProduceInternationalDealerWinsCombo();
	public IRules ProduceInternationalPlayerWinsCombo();
	public IRules ProduceAmericanDealerWinsComboSoft17();
	public IRules ProduceAmericanPlayerWinsComboSoft17();
	public IRules ProduceProduceInternationalDealerWinsComboSoft17();
	public IRules ProduceProduceInternationalPlayerWinsComboSoft17();
}
