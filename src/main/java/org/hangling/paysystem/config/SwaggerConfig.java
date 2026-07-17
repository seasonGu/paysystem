package org.hangling.paysystem.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Swagger（Springdoc OpenAPI）配置类
 * <p>
 * 访问地址：
 * <ul>
 *   <li>Swagger UI：<a href="http://localhost:8080/swagger-ui.html">/swagger-ui.html</a></li>
 *   <li>OpenAPI JSON：<a href="http://localhost:8080/v3/api-docs">/v3/api-docs</a></li>
 * </ul>
 *
 * @author seasonGu
 */
@Configuration
public class SwaggerConfig {

    /**
     * 配置 OpenAPI 元信息
     */
    @Bean
    public OpenAPI customOpenApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("PaySystem API 文档")
                        .description("PaySystem 支付系统 RESTful API 接口文档")
                        .version("v1.0.0")
                        .contact(new Contact()
                                .name("seaonGu")
                                .email("seaonGu@example.com"))
                        .license(new License()
                                .name("Apache 2.0")
                                .url("https://www.apache.org/licenses/LICENSE-2.0")));
    }
}
