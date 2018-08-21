package br.com.livrariaecommerce.configuration;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

public class JPAConfiguration {

	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryGeneratterObject() {
		LocalContainerEntityManagerFactoryBean localContainerEntityManagerFactoryBean 
			= new LocalContainerEntityManagerFactoryBean();
		JpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
		localContainerEntityManagerFactoryBean.setJpaVendorAdapter(jpaVendorAdapter);
		
		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
		driverManagerDataSource.setPassword("");
		driverManagerDataSource.setUsername("root");
		driverManagerDataSource.setUrl("jdbc:mysql://localhost:3306/livrariaecommerce");
		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.DriverName");
		localContainerEntityManagerFactoryBean.setDataSource(driverManagerDataSource);
		
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");
		properties.setProperty("hibernate.show_sql", "true");
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		localContainerEntityManagerFactoryBean.setJpaProperties(properties);
		
		localContainerEntityManagerFactoryBean.setPackagesToScan("br.com.livrariaecommerce.entity");
		return localContainerEntityManagerFactoryBean;
	}
}
