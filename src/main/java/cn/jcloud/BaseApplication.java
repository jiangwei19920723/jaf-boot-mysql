package cn.jcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import cn.jcloud.repository.BaseRepositoryImpl;

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
@EnableJpaRepositories(value = "cn.jcloud",
includeFilters = {@ComponentScan.Filter(Repository.class)},
repositoryBaseClass = BaseRepositoryImpl.class)
public abstract class BaseApplication {
}
