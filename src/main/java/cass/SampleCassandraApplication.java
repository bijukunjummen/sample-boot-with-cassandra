package cass;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.cassandra.CassandraDataAutoConfiguration;

@SpringBootApplication//(exclude = {CassandraDataAutoConfiguration.class})
public class SampleCassandraApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleCassandraApplication.class, args);
	}

}
