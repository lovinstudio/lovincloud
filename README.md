# lovinCloud 

* 一个简单springcloud的实践
* springboot-admin监控springcloud集群，并且用spring-boot-starter-security做了安全
* springcloud常用组件使用

---

## 技术栈

* spring-cloud-starter-netflix-eureka-server
* spring-cloud-starter-netflix-eureka-client
* spring-cloud-starter-netflix-ribbon
* spring-cloud-starter-openfeign
* spring-cloud-starter-hystrix
* spring-boot-admin-starter-client
* spring-boot-admin-starter-server
* spring-cloud-netflix-turbine

## Tips

* 为了测试负载均衡，我们可以用idea启动多个eurekaclient

![注册中心](./static/images/注册中心.png)
![监控概览](./static/images/wallboard.png)
![详情](./static/images/detail.png)


## TODOS

- [x]  1.Turbine，聚合监控
- [x]  2.SpringCloud Config
- [x]  3.SpringCloud Config+RabbitMQ
- [ ]  4.SpringBoot-Admin
- [ ]  5.Sleuth，链式监控
- [ ]  6.SpringCloud-Getway
- [ ]  7.漫谈微服务架构：注册中心高可用，架构模式，设计理念
- [ ]  8.组件深入分析


# License
Released under the [MIT](LICENSE) License.
