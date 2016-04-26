package cass.config;

import cass.repository.HotelRepository;
import cass.service.HotelService;
import cass.service.HotelServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RootConfiguration {

    @Bean
    public HotelService hotelService(HotelRepository hotelRepository) {
        return new HotelServiceImpl(hotelRepository);
    }

}
