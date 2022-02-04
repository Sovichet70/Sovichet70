package com.example.springbootmysql.repository;

import com.example.springbootmysql.model.Event;
import org.springframework.data.repository.CrudRepository;

public interface EventRepository extends CrudRepository<Event, Long> {
}
