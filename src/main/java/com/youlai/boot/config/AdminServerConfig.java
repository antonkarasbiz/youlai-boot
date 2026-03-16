package com.youlai.boot.config;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Boot Admin Server 配置
 * <p>
 * 启用应用监控服务端，提供可视化监控界面。
 * 访问地址：http://localhost:8800/admin
 * </p>
 *
 * @author Ray
 * @since 2024/1/1
 */
@Configuration
@EnableAdminServer
public class AdminServerConfig {

}
