package com.itwill.spring3.web;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.itwill.spring3.dto.pay.PaymentResDto;
import com.itwill.spring3.dto.reply.ReplyCreateDto;
import com.itwill.spring3.service.PostService;
import com.itwill.spring3.service.ReplyService;
//import com.itwill.spring3.service.pay.PayService;

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
    
    
    @PostMapping("/main/test")
    public String test1() {
        
        log.info("test1()");
             
        return "/main/test"; // View의 이름.
    }
    
    @GetMapping("/test")
    public String test() {
        
        log.info("home()");
             
        return "/main/test"; // View의 이름.
    }
    
    
    @GetMapping("/test-success")
    public String tossPaymentSuccess(
            Model model,
            @RequestParam String paymentKey,
            @RequestParam String orderId,
            @RequestParam Long amount
    ) {

        log.info("paymentKey={}",paymentKey);
        log.info("orderId={}",orderId);
        log.info("amount={}",amount);
        
        model.addAttribute("amount",amount);
        model.addAttribute("paymentKey", paymentKey);
        model.addAttribute("orderId", orderId);

        
        
        return "/pay/test-success";
    }
    
}
