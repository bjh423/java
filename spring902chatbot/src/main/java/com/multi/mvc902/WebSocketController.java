package com.multi.mvc902;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class WebSocketController {

	@MessageMapping("/chat2")
	@SendTo("/topic/messages2")
	public OutputMessage2 send2(Message message) { // from : guest, text :1
		System.out.println("받은 데이터>>" + message);
		OutputMessage2 out = new OutputMessage2();
		String menu = "";
        switch (message.getText()) {
        case "1":
            menu = "챗 봇>> 10)혼밥       11) 혼술";
            break;
        case "2":
            menu = "챗 봇>> 20)식품   21)의류";
            break;
        case "10":
            menu = "챗 봇>> 100)혼밥가게1   101)혼밥가게2";
            break;
        case "11":
            menu = "챗 봇>> 110)혼술가게1   111)혼술가게2";
            break;
        case "20":
            menu = "챗 봇>> 200)식품공구1  201)식품공구2";
            break;
        case "21":
            menu = "챗 봇>> 210)의류공구1  211)의류공구2";
            break;
        case "100":
        	menu = "혼밥가게1의 링크";
            break;
        case "101":
        	menu = "혼밥가게2의 링크";
            break;
        case "110":
        	menu = "혼술가게1의 링크";
            break;
        case "111":
        	menu = "혼술가게2의 링크";
            break;
        case "200":
        	menu = "식품공구1의 링크";
            break;
        case "201":
        	menu = "식품공구2의 링크";
            break;
        case "210":
        	menu = "의류공구1의 링크";
            break;
        case "211":
        	menu = "의류공구2의 링크";
            break;
        default:
            menu = "챗 봇>>선택한 번호는 없는 메뉴입니다. 다시 입력해주세요.";
            break;
        }
		out.setMenu(menu);
		return out;
	}



}


//@MessageMapping("/chat2")
//@SendTo("/topic/messages2")
//public OutputMessage2 send2(Message message) { // from : guest, text :1
//	System.out.println("받은 데이터>>" + message);
//	OutputMessage2 out = new OutputMessage2();
//	String menu = "";
//    switch (message.getText()) {
//    case "1":
//        menu = "챗 봇>> 10) 운동화      11) 모자          12) 가방";
//        break;
//    case "2":
//        menu = "챗 봇>> 20) 배송조회   21) 주문완료상품조회";
//        break;
//    case "20":
//        menu = "챗 봇>> DB에서 가지고 온 배송 상황 목록 \n" +
//                    "상품명: 르꼬뿌      배송상황: 물건 준비중";
//        break;
//    case "10":
//        menu = "챗 봇>> 100) 나이커   200) 르꼬뿌            300) 라코스또";
//        break;
//    case "100":
//        menu = "챗 봇>> 1000) 나이커 운동화 세부 메뉴    1) 다시 처음 메뉴";
//        break;
//    case "1000":
//        menu = "챗 봇>> 1001)나이커빨강(1만원)  1002)나이커파랑(2만원)   1003)나이커보라(3만원)   100)이전 메뉴로";
//        break;
//    default:
//        menu = "챗 봇>>선택한 번호는 없는 메뉴입니다. 다시 입력해주세요.";
//        break;
//    }
//	out.setMenu(menu);
//	return out;
//}
//@MessageMapping("/chat") // 채팅 내용 받을때 사용하는 주소
//@SendTo("/topic/messages") // 가입 주소와 같은 브라우저에 return message를 json으로 변환해서 전송
//public OutputMessage send(Message message) {
//	System.out.println("받은 데이터>>" + message);
//	OutputMessage out = new OutputMessage();
//	out.setFrom(message.getFrom());
//	out.setText(message.getText());
//	Date date = new Date();
//	out.setTime(date.getHours() + ":" + date.getMinutes());
//	return out;
//}