package com.okay.family.common.enums

enum RunResult {

    SUCCESS(2, "成功"),
    FAIL(3, "失败"),
    UNRUN(4, "无法运行"),
    USER_ERROR(5, "用户错误")

    int code

    String desc

    RunResult(int code, String desc) {
        this.code = code
        this.desc = desc
    }

}
