package ocean.cms.user.dto;

import lombok.Data;

@Data
public class RoleQueryDTO {
    private String id;
    private String name;
    private Integer status;
    private Long current;
    private Long size;
}
