package lesw.query_maker.domain.schema.dto;

import lesw.query_maker.domain.DbType;
import lombok.*;

@Setter
@Getter
@ToString
@NoArgsConstructor
public class SchemaDTO {

    private DbType dbType;
    private String schemaName;
    private String user;
    private String password;
}
