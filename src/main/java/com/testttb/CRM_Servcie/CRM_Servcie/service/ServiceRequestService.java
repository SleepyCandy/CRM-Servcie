package com.testttb.CRM_Servcie.CRM_Servcie.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.testttb.CRM_Servcie.CRM_Servcie.DTO.ServiceRequestDto;
import com.testttb.CRM_Servcie.CRM_Servcie.HttpService.CreateTicketDTO;
import com.testttb.CRM_Servcie.CRM_Servcie.HttpService.RestFulService;
import org.apache.commons.lang3.ObjectUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.json.GsonJsonParser;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import javax.security.auth.login.AccountNotFoundException;
import java.util.Map;

@Service
public class ServiceRequestService {

    @Autowired
    private RestFulService restFulService;

    public String createRequest(ServiceRequestDto requestDto) throws AccountNotFoundException, JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        CreateTicketDTO createTicketDTO = new CreateTicketDTO();
        createTicketDTO.setTicketType("request");
        createTicketDTO.setStatus("In-progress");
        createTicketDTO.setDescription(requestDto.getDescription());
        createTicketDTO.setCustomerId(requestDto.getCustomerId());
        createTicketDTO.setAccountId(requestDto.getAccountId());
        var response = restFulService.forwardRequestToService(createTicketDTO,"/api/ticket");
        if(ObjectUtils.isEmpty(response)){
            return "response data is null";
        }
        Map<String, Object> responseMap = mapper.readValue(response, Map.class);
        Integer dataString = (Integer) responseMap.get("data");


        return dataString.toString();
    }

    public ServiceRequestDto getRequestById(Long id) {

        return null;
    }

    public ServiceRequestDto updateRequestStatus(Long id, String status) {
        return null;
    }

}
