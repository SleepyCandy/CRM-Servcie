package com.testttb.CRM_Servcie.CRM_Servcie.HttpService;

public class CreateTicketDTO {
       private Long customerId;
       private String accountId;
       private String ticketType;
       private String description;
       private String status;

       public Long getCustomerId() {
              return customerId;
       }

       public void setCustomerId(Long customerId) {
              this.customerId = customerId;
       }

       public String getAccountId() {
              return accountId;
       }

       public void setAccountId(String accountId) {
              this.accountId = accountId;
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
