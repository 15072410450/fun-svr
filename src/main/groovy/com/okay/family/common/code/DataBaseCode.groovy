package com.okay.family.common.code

import com.okay.family.fun.base.interfaces.ReturnCode

enum DataBaseCode implements ReturnCode {

    ONLY_KEY_FAIL(200, "数据库唯一性校验失败"),
    MYBATIS_FAIL(201, "mybatis系统错误"),
    MYBATIS_CONFIG_ERROR(203, "mybatis配置错误")

    int code

    String desc

    DataBaseCode(int code, String desc) {
        this.code = code
        this.desc = desc
    }

    @Override
    int getCode() {
        return code
    }

    @Override
    String getDesc() {
        return desc
    }
}