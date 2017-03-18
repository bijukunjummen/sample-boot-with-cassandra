package cass.repository;

import cass.domain.HotelByLetter;
import cass.domain.HotelByLetterKey;

import java.util.List;

public interface HotelByLetterRepository {
    List<HotelByLetter> findByFirstLetter(String letter);
    HotelByLetter save(HotelByLetter hotelByLetter);
    void delete(HotelByLetterKey hotelByLetterKey);
}
