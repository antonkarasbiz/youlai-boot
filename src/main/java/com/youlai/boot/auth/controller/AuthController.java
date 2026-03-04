package com.youlai.boot.auth.controller;

import com.youlai.boot.auth.model.vo.CaptchaVO;
import com.youlai.boot.auth.model.vo.WechatLoginResult;
import com.youlai.boot.auth.model.dto.LoginRequest;
import com.youlai.boot.common.enums.LogModuleEnum;
import com.youlai.boot.core.web.Result;
import com.youlai.boot.auth.service.AuthService;
import com.youlai.boot.common.annotation.Log;
import com.youlai.boot.security.model.AuthenticationToken;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * 认证控制层
 *
 * @author Ray.Hao
 * @since 0.0.1
 */
@Tag(name = "01.认证中心")
@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@Slf4j
public class AuthController {

    private final AuthService authService;

    @Operation(summary = "获取验证码")
    @GetMapping("/captcha")
    public Result<CaptchaVO> getCaptcha() {
        CaptchaVO captcha = authService.getCaptcha();
        return Result.success(captcha);
    }

    @Operation(summary = "账号密码登录")
    @PostMapping("/login")
    @Log(value = "登录", module = LogModuleEnum.LOGIN)
    public Result<?> login(@RequestBody @Valid LoginRequest request) {
        String username = request.getUsername();
        String password = request.getPassword();
        AuthenticationToken authenticationToken = authService.login(username, password);
        return Result.success(authenticationToken);
    }

    @Operation(summary = "短信验证码登录")
    @PostMapping("/login/sms")
    @Log(value = "短信验证码登录", module = LogModuleEnum.LOGIN)
    public Result<AuthenticationToken> loginBySms(
            @Parameter(description = "手机号", example = "18812345678") @RequestParam String mobile,
            @Parameter(description = "验证码", example = "1234") @RequestParam String code
    ) {
        AuthenticationToken loginResult = authService.loginBySms(mobile, code);
        return Result.success(loginResult);
    }

    @Operation(summary = "发送登录短信验证码")
    @PostMapping("/sms/code")
    public Result<Void> sendLoginVerifyCode(
            @Parameter(description = "手机号", example = "18812345678") @RequestParam String mobile
    ) {
        authService.sendSmsLoginCode(mobile);
        return Result.success();
    }

    @Operation(summary = "微信小程序登录（个人小程序）")
    @PostMapping("/wechat-miniapp/login")
    @Log(value = "微信小程序登录", module = LogModuleEnum.LOGIN)
    public Result<WechatLoginResult> loginByWechatMini(
            @Parameter(description = "微信登录code", example = "xxx") @RequestParam String code
    ) {
        WechatLoginResult result = authService.loginByWechatMini(code);
        return Result.success(result);
    }

    @Operation(summary = "微信小程序一键登录（企业小程序）")
    @PostMapping("/wechat-miniapp/phone-login")
    @Log(value = "微信小程序一键登录", module = LogModuleEnum.LOGIN)
    public Result<AuthenticationToken> loginByWechatMiniWithPhone(
            @Parameter(description = "微信登录code", example = "xxx") @RequestParam String loginCode,
            @Parameter(description = "手机号授权code", example = "xxx") @RequestParam String phoneCode
    ) {
        AuthenticationToken result = authService.wechatMiniLoginWithPhone(loginCode, phoneCode);
        return Result.success(result);
    }

    @Operation(summary = "微信小程序绑定手机号")
    @PostMapping("/wechat-miniapp/bind-mobile")
    @Log(value = "微信小程序绑定手机号", module = LogModuleEnum.LOGIN)
    public Result<AuthenticationToken> bindMobileForWechatMini(
            @Parameter(description = "微信openid") @RequestParam String openid,
            @Parameter(description = "手机号", example = "18812345678") @RequestParam String mobile,
            @Parameter(description = "短信验证码", example = "1234") @RequestParam String code
    ) {
        AuthenticationToken result = authService.bindMobileForWechatMini(openid, mobile, code);
        return Result.success(result);
    }

    @Operation(summary = "退出登录")
    @DeleteMapping("/logout")
    @Log(value = "退出登录", module = LogModuleEnum.LOGIN)
    public Result<?> logout() {
        authService.logout();
        return Result.success();
    }

    @Operation(summary = "刷新令牌")
    @PostMapping("/refresh-token")
    public Result<?> refreshToken(
            @Parameter(description = "刷新令牌", example = "xxx.xxx.xxx") @RequestParam String refreshToken
    ) {
        AuthenticationToken authenticationToken = authService.refreshToken(refreshToken);
        return Result.success(authenticationToken);
    }

}
