package com.noxus.draven.alibaba.hoxton.provider.datasources.sentinels;

import com.alibaba.csp.sentinel.datasource.ReadableDataSource;
import com.alibaba.csp.sentinel.datasource.WritableDataSource;
import com.alibaba.csp.sentinel.datasource.nacos.NacosDataSource;
import com.alibaba.csp.sentinel.init.InitFunc;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRule;
import com.alibaba.csp.sentinel.slots.block.flow.FlowRuleManager;
import com.alibaba.csp.sentinel.transport.util.WritableDataSourceRegistry;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.nacos.api.PropertyKeyConst;

import java.util.List;
import java.util.Properties;

/**
 * 〈功能概述〉<br>
 *
 * @className: DataSourceInitFuncFile
 * @package: com.noxus.draven.alibaba.hoxton.provider.datasources.sentinels
 * @author: draven
 * @date: 2020/11/19 15:18
 */
public class DataSourceInitFuncNacos implements InitFunc {

    @Override
    public void init() throws Exception {

        final String remoteAddress = "localhost";
        final String groupId = "SENTINEL_GROUP";
        final String dataId = "SENTINEL_GROUP";
        final String NACOS_NAMESPACE_ID = "sentinel-group";


        if ("".equals(NACOS_NAMESPACE_ID)) {
            loadRules(remoteAddress, groupId, dataId);
        } else {
            loadMyNamespaceRules(remoteAddress, groupId, dataId, NACOS_NAMESPACE_ID);
        }


    }

    private void loadRules(String remoteAddress, String groupId, String dataId) {
        ReadableDataSource<String, List<FlowRule>> flowRuleDataSource = new NacosDataSource<>(remoteAddress, groupId, dataId,
                source -> JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
                }));
        FlowRuleManager.register2Property(flowRuleDataSource.getProperty());
    }

    private void loadMyNamespaceRules(String remoteAddress, String groupId, String dataId, String NACOS_NAMESPACE_ID) {
        String USERNAME = "nacos";
        String PASSWORD = "nacos";
        Properties properties = new Properties();
        properties.put(PropertyKeyConst.SERVER_ADDR, remoteAddress);
        properties.put(PropertyKeyConst.NAMESPACE, NACOS_NAMESPACE_ID);
        properties.put(PropertyKeyConst.USERNAME, USERNAME);
        properties.put(PropertyKeyConst.PASSWORD, PASSWORD);


        ReadableDataSource<String, List<FlowRule>> flowRuleDataSource = new NacosDataSource<>(properties, groupId, dataId,
                source -> JSON.parseObject(source, new TypeReference<List<FlowRule>>() {
                }));
        FlowRuleManager.register2Property(flowRuleDataSource.getProperty());
        WritableDataSource<List<FlowRule>> flowDataSource = WritableDataSourceRegistry.getFlowDataSource();
        WritableDataSourceRegistry.registerFlowDataSource(flowDataSource);

    }
}
