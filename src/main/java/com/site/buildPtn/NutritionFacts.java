package com.site.buildPtn;

import lombok.Builder;

@Builder  //lombok 어노테이션
public class NutritionFacts {
	
	//참고 블로그 : https://gonyda.tistory.com/9

	private final int servingSize;
	private final int servings;
	private final int calories;
	private final int fat;
	private final int sodium;
	private final int carbohydrate;
	
	
	//(방법1)
	//아래 주석코드를 해제하고, @Builder 어노테이션을 주석처리한다.
	//Service 클래스의 (방법1)과 연결(주석해제)시킨다.
//	public static class Builder{
//		//필수인자
//		private final int servingSize;
//		private final int servings;
//		
//		//선택인자 - 기본값으로 초기화
//		private int calories = 0;
//		private int fat = 0;
//		private int sodium = 0;
//		private int carbohydrate = 0;
//		
//		public Builder(int servingSize, int servings) {
//			this.servingSize = servingSize;
//			this.servings = servings;
//		}
//		
//		public Builder calories(int val) {
//			calories = val;
//			return this;  //이렇게 하면 .으로 체인을 이어갈 수 있다.
//		}
//		
//		public Builder fat(int val) {
//			fat = val;
//			return this;
//		}
//		
//		public Builder carbohydrate(int val) {
//			carbohydrate = val;
//			return this;
//		}
//		
//		public Builder sodium(int val) {
//			sodium = val;
//			return this;
//		}
//		
//		public NutritionFacts build() {
//			return new NutritionFacts(this);
//		}
//		
//		
//	}//builder
//	
//	
//	private NutritionFacts(Builder builder) {
//		servingSize = builder.servingSize;
//		servings = builder.servings;
//		calories = builder.calories;
//		fat = builder.fat;
//		sodium = builder.sodium;
//		carbohydrate = builder.carbohydrate;
//		
//	}//NutritionFacts
	
}//class - NutritionFacts
