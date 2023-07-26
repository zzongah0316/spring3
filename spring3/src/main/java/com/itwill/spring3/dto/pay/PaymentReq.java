package com.itwill.spring3.dto.pay;



import lombok.Data;

@Data
public class PaymentReq {
    private String payType;
    private Long amount;
    private String orderName;
    private String customerEmail;
    private String customerName;
    
    
    
    
}
