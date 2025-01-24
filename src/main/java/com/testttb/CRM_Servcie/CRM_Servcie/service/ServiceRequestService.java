package com.testttb.CRM_Servcie.CRM_Servcie.service;

import com.testttb.CRM_Servcie.CRM_Servcie.DTO.ServiceRequestDto;
import com.testttb.CRM_Servcie.CRM_Servcie.HttpService.CreateTicketDTO;
import com.testttb.CRM_Servcie.CRM_Servcie.HttpService.RestFulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class ServiceRequestService {

    @Autowired
    private RestFulService restFulService;

    public ServiceRequestDto createRequest(ServiceRequestDto requestDto) {
        CreateTicketDTO createTicketDTO = new CreateTicketDTO();
        createTicketDTO.setTicketType("request");
        createTicketDTO.setStatus("In-progress");
        createTicketDTO.setCustomerId(requestDto.getCustomerId());
        var response = restFulService.forwardRequestToService(createTicketDTO,"/api/ticket");
        return null;
    }

    public ServiceRequestDto getRequestById(Long id) {

        return null;
    }

    public ServiceRequestDto updateRequestStatus(Long id, String status) {
        return null;
    }

}
