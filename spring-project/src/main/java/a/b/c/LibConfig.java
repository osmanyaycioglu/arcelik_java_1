package a.b.c;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LibConfig {

    @Bean
    public ExtraBean extraBeanEx() {
        return new ExtraBean();
    }

}
