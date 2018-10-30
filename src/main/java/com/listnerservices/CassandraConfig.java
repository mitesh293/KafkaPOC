package com.listnerservices;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories(
        basePackages = "com")
public class CassandraConfig extends AbstractCassandraConfiguration {
    @Override
    protected String getKeyspaceName() {
        return "javasampleapproach";
    }
    //
}
