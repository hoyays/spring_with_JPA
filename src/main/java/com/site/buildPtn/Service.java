package com.site.buildPtn;

public class Service {

	
	/*
	 * (방법1) 빌드패턴을 이용한 객체생성
	 */
	
//	
//	//각 줄마다 builder를 타이핑하지 않아도 되어 편리하다.
//	NutritionFacts cocaCola = new NutritionFacts
//			.Builder(240, 8)   //필수값 입력
//			.calories(100)
//			.sodium(35)
//			.carbohydrate(27)
//			.build();          //build()가 NutritionFacts 객체를 생성해 돌려준다.
//	

	
	
	
	/*
	 * lombok의 @Builder 어노테이션을 이용한 빌드패턴
	 */
	NutritionFacts facts = NutritionFacts.builder()
			.servingSize(240)
			.servings(5)
			.calories(230)
			.fat(10)
			.sodium(5)
			.build();
	
	
	
	
	
	
	
	
}//class
