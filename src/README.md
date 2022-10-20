# JAVA

---

## 1. JAVA

	: 클래스 명의 시작은 무조건 대문자여야 한다.
	
	: 모든 단어의 첫글자는 대문자여야 한다.
	
	: JAVA에서는 데이터 값을 각각 다른 메모리에 저장시킨다.
	
### Data Type
	
---

	- 리터럴(literal) : 그 자체의 값(1, 2, 3, ...., 'a', 'b', 'c', ....., true, false)
 	- 변수(variable) : 하나의 값을 저장하기 위한 메모리 공간
  			 :자바에서 제공하는 데이터 타입
  		1. Primitive Data Type(기본 데이터 타입)
 			문자 - char(2byte)
  			숫자 - 정수 : byte(1byte), short(2byte), int(4byte), long(8byte)
  	    		- 실수 : float(4byte), double(8byte)
   			논리 - boolean(1byte) 	
   			참고 : 1byte = 8bit (1byte의 범위 : -128 ~ 127)
			(자바 명령어 및 단축키는 구글링)
   
  		2. Reference Data Type(참조 데이터 타입)
  			Array, Class, Interface
   
   		3. 시스템에서 인식하는 데이터 타입 크기
   			: byte < char, short < int < long < float < double
   			   		
   		4. System.out.print() : 값을 출력
   		   System.out.println() : 출력 후 자동 줄바꿈
   		   System.out.printf("출력형식", 값1, 값2, 값3...) : 어떤 형식의 문자열을 출력할 수 있다.
   		   • 출력 기호
   		    %d : 정수(byte, short, int, long)
		    %f : 실수(float, double)
		    %b : 논리(boolean)
		    %c : 문자(char)
		    %s : 문자열(String)
		    %% : %
		    \n : 줄바꿈
		    \t : 탭 
   		   
   		5. 형변환(casting)
   			- 묵시적 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할 때 발생
   			- 명시적 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할 때 발생
   		
   		6. 주의사항
   			- char : 하나만 저장 가능. 홑따옴표를 이용한다.
   			- String : 쌍따옴표를 이용한다.
   			- 변수를 선언하기 전에 무조건 데이터 타입을 입력해야 한다.
   			- 값의 데이터 타입과 변수의 데이터 타입을 일치 시켜야 한다. 다르다면 형변환(casting)을 해줘야 한다.
   			- 자바에서는 우선순위가 있다.(다른 언어랑 비슷하다.)
   			- 왼쪽에서 부터 진행되기 때문에 순서를 신경써서 작성해야 한다.
   			
 ---
 
 ### Operator(연산자) / Operand(피연산자)
 
 	- Operator(연산자) : 어떠한 기능을 수행하는 기호(+, -, *, /, %, >, <, >=, <=, ==, != ...)
 	- Operand(피연산자) : 연산자의 작업 대상(변수, 상수, 리터럴, 수식 ...)
 	
 ---
 		1. 연산자의 종류
 			- 산술연산자(이항연산자) : +, -, *, /, %
 			- 비교연산자(이항연산자) : >, <, >=, <=, ==, !=
 			- 논리연산자(이항연산자) : &&(and), ||(or), !(not)
 			- 조건연산자(삼항연산자) : 조건식 ? 참 : 거짓
 			- 대입연산자(이항연산자) : =, +=, -=, *=, /=, >=, <=....
 			- 증감연산자(단항연산자) : ++(1씩 증가), --(1씩 감소)
 			
 		2. 연산자의 특성
 			- 데이터 타입이 다른 것을 더할때는 큰 데이터 타입으로 묶어서 더해야 값이 출력된다.
 			- int 이하끼리 연산하면 int로 리턴한다.
 			     * int = short + short 
				 * int = byte + byte 
				 * int = char + char 
		 		 * int = short + byte
		 		 * int + byte + char 
		 		 * int = int + byte
		 	- 상수 : 한번만 기억할 수 있는 메모리 공간. 증감 연산자를 사용할 수 없다.
		 		 * final int 변수 = 값;
		 		 
		3. 전위 연산자와 후위 연산자
			- 전위 연산자 
				: 피연산자 앞에 연산자가 위치하면 전위 연산자라고 부른다.
				: 값이 참조되기 전에 증가시킨다.
			- 후위 연산자 
				: 피연산자 뒤에 연산자가 위치하면 후위 연산자라고 부른다.
				: 값이 참조된 후 증가시킨다.
			- 리터럴은 증강연산자를 사용할 수 없다.
		
		4. 논리연산자
			- && : 둘다 값이 true여야 true가 출력
			- || : 둘중 하나라도 true이면 true가 출력
			- 우선순위 : && > ||
			- 우선순위를 먼저 비교한 후 좌변부터 논리가 진행된다.

---

### 제어문(control statement) : 문장의 흐름을 제어해주는 기능이다.
	
- 조건문 : if ~ else, switch ~ case
- 반복문 : for, while, do ~ while
- 기타 : break, continue, label(임의 이름)

	
		1. 조건문 if
		
		 - if(조건식){
  		   조건식이 참일 때 수행 문장;
  		   }else{
 		   조건식이 거짓일 때 수행 문장;
  		   }
		 
		 - 조건식을 만족할때만 수행할 문장이 있는 경우
  		   if(조건식){
 		   수행할 문장;
 		   }
		   
		 - if(조건식) { if(조건식) {} else { if(조건식) {} }
  	     	  
		 - 다중 if~else
 		   if(조건식){
  		   수행할 문장;
  		   }else if(조건식){
  		   수행할 문장;
           	   }else if(조건식){
    	           수행할 문장;
  		   }else{
  	    	   수행할 문장;
  		   }
		    
		2. 조건문 switch
		
		switch(식){
 		case 값1 : 수행할 문장; break;
                case 값2 : 수행할 문장; break;
                case 값3 : 수행할 문장; break;
                default : 수행할 문장;
                }
		
		- 식의 결과 타입 : byte, short, char, int, enum(jdk7), String(jdk7)
		
 		- switch~case에서 break를 만나면 현재 수행중인 제어문을 완전히 빠져나온다.
		
		3. 반복문 for
		  
		  - for(조건식 ; 조건식 ; 증감식){
		    반복 수행할 문장
		    }
		    
---

### Array 배열

- 배열 : 서로 관련이 있는 데이터 타입이 같은 데이터의 집합
- 변수 : 하나의 값을 저장하기 위한 메모리 공간
- 배열 생성 = 메모리 생성(확보)
- new 키워드를 이용해서 배열을 생성

		0. 데이터 타입에 따른 기본값
		  int[] data1 = new int[3]; // 0 기본값
	  	  long[] data2 = new long[3]; // 0L 기본값
	  	  float[] data3 = new float[3]; // 0.0F 기본값
	  	  double[] data4 = new double[3]; // 0.0 기본값
	  	  char[] data5 = new char[3]; // \u0000 기본값(유니코드)
	  	  boolean[] data6 = new boolean[3]; // false 기본값
	  	  String[] data7 = new String[3]; // null 기본값
		  
		  char 배열 인덱스 값 선택
		  : 변수.charAt();
		  String 배열 인덱스 값 선택
		  : 변수.toCharArray();
		  
	
		1. 배열 선언
		  - int[] arr = new int[];
	  
		  - int[] arr = new int[]{};
	  
	  	  - int[] arr = {};
	  
		2. 2차원 배열
	  	  - int[][] arr = new int[][];
	  
	  	  - int[][] arr = new int[][]{{}};
	  
 		  - int[][] arr = {{}};
	  
		  - 2차원 배열 형식
		    for(int i = 0 ; i < arr.length ; i++){
	      	      for(int j = 0 ; j < arr[i].length ; j++){
	                System.out.printf("%d(숫자일경우)", arr)
	              } System.out.println() // 자리바꿈
	            }
	    
		3. 가변 배열
	  	  - 가변 배열을 생성할때는 제일 마지막의 배열크기는 지정하지 않는다.
	  	  - 가변 배열을 제공하는 이유는 메모리 손실을 최소화하기 위한 목적이다.
	  
	  	  - int[][] num = new int[3][];
	  
	  	  - int[][][] num = new int[3][][];
		  
---

### Method (메서드)

- 값을 계산하기 위해서 사용되는 기능이다.
- 객체의 동작을 처리하기 위한 기능이다.
- 프로그램을 실행하면 JVM(자바가상머신 - java Virtual Machine)에서 main스레드가 main()메서드를 호출한다.
- JVM은 운영체제에 특화된 코드로 변환하여 실행한다. 즉, 자바프로그램 실행환경을 만들어 주는 소프트웨어이다.
	
	0. Method 메서드 선언
	
	  method 정의 : 선언부 + 구현부
 	  반환자료형 메소드명(데이터타입 매개변수) => 메소드 선언부
  	  void    main (String[] args) 
  	  {
   	  메소드가 호출 되었을 때 실행 구문;   => 메소드 구현부
   	  return 값;                             
  	  }
	  
	  - 매개변수 = parameter
	  - 인수 = argument
	  - void : return되는 타입이 없음을 의미한다.
	  
	  - JVM 자바 가상 머신 메모리 구조
	    : Method Area(클래스, 상수, 변수, 메소드코드, 생성자코드)
	    : Stack Area
	    : Heap Area : 참조 데이터 타입의 저장 공간
	  
	1. 리턴값이 없고 매개변수도 없는 형태
 	   void add(){
 	     int x = 10;
 	     int y = 20;
 	     if(x<0)
 	       return; // 메소드를 강제적으로 빠져 나와라
 	     System.out.println(x+y);
 	   }
 	   add();
  
 	 2. 리턴값은 있고 매개변수는 없는 형태
 	   double avg(){
 	     int x = 10;
 	     int y = 20;
 	     return (x+y)/2; // int값을 출력하지만 casting으로 인해 double값으로 바뀌어 출력 or return (x+y)/2.0;
 	   }
 	   
  	 3. 리턴값이 없고 매개변수는 있는 형태
 	   void plus(int x, int y){
 	     System.out.println(x+y);
 	   }
 	   plus(10, 20);
  
 	 4. 리턴값이 있고 매개변수도 있는 형태
 	   double avg(int x, int y){
 	     return (x+y)/2.0;
 	   }
 	   avg(10, 20);
	   
	 5. 자바에서 제공하는 데이터 타입(data type)
 	   - primitive data type : byte, short, int, long, float, double, boolean, char
  	   - reference data type : array, class, interface, enum
 	
 	   [argument 전달방식]
	     (1). call by value : 값에 의한 복사
  	  	argument를 전달할때 primitive data type을 넘겨주는 형식
  	  	- 장점 : 복사하여 처리하기 때문에 원래 값이 보존이 되어 안전하다.
  	  	- 단점 : 복사를 하기 때문에 메모리 사용량이 늘어난다.
  
  	     (2) call by reference : 주소에 의한 복사
     		argument를 전달할때 reference data type을 넘겨주는 형식
		- 장점 : 참조를 하기 때문에 메모리를 절약한다.
                - 단점 : 참조를 하기 때문에 원래 값에 영향을 받는다.
