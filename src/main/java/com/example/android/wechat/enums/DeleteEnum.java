package com.example.android.wechat.enums;

/**
 * @author Chris
 * @version 1.0.0
 * @since 2021/02/21
 */
public enum DeleteEnum {
    /** 未 */
    UN_DELETED(1, "未删除"),
    DELETED(1, "已删除"),
    Null(99, "未知");
    private final int code;
    private final String msg;

    DeleteEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public static DeleteEnum valueOfCode(int code) {
        for (DeleteEnum obj : DeleteEnum.values()) {
            if (java.util.Objects.equals(obj.code, code)) {
                return obj;
            }
        }
        return Null;
    }

    public static DeleteEnum valueOfMsg(String msg) {
        for (DeleteEnum obj : DeleteEnum.values()) {
            if (java.util.Objects.equals(obj.msg, msg)) {
                return obj;
            }
        }
        return Null;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
