package com.youlai.boot.security.exception;

import org.springframework.security.core.AuthenticationException;

/**
 * 需要绑定手机号异常
 */
public class NeedBindMobileException extends AuthenticationException {

    private final String openid;

    private final String sessionKey;

    public NeedBindMobileException(String openid, String sessionKey) {
        super("需要绑定手机号");
        this.openid = openid;
        this.sessionKey = sessionKey;
    }

    public String getOpenid() {
        return openid;
    }

    public String getSessionKey() {
        return sessionKey;
    }

}
