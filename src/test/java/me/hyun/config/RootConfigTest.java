package me.hyun.config;

import static org.junit.Assert.*;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import me.hyun.AppTest;

public class RootConfigTest extends AppTest {

	@Autowired
	DataSource dataSource;
	
	@Test
	public void DataSourceTest() {
		assertNotNull(dataSource);
	}

}
