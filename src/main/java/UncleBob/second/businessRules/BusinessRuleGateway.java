package UncleBob.second.businessRules;

import UncleBob.second.entities.Something;

public interface BusinessRuleGateway {
    Something getSomething(String id);

    void startTransaction();

    void saveSomething(Something thing);

    void endTransaction();
}