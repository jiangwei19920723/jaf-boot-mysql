package cn.jcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

/** 
 * @author  蒋维 
 * @date 创建时间：2018年3月28日 上午11:31:11 
 * @version 1.0 
 * @parameter  
 * @since  
 * @return  
 */
@SpringBootApplication
@ComponentScan(basePackages={"cn.jcloud"})
@EnableJpaAuditing
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
