//package com.itwill.spring3.service.pay;
//
//import org.springframework.stereotype.Service;
//
//import com.itwill.spring3.dto.pay.Payment;
//import com.itwill.spring3.repository.member.Member;
//
//import jakarta.transaction.Transactional;
//
//@Service
//@Transactional
//public class PaymentServiceImpl implements PaymentService {
//
//     
//     public Payment requestTossPayment(Payment payment, String userEmail) {
//            Member member = memberService.findMember(userEmail);
//            if (payment.getAmount() < 1000) {
//                throw new CustomLogicException(ExceptionCode.INVALID_PAYMENT_AMOUNT);
//            }
//            payment.setCustomer(member);
//            return paymentRepository.save(payment);
//        }
//     
