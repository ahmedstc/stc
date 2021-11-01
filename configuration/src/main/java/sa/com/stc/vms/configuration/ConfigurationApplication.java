package sa.com.stc.vms.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import sa.com.stc.common.annotations.EnableStcCommon;

import javax.annotation.PostConstruct;

@SpringBootApplication(scanBasePackages = "sa.com.stc")
@EnableStcCommon
@EnableJpaRepositories("sa.com.stc")
@EntityScan("sa.com.stc")
public class ConfigurationApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigurationApplication.class, args);
    }

    @PostConstruct
    public void inialSetup() {}
}
