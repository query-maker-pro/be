package lesw.query_maker.domain.schema;

import lesw.query_maker.domain.response.SingleQueryDTO;
import lesw.query_maker.domain.schema.dto.SchemaDTO;
import lesw.query_maker.domain.schema.service.SchemaServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/api")
public class SchemaController {

    private final SchemaServiceImpl schemaService;

    public SchemaController(SchemaServiceImpl schemaService) {
        this.schemaService = schemaService;
    }

    @PostMapping("/schema")
    public ResponseEntity<Object> createSchema(@RequestBody SchemaDTO schemaDTO) {
        SingleQueryDTO singleQueryDTO = schemaService.createSchemaQuery(schemaDTO);

        return new ResponseEntity<>(singleQueryDTO, HttpStatus.OK);
    }
}
