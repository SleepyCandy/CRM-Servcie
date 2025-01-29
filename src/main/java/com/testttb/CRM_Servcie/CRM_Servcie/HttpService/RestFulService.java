package com.testttb.CRM_Servcie.CRM_Servcie.HttpService;

import com.testttb.CRM_Servcie.CRM_Servcie.DTO.ServiceRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class RestFulService {

    private WebClient webClient;

    public RestFulService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl("http://localhost:8082").build();
    }

    public String forwardRequestToService(CreateTicketDTO requestDto,String uri) {
        return webClient.post()
                .uri(uri)
                .bodyValue(requestDto)
                .retrieve()
                .bodyToMono(String.class)
                .block(); // Synchronous, ถ้า Asynchronous ไม่ต้องใช้ block()
    }
}
