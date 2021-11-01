package sa.com.stc.vms.attachment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import sa.com.stc.common.annotations.EnableStcCommon;

@SpringBootApplication(scanBasePackages = "sa.com.stc")
@EnableStcCommon
@EnableJpaRepositories( "sa.com.stc")
@EntityScan("sa.com.stc")
public class AttachmentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AttachmentApplication.class, args);
    }

}
