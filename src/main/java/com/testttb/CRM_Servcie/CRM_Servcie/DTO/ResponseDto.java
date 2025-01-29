package com.testttb.CRM_Servcie.CRM_Servcie.DTO;

import lombok.Data;

@Data
public class ResponseDto  {
    String code;
    String message;
    Object data;

    public void setData(String data) {
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResponseDto(String code, String message,Object data) {
        this.code = code;
        this.message = message;
        this.data = data;

    }
}
