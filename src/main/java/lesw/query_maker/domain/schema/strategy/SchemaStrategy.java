package lesw.query_maker.domain.schema.strategy;

import lesw.query_maker.domain.schema.dto.SchemaDTO;

public interface SchemaStrategy {

    String writeSchemaCreateQuery(SchemaDTO schemaDTO);
}
