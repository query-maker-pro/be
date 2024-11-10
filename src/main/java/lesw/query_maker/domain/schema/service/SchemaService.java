package lesw.query_maker.domain.schema.service;

import lesw.query_maker.domain.response.SingleQueryDTO;
import lesw.query_maker.domain.schema.dto.SchemaDTO;

public interface SchemaService {

    SingleQueryDTO createSchemaQuery(SchemaDTO schemaDTO);
}
