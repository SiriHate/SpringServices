package com.siri_hate.backend_service_1.controller;

import com.siri_hate.backend_service_1.model.TripReport;
import com.siri_hate.backend_service_1.service.TripReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
public class TripReportController {

    private final TripReportService tripReportService;

    @Autowired
    public TripReportController(TripReportService tripReportService) {
        this.tripReportService = tripReportService;
    }

    @GetMapping("/display_report")
    public Optional<TripReport> getOrderById(@RequestParam Long id){
        return tripReportService.getTripReport(id);
    }

    @GetMapping("/display_all_reports")
    public List<TripReport> getAllPayments(){
        return tripReportService.getAllTripReports();
    }

    @PostMapping("/add_report")
    public Long addOrder(@RequestBody TripReport tripReport){
        return tripReportService.addTripReport(tripReport);
    }
}
