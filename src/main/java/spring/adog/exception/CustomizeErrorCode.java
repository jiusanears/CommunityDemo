package spring.adog.exception;

public enum CustomizeErrorCode implements ICustomizeErrorCode {

    QUESTION_NOT_FOUND(2001,"您找的问题不存在"),
    TARGET_PARAM_NOT_FOUND(2002,"未选中任何问题或评论进行回复"),
    NO_LOGIN(2003,"未登录，请登录后重试"),
    SYSTEM_ERROR(2004,"服务器冒烟了。。。"),
    TYPE_PARAM_WRONG(2005,"评论类型错误或不存在"),
    COMMENT_NOT_FOUND(2006,"回复的评论不存在了。。"),
    COMMENT_IS_EMPTY(2007,"评论不能为空"),
    READ_NOTIFICATION_FAIL(2008,"你正在读别人的通知？"),
    NOTIFICATION_NOT_FOUND(2009,"该通知不见了。。");

    private String message;
    private Integer code;

    CustomizeErrorCode(Integer code, String message) {
        this.message = message;
        this.code = code;
    }

    @Override
    public String getMessage() {
        return message;
    }

    @Override
    public Integer getCode() {
        return code;
    }
}
