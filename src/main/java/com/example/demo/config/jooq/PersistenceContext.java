package com.example.demo.config.jooq;

import org.jooq.SQLDialect;
import org.jooq.impl.DataSourceConnectionProvider;
import org.jooq.impl.DefaultConfiguration;
import org.jooq.impl.DefaultDSLContext;
import org.jooq.impl.DefaultExecuteListenerProvider;
import org.mariadb.jdbc.MariaDbDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@ComponentScan({"generated.org.jooq.tables"})
@EnableTransactionManagement
@PropertySource("classpath:application.yml")
public class PersistenceContext {
	private final String SQL_DIALECT_NAME = "MARIADB";

	@Autowired
	Environment environment;

	@Bean
	public DataSource dataSource() throws SQLException {
		MariaDbDataSource dataSource = new MariaDbDataSource();

		dataSource.setUrl(environment.getRequiredProperty("spring.datasource.url"));
		dataSource.setUser(environment.getRequiredProperty("spring.datasource.username"));
		dataSource.setPassword(environment.getRequiredProperty("spring.datasource.password"));

		return dataSource;
	}

	@Bean
	public TransactionAwareDataSourceProxy transactionAwareDataSource() throws SQLException {
		return new TransactionAwareDataSourceProxy(dataSource());
	}

	@Bean
	public DataSourceTransactionManager transactionManager() throws SQLException {
		return new DataSourceTransactionManager(dataSource());
	}

	@Bean
	public DataSourceConnectionProvider connectionProvider() throws SQLException {
		return new DataSourceConnectionProvider(transactionAwareDataSource());
	}

	@Bean
	public ExceptionTranslator exceptionTransformer() {
		return new ExceptionTranslator();
	}

	@Bean
	public DefaultDSLContext dsl() throws SQLException {
		return new DefaultDSLContext(configuration());
	}

	@Bean
	public DefaultConfiguration configuration() throws SQLException {
		DefaultConfiguration jooqConfiguration = new DefaultConfiguration();
		jooqConfiguration.set(connectionProvider());
		jooqConfiguration.set(new DefaultExecuteListenerProvider(exceptionTransformer()));

		SQLDialect dialect = SQLDialect.valueOf(SQL_DIALECT_NAME);
		jooqConfiguration.set(dialect);

		return jooqConfiguration;
	}
}
