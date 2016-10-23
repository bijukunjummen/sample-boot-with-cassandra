package cass;

import cass.domain.Hotel;
import cass.repository.HotelRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SampleCassandraApplication.class)
public class SampleCassandraApplicationTest {

	@Autowired
	private HotelRepository hotelRepository;

	@Test
	public void repositoryCrudOperations() {
		Hotel sample = sampleHotel();
		this.hotelRepository.save(sample);

		Hotel savedHotel = this.hotelRepository.findOne(sample.getId());

		assertThat(savedHotel.getName(), equalTo("Sample Hotel"));

		this.hotelRepository.delete(savedHotel);
	}

	private Hotel sampleHotel() {
		Hotel hotel = new Hotel();
		hotel.setId(UUID.randomUUID());
		hotel.setName("Sample Hotel");
		hotel.setAddress("Sample Address");
		hotel.setZip("8764");
		return hotel;
	}

}
