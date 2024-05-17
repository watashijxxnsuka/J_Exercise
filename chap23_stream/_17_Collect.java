package chap23_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import chap23_stream.card.CreditCard;

public class _17_Collect {
	public static void main(String[] args) {
		
		List<CreditCard> cardList = new ArrayList<>();
		
		cardList.add(new CreditCard("카카오","라이언카드",1000));
		cardList.add(new CreditCard("삼성카드","탭탭오",2000));
		cardList.add(new CreditCard("신한카드","드림카드",3000));
		cardList.add(new CreditCard("삼성카드","id카드",5000));
		cardList.add(new CreditCard("현대카드","더블랙",10000));
		cardList.add(new CreditCard("아멕스","블랙카드",100000));
		
		// 1.collect 메소드는 Stream의 요소를 수집해서 Collection 객체로 변환해주는 기능을 한다.
		List<CreditCard> samsungCardList = cardList.stream()
													.filter(card -> card.getCompany().equals("삼성카드"))
													.collect(Collectors.toList());
		for(CreditCard card : samsungCardList) {
			card.cardInfo();
		}
		
		// 2.collect 메소드를 이용해서 자료 형태를 Map 형태로도 바꿀 수 있다.
		// collect(Collectors.toMap(키 값을 지정하는 람다식, 벨류를 지정하는 람다식)
		// Map<cardName, limit>
		
		Map<String, Integer> cardMap = 
				cardList.stream()
						.filter(card -> card.getLimit() >= 5000)
						.collect(
								Collectors.toMap(
										card -> card.getCardName(),
										card -> card.getLimit()
										)
								);
		
		System.out.println(cardMap);
		
		
	}

}
