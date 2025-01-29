package com.testttb.CRM_Servcie.CRM_Servcie.HttpService;

public class CreateTicketDTO {
       private Long customerId;

       public Long getAccountId() {
              return accountId;
       }

       public void setAccountId(Long accountId) {
              this.accountId = accountId;
       }

       private Long accountId;
       private String ticketType;
       private String description;
       private String status;

       public Long getCustomerId() {
              return customerId;
       }

       public void setCustomerId(Long customerId) {
              this.customerId = customerId;
       }


       public String getTicketType() {
              return ticketType;
       }

       public void setTicketType(String ticketType) {
              this.ticketType = ticketType;
       }

       public String getDescription() {
              return description;
       }

       public void setDescription(String description) {
              this.description = description;
       }

       public String getStatus() {
              return status;
       }

       public void setStatus(String status) {
              this.status = status;
       }
}
