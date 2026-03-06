package com.youlai.boot.auth.model.vo;

import com.youlai.boot.security.model.AuthenticationToken;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

/**
 * 微信小程序登录结果
 *
 * @author Ray.Hao
 * @since 2.4.0
 */
@Data
@Schema(description = "微信小程序登录结果")
public class WechatMiniappLoginResult {

    @Schema(description = "是否新用户")
    private Boolean isNewUser;

    @Schema(description = "是否需要绑定手机号")
    private Boolean needBindMobile;

    @Schema(description = "微信openid（绑定手机号时需要）")
    private String openid;

    @Schema(description = "访问令牌")
    private String accessToken;

    @Schema(description = "刷新令牌")
    private String refreshToken;

    @Schema(description = "令牌类型")
    private String tokenType;

    @Schema(description = "过期时间（秒）")
    private Integer expiresIn;

    /**
     * 创建需要绑定手机号的结果
     */
    public static WechatMiniappLoginResult needBindMobile(String openid) {
        WechatMiniappLoginResult result = new WechatMiniappLoginResult();
        result.setIsNewUser(true);
        result.setNeedBindMobile(true);
        result.setOpenid(openid);
        return result;
    }

    /**
     * 创建登录成功的结果
     */
    public static WechatMiniappLoginResult success(AuthenticationToken token) {
        WechatMiniappLoginResult result = new WechatMiniappLoginResult();
        result.setIsNewUser(false);
        result.setNeedBindMobile(false);
        result.setAccessToken(token.getAccessToken());
        result.setRefreshToken(token.getRefreshToken());
        result.setTokenType(token.getTokenType());
        result.setExpiresIn(token.getExpiresIn());
        return result;
    }

}
