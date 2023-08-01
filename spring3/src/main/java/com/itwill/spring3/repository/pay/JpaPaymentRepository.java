//package com.itwill.spring3.repository.pay;
//
//import java.awt.print.Pageable;
//import java.util.Optional;
//
//import org.springframework.data.domain.Slice;
//import org.springframework.data.jpa.repository.JpaRepository;
//
//import com.itwill.spring3.dto.pay.Payment;
//
//public interface JpaPaymentRepository extends JpaRepository<Payment, Long> {
//    Optional<Payment> findByOrderId(String orderId);
//    Optional<Payment> findByPaymentKeyAndCustomer_Email(String paymentKey, String email);
//    Slice<Payment> findAllByCustomer_Email(String email, Pageable pageable);
//}​