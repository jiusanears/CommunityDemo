package spring.adog.model;

import lombok.Data;

@Data
public class Question {
    private Integer id;
    private String title;
    private String description;
    private long gmtCreate;
    private long gmtModified;
    private Integer creatorId;
    private Integer comment_count;
    private Integer view_count;
    private Integer like_count;
    private String tag;
}
