package org.jeecg.modules.resource.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.jeecg.common.api.vo.Result;
import org.jeecg.common.system.base.controller.JeecgController;
import org.jeecg.modules.demo.test.entity.JeecgDemo;
import org.jeecg.modules.demo.test.service.IJeecgDemoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *
 */
@Slf4j
@Api(tags = "AI开发子系统")
@RestController
@RequestMapping("/test/ai")
public class ResourceController extends JeecgController<JeecgDemo, IJeecgDemoService> {

    @ApiOperation(value = "测试方法")
    @GetMapping(value = "/test")
    public Result<String> hello() {
        Result<String> result = new Result<String>();

        result.setResult("test");
        result.setSuccess(true);
        return result;
    }
}
