package UncleBob.second.businessRules;

import UncleBob.second.entities.Something;

public class BusinessRule {
    private BusinessRuleGateway gateway;

    public BusinessRule(BusinessRuleGateway gateway) {
        this.gateway = gateway;
    }

    public void execute(String id) {
        gateway.startTransaction();
        Something thing = gateway.getSomething(id);
        thing.makeChanges();
        gateway.saveSomething(thing);
        gateway.endTransaction();
    }
}