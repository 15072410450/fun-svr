package com.okay.family.fun.base.bean

import com.alibaba.fastjson.JSONObject
import com.okay.family.fun.frame.SourceCode
import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * bean的基类
 */
abstract class AbstractBean extends SourceCode {

    static final Logger logger = LoggerFactory.getLogger(AbstractBean.class)

    /**
     * 将bean转化为json，为了进行数据处理和打印
     *
     * @return
     */
    JSONObject toJson() {
        return BeanUtil.toJson(this);
    }

    /**
     * 文本形式保存
     */
    def save() {
        Save.saveJson(this.toJson(), this.getClass().toString() + SourceCode.getMark());
    }

    /**
     * 控制台打印，使用WARN记录，以便查看
     */
    def print() {
        logger.info(this.getClass().toString() + "：" + this.toString());
    }

    @Override
    String toString() {
        return this.toJson().toString();
    }
}
