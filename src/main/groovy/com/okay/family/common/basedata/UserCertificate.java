package com.okay.family.common.basedata;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.ConcurrentHashMap;

public class UserCertificate {

    private static Logger logger = LoggerFactory.getLogger(UserCertificate.class);

    private static ConcurrentHashMap<Integer, Object> certificates = new ConcurrentHashMap<>();

    /**
     * 获取锁对象,用户测试用户锁
     *
     * @param id
     * @return
     */
    public static Object get(int id) {
        certificates.compute(id, (key, value) ->
        {
            if (value == null) {
                value = new Object();
            }
            return value;
        });
        return certificates.get(id);
    }


}
