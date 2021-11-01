package sa.com.stc.vms.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sa.com.stc.common.annotations.EnableStcCommon;

@SpringBootApplication(scanBasePackages = "sa.com.stc")
@EnableStcCommon
public class BackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackendApplication.class, args);

    }
}
