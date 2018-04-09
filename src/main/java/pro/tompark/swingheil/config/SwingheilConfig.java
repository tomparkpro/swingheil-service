package pro.tompark.swingheil.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by TomPark
 *
 * @author tom.hyunung.park@gmail.com
 * github : http://github.com/tomparkpro
 */
@Configuration
@EntityScan(basePackages = "pro.tompark.swingheil.model")
@EnableJpaRepositories(basePackages = "pro.tompark.swingheil.repository")
@ComponentScan(excludeFilters = {@ComponentScan.Filter(Configuration.class)}, basePackages = "pro.tompark.swingheil")
public class SwingheilConfig {
}
