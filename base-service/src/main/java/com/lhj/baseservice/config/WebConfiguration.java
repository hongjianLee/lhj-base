package com.lhj.baseservice.config;


import com.lhj.baseservice.utils.redis.JedisTemplate;
import lombok.extern.slf4j.Slf4j;
import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Slf4j
@Configuration
@RefreshScope
public class WebConfiguration {

    /**
     * redisHost
     */
    @Value("${spring.redis.host}")
    private String redisHost;

    /**
     * redisPort
     */
    @Value("${spring.redis.port}")
    private int redisPort;

    /**
     * redisPassword
     */
    @Value("${spring.redis.password}")
    private String redisPassword;

    /**
     * redisMaxActive
     */
    @Value("${spring.redis.pool.max-active}")
    private int redisMaxActive;

    /**
     * redisMaxWait
     */
    @Value("${spring.redis.pool.max-wait}")
    private int redisMaxWait;

    /**
     * redisMaxIdle
     */
    @Value("${spring.redis.pool.max-idle}")
    private int redisMaxIdle;

    /**
     * redisTimeout
     */
    @Value("${spring.redis.timeout}")
    private int redisTimeout;

    /**
     * JedisTemplate
     *
     * @return JedisTemplate
     */
    @Bean(name = "jedisTemplate")
    public JedisTemplate jedisTemplate() {
        JedisTemplate template = new JedisTemplate();
        template.setServer(redisHost);
        template.setMaxActive(redisMaxActive);
        template.setMaxIdle(redisMaxIdle);
        template.setMaxWait(redisMaxWait);
        template.setTimeout(redisTimeout);
        template.setPort(redisPort);
        template.setPassword(redisPassword);
        return template;
    }

    @Bean(name = "redissonClient")
    public RedissonClient redissonClient() {
        Config config = new Config();
        String address = "redis://" + redisHost + ":" + redisPort;
        config.useSingleServer().setAddress(address).setPassword(redisPassword).setDatabase(0);
        return Redisson.create(config);
    }
}
