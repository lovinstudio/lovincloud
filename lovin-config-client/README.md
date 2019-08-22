# lovinconfigclient

* 实践消息总线配置变化

## 写在前面的话
* 以下的每个节点都会注册到注册中心：配置中心服务端、配置中心客户端等等。
### 关于配置
* eureka连接配置：如果要通过config-client刷新配置，必须见连接注册中心的配置添加到**bootstrap.yml**中
~~~yaml
eureka:
  client:
    serviceUrl:
      defaultZone: http://lovin:lovin@localhost:8881/eureka/   # 注意在高可用的时候需要见注册中心配置移到该文件中，在application.yml中见会读取不到配置

~~~
* 监听消息总线配置：也必须添加到**bootstrap.yml**中
~~~yaml
spring:
  bus:
    trace:
      enabled: true
~~~

## 服务端配置
* 添加消息总线pom依赖
~~~pom
        <!--添加消息总线pom-->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-bus-amqp</artifactId>
        </dependency>
~~~
* 添加rabbitmq连接配置
~~~yaml
spring:
  rabbitmq:
    host: 127.0.0.1
    port: 5672
    username: guest
    password: guest
~~~
## 客户端配置
* 添加消息总线pom依赖
~~~pom
        <!--添加消息总线pom-->
        <dependency>
            <groupId>org.springframework.cloud</groupId>
            <artifactId>spring-cloud-starter-bus-amqp</artifactId>
        </dependency>
~~~
* 添加rabbitmq连接配置，在bootstrap.yml中
~~~yaml
spring:
  rabbitmq:
    host: 127.0.0.1
    port: 5672
    username: guest
    password: guest
~~~
*  开启消息跟踪，在bootstrap.yml中
~~~yaml
spring:
  cloud:
    bus:
      trace:
        enabled: true
~~~
## 操作步骤
1. 首先依次启动lovin-eureka-server、lovin-econfig-server、lovin-econfig-client
2. 查看lovin-econfig-server查询配置
![2](images/2.jpg)
3. 查看lovin-econfig-client查询配置
![3](images/3.png)
4. 修改配置，并提交见token的值由lovin改为lovinupdate
![4](images/4.png)
5. 再次查看lovin-econfig-server查询配置
![5](images/5.png)
6. 再次查看lovin-econfig-client查询配置
![6](images/6.png)
7. 刷新消息总线
由于api变更，url变为：localhost:8886/actuator/bus-refresh
![7](images/7.png)
8. 再次查看lovin-econfig-client查询配置
![8](images/8.png)
已经刷新成功，至此消息总线配置已经完成
