package com.youlai.boot.auth.service;

import com.youlai.boot.auth.model.vo.CaptchaVO;
import com.youlai.boot.auth.model.vo.WechatLoginResult;
import com.youlai.boot.security.model.AuthenticationToken;

/**
 * 认证服务接口
 *
 * @author Ray.Hao
 * @since 2.4.0
 */
public interface AuthService {

    /**
     * 登录
     *
     * @param username 用户名
     * @param password 密码
     * @return 登录结果
     */
    AuthenticationToken login(String username, String password);

    /**
     * 登出
     */
    void logout();

    /**
     * 获取验证码
     *
     * @return 验证码
     */
    CaptchaVO getCaptcha();

    /**
     * 刷新令牌
     *
     * @param refreshToken 刷新令牌
     * @return 登录结果
     */
    AuthenticationToken refreshToken(String refreshToken);

    /**
     * 发送短信验证码
     *
     * @param mobile 手机号
     */
    void sendSmsLoginCode(String mobile);

    /**
     * 短信验证码登录
     *
     * @param mobile 手机号
     * @param code   验证码
     * @return 登录结果
     */
    AuthenticationToken loginBySms(String mobile, String code);

    /**
     * 微信小程序登录（个人小程序）
     *
     * @param code 微信登录code
     * @return 登录结果
     */
    WechatLoginResult loginByWechatMini(String code);

    /**
     * 微信小程序一键登录（企业小程序）
     *
     * @param loginCode 微信登录code
     * @param phoneCode 手机号授权code
     * @return 登录结果
     */
    AuthenticationToken wechatMiniLoginWithPhone(String loginCode, String phoneCode);

    /**
     * 微信小程序绑定手机号
     *
     * @param openid   微信openid
     * @param mobile   手机号
     * @param smsCode  短信验证码
     * @return 登录结果
     */
    AuthenticationToken bindMobileForWechatMini(String openid, String mobile, String smsCode);
}
