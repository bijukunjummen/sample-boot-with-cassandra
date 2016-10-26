package cass.repository;

import cass.domain.Hotel;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface HotelRepository extends CrudRepository<Hotel, UUID>, HotelRepositoryCustom {}
