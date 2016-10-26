package cass.config;

import cass.repository.HotelByLetterRepository;
import cass.repository.HotelRepository;
import cass.service.HotelService;
import cass.service.HotelServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

@Configuration
@EnableCassandraRepositories(basePackageClasses = HotelRepository.class)
public class RootConfiguration {

    @Bean
    public HotelService hotelService(HotelRepository hotelRepository,
                                     HotelByLetterRepository hotelByLetterRepository) {
        return new HotelServiceImpl(hotelRepository, hotelByLetterRepository);
    }

}
