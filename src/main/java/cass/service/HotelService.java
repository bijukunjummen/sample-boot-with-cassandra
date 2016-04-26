package cass.service;


import cass.domain.Hotel;

import java.util.UUID;

public interface HotelService {
    Hotel save(Hotel hotel);
    Hotel update(Hotel hotel);
    Hotel findOne(UUID uuid);
    void delete(UUID uuid);
}
