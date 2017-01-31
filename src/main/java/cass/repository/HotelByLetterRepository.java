package cass.repository;

import cass.domain.HotelByLetter;
import cass.domain.HotelByLetterKey;
import org.springframework.data.repository.CrudRepository;

public interface HotelByLetterRepository
        extends CrudRepository<HotelByLetter, HotelByLetterKey>, HotelByLetterRepositoryCustom {}
