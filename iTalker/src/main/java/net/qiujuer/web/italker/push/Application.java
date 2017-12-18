package net.qiujuer.web.italker.push;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;
import net.qiujuer.web.italker.push.service.AccountService;
import org.glassfish.jersey.server.ResourceConfig;

import java.util.logging.Logger;

/**
 * Created by Administrator on 2017/12/18.
 */
public class Application extends ResourceConfig{

    public Application() {
        //注册逻辑处理包名
        packages(AccountService.class.getPackage().getName());

        //注册Json解析器
        register(JacksonJsonProvider.class);

        //注册日志打印输出
        register(Logger.class);
    }
}
