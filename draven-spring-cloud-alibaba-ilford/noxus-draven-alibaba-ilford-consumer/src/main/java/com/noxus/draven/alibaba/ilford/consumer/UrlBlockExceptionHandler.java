package com.noxus.draven.alibaba.ilford.consumer;

/**
 * 〈功能概述〉<br>
 *  预留异常 配置配置
 * @className: UrlBlockExceptionHandler
 * @package: com.noxus.draven.alibaba.ilford.consumer
 * @author: draven
 * @date: 2021/3/28 22:03
 */
/*@Configuration
public class UrlBlockExceptionHandler implements BlockExceptionHandler {
    @Override
    public void handle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, BlockException e) throws Exception {
        ResponseDate responseDate = null;
        if (e instanceof FlowException) {
            responseDate = new ResponseDate(-1, "consumer接口被限流了");
        } else if (e instanceof DegradeException) {
            responseDate = new ResponseDate(-2, "consumer接口被降级了");
        } else if (e instanceof ParamFlowException) {
            responseDate = new ResponseDate(-2, "consumer接口被热点限流了");
        } else if (e instanceof AuthorityException) {
            responseDate = new ResponseDate(-2, "consumer接口被授权规则限制访问了");
        } else if (e instanceof SystemBlockException) {
            responseDate = new ResponseDate(-2, "consumer接口被系统规则限制了了");
        }
        httpServletResponse.getWriter().write(JSON.toJSONString(responseDate));
    }
}

@Data
@NoArgsConstructor
@AllArgsConstructor
class ResponseDate {
    private Integer code;
    private String message;
}*/
