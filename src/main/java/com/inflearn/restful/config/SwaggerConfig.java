package com.inflearn.restful.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

// lec#4-3. REST API Documentation을 위한 Swagger 사용
@Configuration
@EnableWebMvc
public class SwaggerConfig {

    private static final Contact DEFAULT_CONTACT = new Contact("Jiwon"
            , "http://www.jiwon.com"
            , "jiwon@jiwon.com");

    private static final ApiInfo DEFAULT_API_INFO = new ApiInfo("API TITLE", "My User management Rest API Service", "1.0.0."
            , "urn:tos", DEFAULT_CONTACT, "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", new ArrayList<>());

    private static final Set<String> DEFAULT_PRODUCES_AND_CONSUMES = new HashSet<>(
            Arrays.asList("application/json", "application/xml"));

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(DEFAULT_API_INFO)
                .produces(DEFAULT_PRODUCES_AND_CONSUMES)
                .consumes(DEFAULT_PRODUCES_AND_CONSUMES)
                ;
               // .useDefaultResponseMessages(false)
               // .apiInfo(getApiInfo())
               // .select()
               // .apis(RequestHandlerSelectors.any()) // api 스펙이 작성되어 있는 패키지를 지정한다.
               // .paths(PathSelectors.ant("/*/**"))  // 지정된 URL에 해당하는 요청만 SWAGGER로 만든다
               // .build();
    }

    private ApiInfo getApiInfo() {
        return new ApiInfoBuilder()
                .title("Swagger 사용하기")
                .description("Swagger를 활용한 API 문서 자동화")
                .contact(new Contact("Test Swagger", "https://test.test.com/", "test@gmail.com"))
                .version("1.0")
                .build();
    }
}