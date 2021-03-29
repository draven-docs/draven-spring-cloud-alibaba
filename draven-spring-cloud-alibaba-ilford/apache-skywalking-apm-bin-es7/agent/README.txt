-javaagent:/Users/draven/Documents/documents/java/documents/draven-spring-cloud-alibaba/draven-spring-cloud-alibaba-ilford/apache-skywalking-apm-bin-es7/agent/skywalking-agent.jar -Dskywalking.agent.service_name=alibaba-consumer -Dskywalking.collector.backend_service=10.211.55.5:11800

# 指定探针位置
-javaagent:/Users/draven/Documents/documents/java/documents/draven-spring-cloud-alibaba/draven-spring-cloud-alibaba-ilford/apache-skywalking-apm-bin-es7/agent/skywalking-agent.jar
# 指定客户端服务名称
-Dskywalking.agent.service_name=alibaba-consumer
# 指定collector服务地址
-Dskywalking.collector.backend_service=10.211.55.5:11800
