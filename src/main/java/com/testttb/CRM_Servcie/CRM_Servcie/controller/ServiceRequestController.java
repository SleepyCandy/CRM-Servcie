package com.testttb.CRM_Servcie.CRM_Servcie.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.testttb.CRM_Servcie.CRM_Servcie.DTO.ResponseDto;
import com.testttb.CRM_Servcie.CRM_Servcie.DTO.ServiceRequestDto;
import com.testttb.CRM_Servcie.CRM_Servcie.service.ServiceRequestService;
import com.testttb.CRM_Servcie.CRM_Servcie.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.security.auth.login.AccountNotFoundException;

@RestController
@RequestMapping("/api/requests")
public class ServiceRequestController {

    @Autowired
    private ServiceRequestService serviceRequestService;

    @Autowired
    TestService testService;

    @PostMapping
    public ResponseEntity<ResponseDto> createRequest(@RequestBody ServiceRequestDto requestDto) throws AccountNotFoundException, JsonProcessingException {
        testService.testCustomTracing();
        return ResponseEntity.ok(new ResponseDto("0000","success",serviceRequestService.createRequest(requestDto)));
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
