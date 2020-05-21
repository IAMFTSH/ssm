package org.me.learn_ssm.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;


@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .groupName("分组A")
                .enable(true)   //是否启用Swagger  默认启用               .enable(flag)
                .select()
                //basePackage需要扫描的包，默认还会会扫描错误页面的controller和容器内的Controller
                //any全部，   没实验
                // none不扫描，   没实验
                // withClassAnnotation扫描类上的注解（arg是射对象）   没实验
                //withMethodAnnotation扫描方法的注解  懒得管了
                .apis(RequestHandlerSelectors.basePackage("org.me.learn_ssm.controller"))
                //过滤  只扫描请求路径中符合的
/*                .paths(PathSelectors.ant("/user/**"))*/
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("FTSH", "https://www.hao123.com/", "2244456@qq.com");
        return new ApiInfo(
                "title",
                "description",
                "version",
                "https://www.baidu.com/",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
