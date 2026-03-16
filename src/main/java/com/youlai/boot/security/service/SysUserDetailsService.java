package com.youlai.boot.security.service;

import com.youlai.boot.security.model.SysUserDetails;
import com.youlai.boot.security.model.UserAuthInfo;
import com.youlai.boot.system.enums.SocialPlatformEnum;
import com.youlai.boot.system.model.entity.UserSocial;
import com.youlai.boot.system.service.UserSocialService;
import com.youlai.boot.system.service.UserService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * 系统用户认证 DetailsService
 *
 * @author Ray.Hao
 * @since 2021/10/19
 */
@Service
@RequiredArgsConstructor
@Slf4j
public class SysUserDetailsService implements UserDetailsService {

    private final UserService userService;
    private final UserSocialService userSocialService;

    /**
     * 根据用户名获取用户信息
     *
     * @param username 用户名
     * @return 用户信息
     * @throws UsernameNotFoundException 用户名未找到异常
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        try {
            UserAuthInfo userAuthInfo = userService.getAuthInfoByUsername(username);
            if (userAuthInfo == null) {
                throw new UsernameNotFoundException(username);
            }
            return new SysUserDetails(userAuthInfo);
        } catch (Exception e) {
            // 记录异常日志
            log.error("认证异常:{}", e.getMessage());
            // 抛出异常
            throw e;
        }
    }

    /**
     * 根据微信小程序openid查询绑定信息
     *
     * @param openid 微信小程序openid
     * @return 绑定信息，未绑定返回null
     */
    public UserSocial getWechatMiniBindInfo(String openid) {
        return userSocialService.getByPlatformAndOpenid(SocialPlatformEnum.WECHAT_MINI, openid);
    }

    /**
     * 根据微信小程序openid获取用户认证信息
     *
     * @param openid 微信小程序openid
     * @return 用户认证信息，用户不存在返回null
     */
    public UserAuthInfo getAuthInfoByWechatOpenid(String openid) {
        return userSocialService.getAuthInfoByOpenid(SocialPlatformEnum.WECHAT_MINI, openid);
    }

    /**
     * 更新微信小程序session_key
     *
     * @param bindId     绑定记录ID
     * @param sessionKey session_key
     */
    public void updateWechatSessionKey(Long bindId, String sessionKey) {
        userSocialService.updateSessionKey(bindId, sessionKey);
    }
}
