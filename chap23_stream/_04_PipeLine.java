package chap23_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import chap23_stream.card.CreditCard;

public class _04_PipeLine {
	public static void main(String[] args) {
		/*
		 * List<CreditCard> 생성
		 * 
		 * 카카오,라이언카드,1000
		 * 삼성카드,탭탭오,2000
		 * 신한카드,드림카드,3000
		 * 삼성카드,id 카드, 5000
		 * 현대카드,더블랙,10000
		 * 아멕스,블랙카드, 100000
		 * 
		 */
		// 1. 스트림 파이프라인을 통해서 최대한도가 5000이상인 카드정보를 출력
		// (최종처리로 forEach 사용, cardInfo 메소드 출력)
		// CreditCard 객체들이 여러개 모여있는 리스트
		List<CreditCard> cardList = new ArrayList<>();
		
		// CreditCardList에는 CreditCard의 객체들이 저장된다.
		cardList.add(new CreditCard("카카오","라이언카드",1000));
		cardList.add(new CreditCard("삼성카드","탭탭오",2000));
		cardList.add(new CreditCard("신한카드","드림카드",3000));
		cardList.add(new CreditCard("삼성카드","id카드",5000));
		cardList.add(new CreditCard("현대카드","더블랙",10000));
		cardList.add(new CreditCard("아멕스","블랙카드",100000));
		
		// 파이프라인 없이 스트림 처리
		// cardList를 Stream 으로 변환 ->
//		Stream<CreditCard> cardStream = cardList.stream();
//		
//		// 한도가 5000 이상인 CreditCard만 모아서 새로운 Stream 생성
//		// Stream<CreditCard>
//		Stream<CreditCard> overFiveCardStream = 
//				cardStream.filter(card -> card.getLimit() >= 5000);
//		
//		// forEach로 출력
//		overFiveCardStream.forEach(card -> card.cardInfo());
		
		
		// 1-2. 파이프라인으로 구성
		cardList.stream().filter(card -> card.getLimit() >= 5000)
						 .forEach(card -> card.cardInfo());
		
		
		
		
		
	}

}
