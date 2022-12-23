package com.siri_hate.backend_service_1.service;

import com.siri_hate.backend_service_1.model.TripReport;
import com.siri_hate.backend_service_1.repository.TripReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TripReportService {

    private final TripReportRepository tripReportRepository;

    @Autowired
    public TripReportService(TripReportRepository tripReportRepository) {
        this.tripReportRepository = tripReportRepository;
    }

    public Optional<TripReport> getTripReport(Long id){
        return tripReportRepository.findById(id);
    }

    public List<TripReport> getAllTripReports(){
        return tripReportRepository.findAll(Sort.by(Sort.Direction.ASC, "id"));
    }

    public Long addTripReport(TripReport tripReport){
        return tripReportRepository.saveAndFlush(tripReport).getId();
    }
}