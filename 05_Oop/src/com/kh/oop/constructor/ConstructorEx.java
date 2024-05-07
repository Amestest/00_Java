package com.kh.oop.constructor;

public class ConstructorEx {
	/* 생성자
	  변수를 원하는 값으로 초기화할 수 있음
	  
	  초기값이 = 0; 으로 되어있을 때 초기값에 1을 넣어주면
	  초기값이 1로 초기화됨
	  
	  1. 반환값이 없음(return 사용 x, void x 위 두 개로 선언하지도 않음)
	  2. 객체(클래스)를 초기화 하는 방법이 많을 경우 모두 사용 가능
	  	
	  	선언 예제
	  		1.기본 생성자 - 필수가 없음 
	  			public 클래스이름(){
	  			}
	  		2. 필수 생성자 -  필수로 받아야하는 값이 존재함
	  					- 필수로 받아야하는 값은 필드에 적힌 값만 가능
	  			public 클래스이름(String ㅇㅇ, int ㅁㅁ, char ㅎㅎ){
	  				(여기서 변수명과 필드값은 같음)
	  				this.필드값1 = ㅇㅇ;
	  				this.필드값2 = ㅁㅁ;
	  				this.필드값3 = ㅎㅎ;
	  			}
	  		3. 값이 지정된 생성자
	  			필드나 생성자에서 값을 지정해준 생성자
	 * */
	
	//필드 변수명 정의
	public String name; //비어있음
	public String phone; //비어있음
	public int idNo; //비어있음
	public int money; //비어있음
	
	//생성자 기본 / 필수 / 값을 지정한 생성자
	//기본생성자
	public ConstructorEx() {
		
	}
	// 필수생성자 관호 안에 매개변수가 필수로 들어가야하는 생성자
	//					(괄호 안에 들어가는 변수 매개변수)
	//                   필수로 이름
	public ConstructorEx(String inputName) {
		this.name = inputName;
		
	}
	//                   필수로 이름 핸드폰번호
	public ConstructorEx(String inputName, String inputNumber) {
		this.name = inputName;
		this.phone = inputNumber;
	}
	public ConstructorEx(String inputName,String inputNumber,int inputID) {
		this.name = inputName;
		this.phone = inputNumber;
		this.idNo = inputID;
	}
	//                   필수로 이름 핸드폰번호 아이디번호
	public ConstructorEx(int inputID, String inputName,String inputNumber) {
		this.name = inputName;
		this.phone = inputNumber;
		
	}
	
	//                   필수로 이름 핸드폰번호 아이디번호 금액
	public ConstructorEx(String inputName, String inputNumber, int inputId,int inputMoney) {
		this.name = inputName;
		this.phone =inputNumber; 
		this.idNo = inputId;
		this.money = inputMoney;
		
	}
	
	// 값을 지정한 생성자
	/*값을 지정하는 생성자는 초기의 값만 지정해주기 때문에
	  매개변수를 필수로 넣어주지 않아도 되지만
	  기본 생성자와 생김새가 똑같아서 발깐줄이 나기 때문에 
	  현재는 임의로 매개변수를 넣어줌
	  보통은 public ConstructorEx(){} 사용할 수 있음
	  */
	public ConstructorEx(int a) {
		//기본으로 값을 지정해서 전달하는 생성자
		//생성할 때 부터 값을 지정해주고 추후 값을 변경할 수 있도록 해줌
	
		name = "이름을 입력해주세요."; //String이기 때문에 문자열을 넣어야함
		phone = "번호를 입력해주세요."; //String이기 때문에 문자열을 넣어야함
		idNo = 1; //int 이기 떄문에 숫자값을 넣어야함
		money = 0; //int 이기 떄문에 숫자값을 넣어야함
	
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
