package te.jonathan.kit.spring.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
//@ComponentScan(basePackages = {"te.jonathan.kit"})
@Import({WebAppConfig.class})
public class RootConfig {
}
