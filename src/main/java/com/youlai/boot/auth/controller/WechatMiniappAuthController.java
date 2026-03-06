package com.youlai.boot.auth.controller;

import com.youlai.boot.auth.model.vo.WechatMiniappLoginResult;
import com.youlai.boot.auth.service.WechatMiniappAuthService;
import com.youlai.boot.common.annotation.Log;
import com.youlai.boot.common.enums.LogModuleEnum;
import com.youlai.boot.core.web.Result;
import com.youlai.boot.security.model.AuthenticationToken;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 微信小程序认证控制层
 *
 * @author Ray.Hao
 * @since 2.4.0
 */
@Tag(name = "13.微信小程序认证")
@RestController
@RequestMapping("/api/v1/wechat/miniapp/auth")
@RequiredArgsConstructor
@Slf4j
public class WechatMiniappAuthController {

    private final WechatMiniappAuthService wechatMiniappAuthService;

    /**
     * 静默登录
     * <p>
     * 适用场景：个人小程序、无需手机号的登录场景
     * <ul>
     *   <li>已绑定手机号的用户：直接返回 token，登录成功</li>
     *   <li>未绑定手机号的用户：返回 openid，需调用绑定手机号接口</li>
     * </ul>
     */
    @Operation(summary = "静默登录", description = "通过微信 code 登录，已绑定用户直接返回 token，未绑定用户返回 openid 需绑定手机号")
    @PostMapping("/silent-login")
    @Log(value = "微信小程序静默登录", module = LogModuleEnum.LOGIN)
    public Result<WechatMiniappLoginResult> silentLogin(
            @Parameter(description = "微信登录凭证（wx.login 获取）", required = true, example = "0xxx")
            @RequestParam String code
    ) {
        WechatMiniappLoginResult result = wechatMiniappAuthService.silentLogin(code);
        return Result.success(result);
    }

    /**
     * 手机号快捷登录
     * <p>
     * 适用场景：企业认证小程序（已开通手机号快捷登录权限）
     * <p>
     * 一步完成登录，无需绑定流程，自动创建新用户
     */
    @Operation(summary = "手机号快捷登录", description = "同时使用微信 code 和手机号授权 code 登录，适用于企业认证小程序")
    @PostMapping("/phone-login")
    @Log(value = "微信小程序手机号快捷登录", module = LogModuleEnum.LOGIN)
    public Result<AuthenticationToken> phoneLogin(
            @Parameter(description = "微信登录凭证（wx.login 获取）", required = true, example = "0xxx")
            @RequestParam String loginCode,
            @Parameter(description = "手机号授权凭证（getPhoneNumber 事件获取）", required = true, example = "0xxx")
            @RequestParam String phoneCode
    ) {
        AuthenticationToken result = wechatMiniappAuthService.phoneLogin(loginCode, phoneCode);
        return Result.success(result);
    }

    /**
     * 绑定手机号
     * <p>
     * 适用场景：静默登录后未绑定手机号的用户
     * <p>
     * 绑定成功后自动完成登录
     */
    @Operation(summary = "绑定手机号", description = "为静默登录用户绑定手机号，绑定成功后自动登录")
    @PostMapping("/bind-mobile")
    @Log(value = "微信小程序绑定手机号", module = LogModuleEnum.LOGIN)
    public Result<AuthenticationToken> bindMobile(
            @Parameter(description = "微信用户唯一标识（静默登录返回）", required = true)
            @RequestParam String openid,
            @Parameter(description = "手机号码", required = true, example = "18812345678")
            @RequestParam String mobile,
            @Parameter(description = "短信验证码", required = true, example = "123456")
            @RequestParam String smsCode
    ) {
        AuthenticationToken result = wechatMiniappAuthService.bindMobile(openid, mobile, smsCode);
        return Result.success(result);
    }
}
