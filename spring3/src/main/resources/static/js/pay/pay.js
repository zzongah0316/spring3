/**
 * 
 */

 // 내 테스트 키
// 토스페이먼츠에 회원가입을 완료했다면 아래 키로 결제위젯을 연동하세요.
// 로그인하면 문서의 API 키가 모두 내 테스트 키로 변경됩니다.
var secretKey = 'test_sk_D4yKeq5bgrpOzzY45e0VGX0lzW6Y'
var clientKey = 'test_ck_MGjLJoQ1aVZE9XKZGKl3w6KYe2RN'
var tossPayments = TossPayments(clientKey)

    // ------ 결제창 띄우기 ------
    tossPayments.requestPayment('카드', { // 결제수단 파라미터 (카드, 계좌이체, 가상계좌, 휴대폰 등)
      // 결제 정보 파라미터
      // 더 많은 결제 정보 파라미터는 결제창 Javascript SDK에서 확인하세요.
      // https://docs.tosspayments.com/reference/js-sdk
      amount: 100, // 결제 금액
      orderId: 'uuYls2Ka_Tje8qA-QuE1c', // 주문 ID(주문 ID는 상점에서 직접 만들어주세요.)
      orderName: '테스트 결제', // 주문명
      customerName: '김토스', // 구매자 이름
      successUrl: 'https://localhost:8090/test-success', // 결제 성공 시 이동할 페이지(이 주소는 예시입니다. 상점에서 직접 만들어주세요.)
      failUrl: 'https://localhost:8090/test-fail', // 결제 실패 시 이동할 페이지(이 주소는 예시입니다. 상점에서 직접 만들어주세요.)
    })
    // ------결제창을 띄울 수 없는 에러 처리 ------
    // 메서드 실행에 실패해서 reject 된 에러를 처리하는 블록입니다.
    // 결제창에서 발생할 수 있는 에러를 확인하세요. 
    // https://docs.tosspayments.com/reference/error-codes#결제창공통-sdk-에러
    .catch(function (error) {
      if (error.code === 'USER_CANCEL') {
        // 결제 고객이 결제창을 닫았을 때 에러 처리
      } else if (error.code === 'INVALID_CARD_COMPANY') {
        // 유효하지 않은 카드 코드에 대한 에러 처리
      }
    });