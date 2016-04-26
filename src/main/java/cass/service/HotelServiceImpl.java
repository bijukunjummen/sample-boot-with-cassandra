package cass.service;

import cass.domain.Hotel;
import cass.repository.HotelRepository;

import java.util.UUID;

public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;

    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Hotel save(Hotel hotel) {
        return this.hotelRepository.save(hotel);
    }

    @Override
    public Hotel update(Hotel hotel) {
        return this.hotelRepository.save(hotel);
    }

    @Override
    public Hotel findOne(UUID uuid) {
        return this.hotelRepository.findOne(uuid);
    }

    @Override
    public void delete(UUID uuid) {
        this.hotelRepository.delete(uuid);
    }
}
