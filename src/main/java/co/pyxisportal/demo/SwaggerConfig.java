package co.pyxisportal.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
	private static final String TITLE = "Swagger Demo";
	private static final String DESCRIPTION = "Swagger Demo Description";
	private static final String VERSION = "1.0.0";
	private static final String TERMS_OF_SERVICE_URL = "http://www.google.com/terms";
	private static final String CONTACT_NAME = "Rafael";
	private static final String LICENSE = "Apache Commons";
	private static final String LICENSE_URL = "http://example.com/license";

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.any())
				.paths(PathSelectors.ant("/demos/**")).build().apiInfo(apiInfo());
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title(TITLE).description(DESCRIPTION).version(VERSION).license(LICENSE)
				.licenseUrl(LICENSE_URL).termsOfServiceUrl(TERMS_OF_SERVICE_URL).build();
	}
}
