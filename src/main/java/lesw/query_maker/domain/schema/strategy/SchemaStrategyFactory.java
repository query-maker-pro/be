package lesw.query_maker.domain.schema.strategy;

import lesw.query_maker.domain.DbType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@Component
public class SchemaStrategyFactory {

    private final Map<String, SchemaStrategy> strategies;

    public SchemaStrategyFactory(Map<String, SchemaStrategy> strategies) {
        this.strategies = strategies;
    }

    public SchemaStrategy getSchemaStrategy(DbType dbType) {
        return strategies.get(dbType.name());
    }
}
