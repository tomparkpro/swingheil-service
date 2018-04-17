package pro.tompark.swingheil.config;

import com.querydsl.jpa.impl.JPAQueryFactory;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

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

    @PersistenceContext
    private EntityManager em;

    @Bean
    public JPAQueryFactory jpaQueryFactory() {
        return new JPAQueryFactory(em);
    }
}
