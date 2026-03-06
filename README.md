<div align="center">
   <img alt="logo" width="100" height="100" src="https://foruda.gitee.com/images/1733417239320800627/3c5290fe_716974.png">
   <h2>youlai-boot</h2>
   <img alt="Java" src="https://img.shields.io/badge/Java-17-brightgreen.svg"/>
   <img alt="Spring Boot" src="https://img.shields.io/badge/SpringBoot-4.0.1-green.svg"/>
   <a href="https://gitcode.com/youlai/youlai-boot" target="_blank">
    <img alt="GitCode" src="https://gitcode.com/youlai/youlai-boot/star/badge.svg"/>
   </a>
   <a href="https://gitee.com/youlaiorg/youlai-boot" target="_blank">
     <img alt="Gitee" src="https://gitee.com/youlaiorg/youlai-boot/badge/star.svg"/>
   </a>     
   <a href="https://github.com/haoxianrui/youlai-boot" target="_blank">
     <img alt="GitHub" src="https://img.shields.io/github/stars/haoxianrui/youlai-boot.svg?style=social&label=Stars"/>
   </a>
</div>

<p align="center">
  <a target="_blank" href="https://vue.youlai.tech/">🖥️ 在线预览</a>
  <span>&nbsp;|&nbsp;</span>
  <a target="_blank" href="https://youlai.blog.csdn.net/article/details/145178880">📑 阅读文档</a>
  <span>&nbsp;|&nbsp;</span>
  <a target="_blank" href="https://www.youlai.tech/youlai-boot">🌐 官网</a>
</p>

---

## 📢 项目简介

基于 JDK 17、Spring Boot 4、Spring Security、JWT、Redis、MyBatis-Plus、Vue 3、Element Plus 构建的前后端分离权限管理系统。

[MyBatis-Flex 版本](https://gitee.com/youlaiorg/youlai-boot-flex)

**核心特性**

- **🚀 技术栈**：Spring Boot 4 + Vue 3 + Element Plus，持续跟进最新版本

- **🔐 安全认证**：Spring Security + JWT 无状态认证 + Redis 会话管理，支持令牌自动续期和多端互斥

- **🔑 权限控制**：RBAC 模型，接口级 + 按钮级细粒度权限

- **🛠️ 功能模块**：用户、角色、菜单、部门、字典管理等基础模块

## 🌈 项目生态

youlai-boot 配套前端和移动端项目，形成完整的前后端分离开发体系：

### 后端项目

| 项目 | 技术栈 | 说明 | Gitee | GitHub | AtomGit |
|------|--------|------|-------|--------|---------|
| youlai-boot | Spring Boot 4 + MyBatis-Plus | 标准版后端 | [Gitee](https://gitee.com/youlaiorg/youlai-boot) | [GitHub](https://github.com/haoxianrui/youlai-boot) | [AtomGit](https://atomgit.com/youlai/youlai-boot) |
| youlai-boot-tenant | Spring Boot 3 + MyBatis-Plus | 多租户 SaaS 版 | [Gitee](https://gitee.com/youlaiorg/youlai-boot-tenant) | [GitHub](https://github.com/youlaitech/youlai-boot-tenant) | [AtomGit](https://atomgit.com/youlai/youlai-boot-tenant) |
| youlai-boot-flex | Spring Boot 3 + MyBatis-Flex | MyBatis-Flex 版 | [Gitee](https://gitee.com/youlaiorg/youlai-boot-flex) | - | - |

### 前端项目

| 项目 | 技术栈 | 说明 | Gitee | GitHub | AtomGit |
|------|--------|------|-------|--------|---------|
| vue3-element-admin | Vue 3 + TS + Element Plus | 标准版前端 | [Gitee](https://gitee.com/youlaiorg/vue3-element-admin) | [GitHub](https://github.com/youlaitech/vue3-element-admin) | [AtomGit](https://atomgit.com/youlai/vue3-element-admin) |
| vue3-element-admin-js | Vue 3 + JS + Element Plus | JavaScript 版 | [Gitee](https://gitee.com/youlaiorg/vue3-element-admin-js) | [GitHub](https://github.com/youlaitech/vue3-element-admin-js) | [AtomGit](https://atomgit.com/youlai/vue3-element-admin-js) |
| vue3-element-template | Vue 3 + TS + Element Plus | 精简开发模板 | [Gitee](https://gitee.com/youlaiorg/vue3-element-template) | [GitHub](https://github.com/youlaitech/vue3-element-template) | [AtomGit](https://atomgit.com/youlai/vue3-element-template) |
| vue3-naiveui-admin | Vue 3 + TS + Naive UI | Naive UI 版 | [Gitee](https://gitee.com/youlaiorg/vue3-naiveui-admin) | [GitHub](https://github.com/youlaitech/vue3-naiveui-admin) | [AtomGit](https://atomgit.com/youlai/vue3-naiveui-admin) |

### 移动端项目

| 项目 | 技术栈 | 说明 | Gitee | GitHub | AtomGit |
|------|--------|------|-------|--------|---------|
| youlai-uniapp | Vue 3 + uni-app | 跨平台应用 | [Gitee](https://gitee.com/youlaiorg/youlai-uniapp) | [GitHub](https://github.com/youlaitech/youlai-uniapp) | [AtomGit](https://atomgit.com/youlai/youlai-uniapp) |

## 📚 项目文档

| 文档 | 地址 |
|------|------|
| 在线接口文档 | [Apifox](https://www.apifox.cn/apidoc/shared-195e783f-4d85-4235-a038-eec696de4ea5) |
| 官方文档 | [youlai.tech](https://www.youlai.tech/youlai-boot/) |
| 功能详解 | [https://youlai.blog.csdn.net/article/details/145178880](https://youlai.blog.csdn.net/article/details/145178880) |
| 入门指南 | [https://youlai.blog.csdn.net/article/details/145177011](https://youlai.blog.csdn.net/article/details/145177011) |

## 📁 项目目录

```
youlai-boot
├── docker/                              # Docker 部署
├── sql/                                 # 数据库脚本
│   └── mysql/                           # MySQL 初始化脚本
├── src/main/java/com/youlai/boot/
│   ├── auth/                            # 认证模块
│   ├── common/                          # 公共模块
│   │   ├── annotation/                  # 自定义注解
│   │   ├── base/                        # 基础类
│   │   ├── constant/                    # 常量定义
│   │   ├── enums/                       # 枚举类型
│   │   ├── model/                       # 公共模型
│   │   └── util/                        # 工具类
│   ├── config/                          # 配置模块
│   │   └── property/                    # 配置属性
│   ├── core/                            # 核心模块
│   │   ├── aspect/                      # AOP 切面（日志、防重）
│   │   ├── exception/                   # 全局异常处理
│   │   ├── filter/                      # 过滤器（日志、限流）
│   │   ├── validator/                   # 参数校验
│   │   └── web/                         # 响应封装
│   ├── file/                            # 文件服务
│   ├── plugin/                          # 插件扩展
│   │   ├── knife4j/                     # 接口文档增强
│   │   └── mybatis/                     # MyBatis 扩展
│   ├── security/                        # 安全模块
│   │   ├── exception/                   # 安全异常
│   │   ├── filter/                      # 安全过滤器
│   │   ├── handler/                     # 安全处理器
│   │   ├── model/                       # 安全模型
│   │   ├── provider/                    # 认证提供者
│   │   ├── service/                     # 安全服务
│   │   ├── token/                       # Token 管理
│   │   └── util/                        # 安全工具
│   ├── support/                         # 支撑服务
│   │   ├── mail/                        # 邮件服务
│   │   ├── sms/                         # 短信服务
│   │   └── websocket/                   # WebSocket 服务
│   ├── system/                          # 系统模块
│   │   ├── controller/                  # 控制器
│   │   ├── converter/                   # 对象转换器
│   │   ├── enums/                       # 枚举定义
│   │   ├── handler/                     # 业务处理器
│   │   ├── listener/                    # 事件监听器
│   │   ├── mapper/                      # 数据访问层
│   │   ├── model/                       # 数据模型
│   │   │   ├── bo/                      # 业务对象
│   │   │   ├── dto/                     # 传输对象
│   │   │   ├── entity/                  # 实体对象
│   │   │   ├── form/                    # 表单对象
│   │   │   ├── query/                   # 查询对象
│   │   │   └── vo/                      # 视图对象
│   │   └── service/                     # 业务逻辑层
│   ├── tool/                            # 工具模块
│   │   └── codegen/                     # 代码生成器
│   └── YouLaiBootApplication.java       # 启动类
└── pom.xml                              # Maven 配置
```

## 🚀 快速开始

**详细文档**：[项目启动指南](https://youlai.blog.csdn.net/article/details/145177011)

### 1. 克隆项目

```bash
git clone https://gitee.com/youlaiorg/youlai-boot.git
```

### 2. 初始化数据库

执行 [youlai_admin.sql](sql/mysql/youlai_admin.sql) 创建数据库、表结构和基础数据。

### 3. 修改配置

本地开发需修改 [application-dev.yml](src/main/resources/application-dev.yml) 中的 MySQL 和 Redis 连接信息。

> 默认连接线上环境（仅读权限），仅供体验使用。

### 4. 启动项目

运行 [YoulaiBootApplication.java](src/main/java/com/youlai/boot/YouLaiBootApplication.java)，访问 [http://localhost:8000/doc.html](http://localhost:8000/doc.html) 验证。

## 🐳 Docker 部署

**详细文档**：[部署指南](https://www.youlai.tech/docs/admin/backend/java/deploy.html)

```bash
cd docker
docker-compose up -d
```

## ✅ 项目统计

![](https://repobeats.axiom.co/api/embed/544c5c0b5b3611a6c4d5ef0faa243a9066b89659.svg)

## 🤝 贡献者

[![](https://contrib.rocks/image?repo=haoxianrui/youlai-boot)](https://github.com/haoxianrui/youlai-boot/graphs/contributors)

## 💖 技术交流

欢迎通过以下方式交流学习，获取最新动态和技术支持：

<div align="center">

| 交流方式 | 说明 |
|:---:|:---|
| <img src="https://foruda.gitee.com/images/1737108820762592766/3390ed0d_716974.png" width="120"> | 关注「有来技术」公众号<br/>点击菜单 **交流群** 获取加群二维码 |
| 微信 **`haoxianrui`** | 添加好友时请备注「前端/后端/全栈」|

</div>

---

如果这个项目对你有帮助，欢迎 ⭐️ Star 支持一下！

<p align="center">
  <a href="https://gitee.com/youlaiorg/youlai-boot">⭐ Gitee</a> •
  <a href="https://github.com/haoxianrui/youlai-boot">⭐ GitHub</a> •
  <a href="https://atomgit.com/youlai/youlai-boot">⭐ AtomGit</a> •
  <a href="https://www.youlai.tech">🌐 官网</a> •
  <a href="https://youlai.blog.csdn.net/">📝 博客</a>
</p>
