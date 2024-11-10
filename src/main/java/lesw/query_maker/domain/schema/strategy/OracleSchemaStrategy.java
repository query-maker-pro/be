package lesw.query_maker.domain.schema.strategy;

import lesw.query_maker.domain.schema.dto.SchemaDTO;
import org.springframework.stereotype.Component;

@Component("ORACLE")
public class OracleSchemaStrategy implements SchemaStrategy {

    @Override
    public String writeSchemaCreateQuery(SchemaDTO schemaDTO) {
        return "CREATE USER " + schemaDTO.getUser() + " IDENTIFIED BY '" + schemaDTO.getPassword() + "';";
    }
}