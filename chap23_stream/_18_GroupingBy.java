package chap23_stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import chap23_stream.card.CreditCard;

public class _18_GroupingBy {
	public static void main(String[] args) {
		
		List<CreditCard> cardList = new ArrayList<>();
		
		cardList.add(new CreditCard("카카오","라이언카드",1000));
		cardList.add(new CreditCard("카카오","라이언카드2",2000));
		cardList.add(new CreditCard("삼성카드","탭탭오",2000));
		cardList.add(new CreditCard("신한카드","드림카드",3000));
		cardList.add(new CreditCard("신한카드","드림카드2",5000));
		cardList.add(new CreditCard("신한카드","드림카드3",7000));
		cardList.add(new CreditCard("신한카드","드림카드4",9000));
		cardList.add(new CreditCard("삼성카드","id카드",5000));
		cardList.add(new CreditCard("삼성카드","id카드",8000));
		cardList.add(new CreditCard("현대카드","더블랙",10000));
		cardList.add(new CreditCard("현대카드","더블랙2",30000));
		cardList.add(new CreditCard("현대카드","더블랙3",50000));
		cardList.add(new CreditCard("아멕스","블랙카드",100000));
		cardList.add(new CreditCard("아멕스","블랙카드2",200000));
		
		// 1.Collectors.groupingBy(키로 지정될 람다식): 맵으로 묶어주는 키를 지정하는 메소드
		// 키로 지정된 값들 중 동일한 값들을 묶어서(그룹화) 처리한다.
		
		Map<String, List<CreditCard>> companyCardMap = 
				cardList.stream()
						.collect(
								Collectors.groupingBy(
										// 키로 지정할 요소를 선택하는 람다식을 작성한다.
										// 밸류 람다식을 작성하지 않으면
										// 키로 지정된 요소가 같은 값인 요소들은
										// 그룹화하여 리스트로 만들어준다.
										card -> card.getCompany()
										)
								);
		
		System.out.println(companyCardMap);
		
		
		
		// 2. averagingDouble(람다식): 그룹화 된 리스트의 평균값을 구해주는 메소드. 
		// 							  람다식은 평균값을 구할 기준
		// Collectors.groupingBy(키 값으로 지정할 람다식, Collectors.averaging(람다식));
		
		Map<String, Double> companyLimitAvgMap = 
				cardList.stream()
						.collect(
								Collectors.groupingBy(
										card -> card.getCompany(),
										// 그룹화된 리스트를 사용하는 메소드
												Collectors.averagingDouble(card -> card.getLimit())
										)
								);
		
		System.out.println(companyLimitAvgMap);
		
		
		// 3. Collectors 의 counting 메소드를 사용해서
		// Map<회사명, 카드개수> 형태로 만들어보세요.
		// Map<String, Long>
		Map<String, Long> cntCard = 
				cardList.stream()
						.collect(
								Collectors.groupingBy(
										card -> card.getCompany(),
												Collectors.counting()
										)
								);
		System.out.println(cntCard);
		
	}

}
