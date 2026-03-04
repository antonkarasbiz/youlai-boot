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

## 🌈 项目源码

| 项目 | Gitee | GitHub | GitCode |
|------|-------|--------|---------|
| Java 后端 | [youlai-boot](https://gitee.com/youlaiorg/youlai-boot) | [youlai-boot](https://github.com/haoxianrui/youlai-boot) | [youlai-boot](https://gitcode.com/youlai/youlai-boot) |
| Vue 3 前端 | [vue3-element-admin](https://gitee.com/youlaiorg/vue3-element-admin) | [vue3-element-admin](https://github.com/youlaitech/vue3-element-admin) | [vue3-element-admin](https://gitcode.com/youlai/vue3-element-admin) |
| uni-app 移动端 | [vue-uniapp-template](https://gitee.com/youlaiorg/vue-uniapp-template) | [vue-uniapp-template](https://github.com/youlaitech/vue-uniapp-template) | [vue-uniapp-template](https://gitcode.com/youlai/vue-uniapp-template) |

## 📚 项目文档

| 文档 | 地址 |
|------|------|
| 在线接口文档 | [Apifox](https://www.apifox.cn/apidoc/shared-195e783f-4d85-4235-a038-eec696de4ea5) |
| 官方文档 | [youlai.tech](https://www.youlai.tech/youlai-boot/) |
| 功能详解 | [CSDN](https://youlai.blog.csdn.net/article/details/145178880) |
| 入门指南 | [CSDN](https://youlai.blog.csdn.net/article/details/145177011) |

## 📁 项目目录

<details>
<summary>展开目录结构</summary>

```
youlai-boot
├── docker/                              # Docker 部署
│   ├── minio/                           # MinIO 对象存储
│   ├── mysql/                           # MySQL 数据库
│   ├── postgres/                        # PostgreSQL 数据库
│   ├── redis/                           # Redis 缓存
│   ├── xxljob/                          # XXL-JOB 调度中心
│   └── docker-compose.yml               # 容器编排脚本
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
│   │   ├── controller/                  # 文件接口
│   │   ├── model/                       # 文件模型
│   │   └── service/                     # 文件逻辑
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
│   │   │   ├── event/                   # 事件对象
│   │   │   ├── form/                    # 表单对象
│   │   │   ├── query/                   # 查询对象
│   │   │   └── vo/                      # 视图对象
│   │   └── service/                     # 业务逻辑层
│   ├── tool/                            # 工具模块
│   │   └── codegen/                     # 代码生成器
│   └── YouLaiBootApplication.java       # 启动类
└── pom.xml                              # Maven 配置
```

</details>

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

**公众号**：关注「有来技术」，点击菜单 **交流群** 获取加群二维码。

![](https://foruda.gitee.com/images/1737108820762592766/3390ed0d_716974.png)

**微信**：添加 **`haoxianrui`**，备注「前端/后端/全栈」

**博客**：[CSDN](https://youlai.blog.csdn.net/) | [掘金](https://juejin.cn/user/4187394044331261) | [博客园](https://www.cnblogs.com/haoxianrui) | [51CTO](https://blog.51cto.com/youlai) | [知乎](https://www.zhihu.com/people/haoxr)

**官网**：[https://www.youlai.tech](https://www.youlai.tech/)

**代码仓库**：[Gitee](https://gitee.com/youlaiorg) | [GitHub](https://github.com/youlaitech) | [AtomGit](https://atomgit.com/youlai)
