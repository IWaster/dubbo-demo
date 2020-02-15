package io.ouka.dubbo.provider.service;

import io.ouka.dubbo.api.TestService;
import org.apache.dubbo.config.annotation.Service;

/**
 * Description:
 * User: Ouka
 * Date: 2020-02-15
 * Time: 22:09
 */
@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {
    @Override
    public String test(String str) {
        return "数据是"+str;
    }
}
