package cass.repository;

import cass.domain.HotelByLetter;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;
import org.springframework.cassandra.core.CqlTemplate;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HotelByLetterRepositoryImpl implements HotelByLetterRepositoryCustom {
    private final CassandraTemplate cassandraTemplate;

    public HotelByLetterRepositoryImpl(CassandraTemplate cassandraTemplate) {
        this.cassandraTemplate = cassandraTemplate;
    }

    @Override
    public List<HotelByLetter> findByFirstLetter(String letter) {
        Select select = QueryBuilder.select().from("hotel_by_letter");
        select.where(QueryBuilder.eq("first_letter", letter));
        return this.cassandraTemplate.select(select, HotelByLetter.class);
    }

}
