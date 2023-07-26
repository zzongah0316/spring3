package com.itwill.spring3.web;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.itwill.spring3.dto.pay.PaymentRes;
import com.itwill.spring3.dto.reply.ReplyCreateDto;
import com.itwill.spring3.service.PostService;
import com.itwill.spring3.service.ReplyService;
import com.itwill.spring3.service.pay.PayService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@Controller
public class HomeController {
    
   // private final PayService payService;
    
    @GetMapping("/")
    public String home(Model model) {
        
        log.info("home()");
        
        LocalDateTime now = LocalDateTime.now();
        
        model.addAttribute("now", now);
        
        return "/main/index"; // View의 이름.
    }
    
    //@GetMapping("/test-success")
    //public String success(PaymentRes dto, String paymentKey,String orderId, Long amount) {
    //    log.info("success()");
        
    //    log.info("paymentKey={}",paymentKey);
     //   log.info("orderId={}",orderId);
     //   log.info("amount={}",amount);
        
    //    payService.
    
        
     //   return "/pay/test-success";
   // }
    
}
