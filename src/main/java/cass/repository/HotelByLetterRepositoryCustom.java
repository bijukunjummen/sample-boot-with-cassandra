package cass.repository;

import cass.domain.HotelByLetter;
import cass.domain.HotelByLetterKey;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HotelByLetterRepositoryCustom {
    List<HotelByLetter> findByFirstLetter(String letter);
}
