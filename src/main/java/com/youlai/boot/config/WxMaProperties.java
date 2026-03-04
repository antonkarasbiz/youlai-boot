package com.youlai.boot.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * 微信小程序配置属性
 */
@Data
@ConfigurationProperties(prefix = "wx.miniapp")
public class WxMaProperties {

    /**
     * 小程序appid
     */
    private String appid;

    /**
     * 小程序Secret
     */
    private String secret;

    /**
     * 小程序token
     */
    private String token;

    /**
     * 小程序EncodingAESKey
     */
    private String aesKey;

    /**
     * 消息格式
     */
    private String msgDataFormat;

}
