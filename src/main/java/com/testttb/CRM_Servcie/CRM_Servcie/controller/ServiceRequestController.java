package com.testttb.CRM_Servcie.CRM_Servcie.controller;

import com.testttb.CRM_Servcie.CRM_Servcie.DTO.ServiceRequestDto;
import com.testttb.CRM_Servcie.CRM_Servcie.service.ServiceRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/requests")
public class ServiceRequestController {

    @Autowired
    private ServiceRequestService serviceRequestService;

    @PostMapping
    public ResponseEntity<ServiceRequestDto> createRequest(@RequestBody ServiceRequestDto requestDto) {
        return ResponseEntity.ok(serviceRequestService.createRequest(requestDto));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ServiceRequestDto> getRequest(@PathVariable Long id) {
        return ResponseEntity.ok(serviceRequestService.getRequestById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ServiceRequestDto> updateRequestStatus(@PathVariable Long id, @RequestParam String status) {
        return ResponseEntity.ok(serviceRequestService.updateRequestStatus(id, status));
    }

}
