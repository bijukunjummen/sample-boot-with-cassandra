package cass.repository;

import cass.domain.Hotel;
import com.datastax.driver.core.querybuilder.QueryBuilder;
import com.datastax.driver.core.querybuilder.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.cassandra.core.CassandraTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HotelRepositoryImpl implements HotelRepositoryCustom {

    private final CassandraTemplate cassandraTemplate;

    @Autowired
    public HotelRepositoryImpl(CassandraTemplate cassandraTemplate) {
        this.cassandraTemplate = cassandraTemplate;
    }

    @Override
    public List<Hotel> findByState(String state) {
        Select select = QueryBuilder.select().from("hotels_by_state");
        select.where(QueryBuilder.eq("state", state));
        return this.cassandraTemplate.select(select, Hotel.class);
    }
}
