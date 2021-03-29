package com.noxus.draven.alibaba.ilford.provider;

import com.alibaba.csp.sentinel.adapter.spring.webmvc.callback.BlockExceptionHandler;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.alibaba.csp.sentinel.slots.block.authority.AuthorityException;
import com.alibaba.csp.sentinel.slots.block.degrade.DegradeException;
import com.alibaba.csp.sentinel.slots.block.flow.FlowException;
import com.alibaba.csp.sentinel.slots.block.flow.param.ParamFlowException;
import com.alibaba.csp.sentinel.slots.system.SystemBlockException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 〈功能概述〉<br>
 *
 * @className: UrlBlockExceptionHandler
 * @package: com.noxus.draven.alibaba.ilford.consumer
 * @author: draven
 * @date: 2021/3/28 22:03
 */

@Configuration
public class SentinelBlockHandler implements BlockExceptionHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws Exception {
        ResponseDate responseDate = null;
        if (e instanceof FlowException) {
            responseDate = new ResponseDate(-1, "接口被限流了");
        } else if (e instanceof DegradeException) {
            responseDate = new ResponseDate(-2, "接口被降级了");
        } else if (e instanceof ParamFlowException) {
            responseDate = new ResponseDate(-2, "接口被热点限流了");
        } else if (e instanceof AuthorityException) {
            responseDate = new ResponseDate(-2, "接口被授权规则限制访问了");
        } else if (e instanceof SystemBlockException) {
            responseDate = new ResponseDate(-2, "接口被系统规则限制了了");
        }
        //String s = JSON.toJSONString(responseDate);
        //String s1 = new String(){s.getBytes(StandardCharsets.UTF_8).toString()};
        //String s_utf8 = new String(s.getBytes(), "UTF-8");
        ObjectMapper objectMapper = new ObjectMapper();
        String errMsg = objectMapper.writeValueAsString(responseDate);
        //httpServletResponse.setCharacterEncoding("utf‐8");
        httpServletResponse.setHeader("Content‐Type", "application/json;charset=utf‐8");
        httpServletResponse.setContentType("application/json;charset=utf‐8");
        httpServletResponse.getWriter().write(errMsg);
    }


}

@Data
@NoArgsConstructor
@AllArgsConstructor
class ResponseDate {
    private Integer code;
    private String message;
}


   /* private void warrperResponse(HttpServletResponse httpServletResponse, ErrorEnum errorEnum) throws IOException {
        httpServletResponse.setStatus(500);
        httpServletResponse.setCharacterEncoding("UTF‐8");
        httpServletResponse.setHeader("Content‐Type", "application/json;charset= utf‐8");
        httpServletResponse.setContentType("application/json;charset=utf‐8");
        ObjectMapper objectMapper = new ObjectMapper();
        String errMsg = objectMapper.writeValueAsString(new ErrorResult(errorEnum));
        httpServletResponse.getWriter().write(errMsg);
    }*/
