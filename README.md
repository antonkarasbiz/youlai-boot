# youlai-boot

Monolithic administration backend for RBAC products. Built on Java 17, Spring Boot, and Spring Security, it exposes the APIs used by a Vue 3 + Element Plus console: users, roles, menus, departments, dictionaries, and code generation.

## Overview

This service is the Java side of a separated admin stack. It is kept in the portfolio as a production-shaped permission system — JWT sessions, Redis-backed tokens, and interface-level authorization — rather than a tutorial CRUD app.

Companion frontend pattern: Vue 3 + Element Plus admin consoles.

## Capabilities

- JWT authentication with token renewal
- Multi-client session controls
- RBAC at API and button granularity
- User, role, menu, department, and dictionary modules
- Built-in code generator for CRUD slices
- MySQL schema bootstrap from `sql/mysql/`
- Redis for session and cache state

## Tech stack

- JDK 17+
- Spring Boot / Spring Security
- MySQL 5.7+ or 8.x
- Redis 6.0+

## Getting started

```bash
# 1. Create the schema
#    apply sql/mysql/youlai_admin.sql

# 2. Point the profile at local MySQL and Redis
#    src/main/resources/application-dev.yml

# 3. Run the Spring Boot application from the project root
```

Default profile is development. Promote configuration through environment-specific YAML; do not commit production secrets.

## Repository role

English product documentation for the [antonkarasbiz](https://github.com/antonkarasbiz) full-stack practice. The implementation follows the youlai-boot admin architecture (Apache 2.0). Upstream project names and Chinese docs remain in-tree for license and history.

## License

Apache License 2.0. See the repository license file.

## Maintainer

[Anton Karas](https://github.com/antonkarasbiz) — full-stack, blockchain, and AI engineering.
