package cass.repository;

import cass.domain.Hotel;

import java.util.List;

public interface HotelRepositoryCustom {
    List<Hotel> findByState(String state);
}
