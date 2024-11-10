package lesw.query_maker.domain.response;

import lesw.query_maker.domain.DbType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@Builder
@ToString
public class SingleQueryDTO {

    private DbType dbType;
    private String query;
    private String createdDateTime;
}