/*
package com.noxus.draven.alibaba.ilford.provider.config;

import com.alibaba.cloud.seata.feign.SeataFeignBlockingLoadBalancerClient;
import com.alibaba.cloud.seata.feign.SeataFeignClient;
import com.alibaba.cloud.seata.feign.SeataLoadBalancerFeignClient;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.cloud.loadbalancer.blocking.client.BlockingLoadBalancerClient;
import org.springframework.cloud.openfeign.loadbalancer.FeignBlockingLoadBalancerClient;
import feign.Client;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.openfeign.ribbon.CachingSpringLoadBalancerFactory;
import org.springframework.cloud.openfeign.ribbon.LoadBalancerFeignClient;

public class SeataFeignObjectWrapper {
    private static final Log LOG = LogFactory.getLog(SeataFeignObjectWrapper.class);
    private final BeanFactory beanFactory;
    private CachingSpringLoadBalancerFactory cachingSpringLoadBalancerFactory;
    // private SpringClientFactory springClientFactory;

    SeataFeignObjectWrapper(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    Object wrap(Object bean) {
        if (bean instanceof Client && !(bean instanceof SeataFeignClient)) {
            if (bean instanceof LoadBalancerFeignClient) {
                LoadBalancerFeignClient client = (LoadBalancerFeignClient) bean;
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
            this.cachingSpringLoadBalancerFactory = (CachingSpringLoadBalancerFactory) this.beanFactory.getBean(CachingSpringLoadBalancerFactory.class);
        }

        return this.cachingSpringLoadBalancerFactory;
    }

    SpringClientFactory clientFactory() {
        if (this.springClientFactory == null) {
            this.springClientFactory = (SpringClientFactory)this.beanFactory.getBean(SpringClientFactory.class);
        }

        return this.springClientFactory;
    }
}
*/
/*
package com.noxus.draven.alibaba.ilford.provider.config;

import com.alibaba.cloud.seata.feign.SeataFeignBlockingLoadBalancerClient;
import com.alibaba.cloud.seata.feign.SeataFeignClient;
import com.alibaba.cloud.seata.feign.SeataLoadBalancerFeignClient;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.cloud.loadbalancer.blocking.client.BlockingLoadBalancerClient;
import org.springframework.cloud.openfeign.loadbalancer.FeignBlockingLoadBalancerClient;
import feign.Client;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.cloud.openfeign.ribbon.CachingSpringLoadBalancerFactory;
import org.springframework.cloud.openfeign.ribbon.LoadBalancerFeignClient;

public class SeataFeignObjectWrapper {
    private static final Log LOG = LogFactory.getLog(SeataFeignObjectWrapper.class);
    private final BeanFactory beanFactory;
    private CachingSpringLoadBalancerFactory cachingSpringLoadBalancerFactory;
    // private SpringClientFactory springClientFactory;

    SeataFeignObjectWrapper(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    Object wrap(Object bean) {
        if (bean instanceof Client && !(bean instanceof SeataFeignClient)) {
            if (bean instanceof LoadBalancerFeignClient) {
                LoadBalancerFeignClient client = (LoadBalancerFeignClient) bean;
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
            this.cachingSpringLoadBalancerFactory = (CachingSpringLoadBalancerFactory) this.beanFactory.getBean(CachingSpringLoadBalancerFactory.class);
        }

        return this.cachingSpringLoadBalancerFactory;
    }

    SpringClientFactory clientFactory() {
        if (this.springClientFactory == null) {
            this.springClientFactory = (SpringClientFactory)this.beanFactory.getBean(SpringClientFactory.class);
        }

        return this.springClientFactory;
    }
}
*/
