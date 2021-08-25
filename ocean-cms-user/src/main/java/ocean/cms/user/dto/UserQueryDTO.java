package ocean.cms.user.dto;

import lombok.Data;

@Data
public class UserQueryDTO {
    private String name;
    private Integer status;
    private Long size;
    private Long current;
}
