package lesw.query_maker.domain.schema.service;

import lesw.query_maker.domain.response.SingleQueryDTO;
import lesw.query_maker.domain.schema.dto.SchemaDTO;
import lesw.query_maker.domain.schema.strategy.SchemaStrategy;
import lesw.query_maker.domain.schema.strategy.SchemaStrategyFactory;
import lesw.query_maker.utils.LocalDateTimeFormatter;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class SchemaServiceImpl implements SchemaService {

    private final SchemaStrategyFactory schemaStrategyFactory;
    private final LocalDateTimeFormatter localDateTimeFormatter;

    public SchemaServiceImpl(SchemaStrategyFactory schemaStrategyFactory, LocalDateTimeFormatter localDateTimeFormatter) {
        this.schemaStrategyFactory = schemaStrategyFactory;
        this.localDateTimeFormatter = localDateTimeFormatter;
    }

    @Override
    public SingleQueryDTO createSchemaQuery(SchemaDTO schemaDTO) {
        SchemaStrategy schemaStrategy = schemaStrategyFactory.getSchemaStrategy(schemaDTO.getDbType());

        String query = schemaStrategy.writeSchemaCreateQuery(schemaDTO);

        return SingleQueryDTO.builder()
                .dbType(schemaDTO.getDbType())
                .query(query)
                .createdDateTime(localDateTimeFormatter.format(LocalDateTime.now()))
                .build();
    }
}