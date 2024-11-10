package lesw.query_maker.domain.schema.strategy;

import lesw.query_maker.domain.schema.dto.SchemaDTO;
import org.springframework.stereotype.Component;

@Component("MYSQL")
public class MySqlSchemaStrategy implements SchemaStrategy {

    @Override
    public String writeSchemaCreateQuery(SchemaDTO schemaDTO) {
        return "CREATE SCHEMA " + schemaDTO.getSchemaName() + ";";
    }
}
