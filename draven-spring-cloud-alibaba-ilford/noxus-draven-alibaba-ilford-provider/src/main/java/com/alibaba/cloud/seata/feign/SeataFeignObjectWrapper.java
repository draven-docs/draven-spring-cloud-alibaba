/*
package com.alibaba.cloud.seata.feign;

import feign.Client;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.cloud.loadbalancer.blocking.client.BlockingLoadBalancerClient;
import org.springframework.cloud.loadbalancer.support.LoadBalancerClientFactory;
import org.springframework.cloud.openfeign.loadbalancer.FeignBlockingLoadBalancerClient;
//import org.springframework.cloud.openfeign.ribbon.LoadBalancerFeignClient;

public class SeataFeignObjectWrapper {
    private static final Log LOG = LogFactory.getLog(SeataFeignObjectWrapper.class);
    private final BeanFactory beanFactory;
    private CachingSpringLoadBalancerFactory cachingSpringLoadBalancerFactory;
    private LoadBalancerClientFactory springClientFactory;

    SeataFeignObjectWrapper(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    Object wrap(Object bean) {
        if (bean instanceof Client && !(bean instanceof SeataFeignClient)) {
            if (bean instanceof CachingSpringLoadBalancerFactory) {
                CachingSpringLoadBalancerFactory client = (CachingSpringLoadBalancerFactory) bean;
                return new SeataLoadBalancerFeignClient(client.getDelegate(), this.factory(), this.clientFactory(), this);
            } else if (bean instanceof FeignBlockingLoadBalancerClient) {
                FeignBlockingLoadBalancerClient client = (FeignBlockingLoadBalancerClient) bean;
                return new SeataFeignBlockingLoadBalancerClient(client.getDelegate(), (BlockingLoadBalancerClient) this.beanFactory.getBean(BlockingLoadBalancerClient.class), this);
            } else {
                return new SeataFeignClient(this.beanFactory, (Client) bean);
            }
        } else {
            return bean;
        }
    }

    CachingSpringLoadBalancerFactory factory() {
        if (this.cachingSpringLoadBalancerFactory == null) {
            this.cachingSpringLoadBalancerFactory = (SpringLoadBalancerFactory) this.beanFactory.getBean(SpringLoadBalancerFactory.class);
        }

        return this.cachingSpringLoadBalancerFactory;
    }

    LoadBalancerClientFactory clientFactory() {
        if (this.springClientFactory == null) {
            this.springClientFactory = (LoadBalancerClientFactory) this.beanFactory.getBean(LoadBalancerClientFactory.class);
        }

        return this.springClientFactory;
    }
}
*/
