package jp.co.isid.cit;

import javax.sql.DataSource;

import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.JdbcLogger;
import org.seasar.doma.jdbc.NoCacheSqlFileRepository;
import org.seasar.doma.jdbc.SqlFileRepository;
import org.seasar.doma.jdbc.dialect.Dialect;
import org.seasar.doma.jdbc.dialect.OracleDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
public class DataSourceConfiguration {

//application.propertyに記述しているデーターベース接続設定を読み込む場合は
// 15行目-28行目のように記述します
	/*
	@Autowired
	private DataSourceProperties properties;

	@Bean
	public DataSource dataSource() {

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(properties.getDriverClassName());
		dataSource.setUrl(properties.getUrl());
		dataSource.setUsername(properties.getUsername());
		dataSource.setPassword(properties.getPassword());

		return new TransactionAwareDataSourceProxy(dataSource);
	}
	*/

//直接データーベース接続設定を記述する場合は32行目-40行目のように記述します
	
@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
		dataSource.setUsername("cit");
		dataSource.setPassword("pass");
		return new TransactionAwareDataSourceProxy(dataSource);
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		return new DataSourceTransactionManager(dataSource());
	}

	@Bean
	public Dialect dialect() {
		return new OracleDialect();
	}

	@Bean
	public SqlFileRepository sqlFileRepository() {
		return new NoCacheSqlFileRepository();
	}

	@Bean
	public Config config() {
		return new Config() {
			@Override
			public Dialect getDialect() {
				return dialect();
			}
			@Override
			public DataSource getDataSource() {
				return dataSource();
			}
			@Override
			public SqlFileRepository getSqlFileRepository() {
				return sqlFileRepository();
			}	
			//Dbロガーを使うために以下を追記
			@Override
	 		public JdbcLogger getJdbcLogger() {
	 		return new DbLogger();
	 		}

		};
	}
	
}
