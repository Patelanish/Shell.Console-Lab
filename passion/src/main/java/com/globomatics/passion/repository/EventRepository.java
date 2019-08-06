package com.globomatics.passion.repository;

import com.globomatics.passion.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}
