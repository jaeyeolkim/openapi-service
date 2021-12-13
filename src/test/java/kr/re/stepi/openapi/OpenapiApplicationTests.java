package kr.re.stepi.openapi;

import kr.co.smartguru.apim.gateway.util.APIMGatewayUtil;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class OpenapiApplicationTests {

    @Test
    void contextLoads() {
//        String apimKey = request.getParameter("SG_APIM"); // 게이트웨이 인증키 값 저장
        String apimKey = "R7TzsnDcDMzW5QNGB6yIlhIxhto2fT8-i7vxuc_60jM"; // APIM_KeyGenerator.jar 생성 값, 10분 유효

        int checkResult = -1; // 인증결과 초기화
        if (apimKey != null) {
            checkResult = APIMGatewayUtil.SG_APIM_Check(apimKey);
        }
        System.out.println("checkResult = " + checkResult);

        // 인증키 확인(성공 시 1, 실패 시 -1 반환)
        if (checkResult == 1) {
            System.out.println("인증성공!!");
            // TODO : 요청 서비스 호출 및 결과 전달
        } else {
            System.out.println("인증실패!!");
            // TODO : 게이트웨이 요청이 아닌 경우에 대한 처리
        }
    }

}
