package com.siri_hate.backend_service_1.repository;

import com.siri_hate.backend_service_1.model.TripReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TripReportRepository extends JpaRepository<TripReport, Long> {
}