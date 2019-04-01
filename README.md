# guava

#### 介绍
guava基础组件学习实例
+ spring Redis缓存
+ Spring RabbitMQ
#### 软件架构
+ Spring MVC 
+ mysql 
+ docker-RabbitMq
+ docker-Redis

#### 涉及内容

1. Guava 主要类组件DEMO
2. Spring + Redis实现缓存机制，configuration(n)：组态，configure(v): 配置组装
3. @Cacheable(value = "user_cache",key = "#id")缓存缓存结果
4. @CacheEvict(value,allEntries) 清理缓存
5. @CachePut 刷新缓存
6. KeyGenerator & cacheManager缓存管理器 & redisTemplate序列化设置
7. 同一个应用中MQ的生产者和消费者应使用不同的连接(rabbitTemplate.setUsePublisherConnection(true))
8. 使用RabbitListenerContainerFactory设置消费者每次消费的数目、消费者个数和Max消费者数据(SimpleRabbitListenerContainerFactory)
9. RabbitMq 异步消费的监听器接口
    ChannelListener：用于监听通道的创建和销毁
    ConnectionListener：监听连接的创建和销毁
    RecoveryListener：监听自动重连情况
    BlockedListener：监听连接的阻塞(及原因)和阻塞恢复
    ConfirmCallbackListener：消息到达Exchange交换机时ack回调
    ReturnCallBackListener：消息到达交换器但找不到匹配队列时的回调(结合CorrelationData定位信息)
    CorrelationData：生产者利用CorrelationData设置消息属性并获取生产情况
            rabbitTemplate.convertAndSend(RabbitMQConstant.OLIVER_EXCHAGE,
                                routingKey,user,correlationData);
10. RabbitMq后台操作界面能够move消息到另外一个界面
11. 死信队列 用来保存满足一定条件未被消费的消息比如 5min未被消费掉


#### 码云特技

1. 使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2. 码云官方博客 [blog.gitee.com](https://blog.gitee.com)
3. 你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目
4. [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目
5. 码云官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6. 码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)