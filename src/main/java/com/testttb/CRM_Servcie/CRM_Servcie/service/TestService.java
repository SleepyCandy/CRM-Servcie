package com.testttb.CRM_Servcie.CRM_Servcie.service;


import io.micrometer.tracing.Tracer;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    private final Tracer tracer;

    public TestService(Tracer tracer) {
        this.tracer = tracer;
    }

    public void testCustomTracing() {
        tracer.nextSpan().name("custom-trace").start();
        System.out.println("Custom tracing executed.");
    }
}
