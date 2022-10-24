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
## Class

### 1.Method (메서드)

- 값을 계산하기 위해서 사용되는 기능이다.

- 객체의 동작을 처리하기 위한 기능이다.

- 프로그램을 실행하면 JVM(자바가상머신 - java Virtual Machine)에서 main스레드가 main()메서드를 호출한다.

- JVM은 운영체제에 특화된 코드로 변환하여 실행한다. 즉, 자바프로그램 실행환경을 만들어 주는 소프트웨어이다.
	
			- Method 메서드 선언
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
	  
	 		- 리턴값이 없고 매개변수도 없는 형태
 	   		  void add(){
 	     		    int x = 10;
 	     	 	    int y = 20;
 	     	 	    if(x<0)
 	       		    return; // 메소드를 강제적으로 빠져 나와라
 	     		  System.out.println(x+y);
 	   		  }
 	   		  add();
  
 	 		- 리턴값은 있고 매개변수는 없는 형태
 	   		  double avg(){
 	     		    int x = 10;
 	     		    int y = 20;
 	     		    return (x+y)/2; // int값을 출력하지만 casting으로 인해 double값으로 바뀌어 출력 or return (x+y)/2.0;
 	   		  }
 	   
  	 		- 리턴값이 없고 매개변수는 있는 형태
 	   		  void plus(int x, int y){
 	     		    System.out.println(x+y);
 	   	  	  }
 	   		  plus(10, 20);	
  
 	 		- 리턴값이 있고 매개변수도 있는 형태
 	   		  double avg(int x, int y){
 	     		    return (x+y)/2.0;
 	   	 	  }
 	   		  avg(10, 20);
	   
	 		- 자바에서 제공하는 데이터 타입(data type)
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
		
	 		- 배열 형식
	   	 	   - class에서 같은 그룹으로 배열을 형성할 때 작성방식이 있다.
	     		     생성자 매개변수 = new 생성자[배열갯수];
	     	 	     매개변수[0] = new 생성자(값);
	     		     매개변수[1] = new 생성자(값); ...

---

### 2. 오버로딩(overloading)

- 단일 클래스에서 같은 이름의 메소드를 여러개 정의하는 기능이다.

- 오버로딩의 조건
  (1). 메서드의 이름이 같아야 한다.
  (2). 매개변수의 갯수 또는 데이터 타입이 달라야 한다.
  (3). 리턴타입은 오버로딩을 구분하는데 사용되지 않는다.
  
--- 

### 3. Spread Operator(...)

- jdk5이전 버전에서는 특정 메소드를 정의할 때 인자와 매개변수의 갯수 및 타입의 수를 정해놓고 호출할 떄 일치하지 않으면 오류가 발생하였다.

- 이를 유연하게 처리할 수 있도록 variable argument 기능을 제공해주고 있다.

- 리턴타입 메소드명(데이터타입... 가변매개변수) { }

- 고정매개변수와 가변매개변수가 같이 사용될때는 언제나 고정매개변수를 먼저 선언한다.
  void example(String name, int... arr) { } (이와같이 작성한다.)

---

### 4. 개선된 for문

- JavaScript에서 제공되는 for~in문과 for~of문과 동작 원리가 같은 방식으로 배열의 갯수를 나타낼 수 있다.

- 개선된 for문 = 개선된 루프 = 확장된 루프

	          - 작성방식
 		    :  for(int element : 배열 or 컬렉션) {
  	 	       수행할 문장;
  		       } 
 
---
 
## Static access
 
### 1. Static
 
- class loader일 때 method area에 저장이 된다.
 
- 같은 클래스로 생성된 객체끼리 공유해서 사용한다.

- static키워드가 선언된 메소드에서 this, super키워드를 사용할 수 없다.
  
- 즉, static으로 멤버변수 및 클래스, 메서드 작성시 Method area에 생성이 되기 때문에

- non-static 메서드에서 static 메서드 호출이 가능하다.

---

### 2. Modifier & Access Modifier (제어자 & 접근제어자)

- package
  1. 비슷한 작업을 수행하는 클래스 및 인터페이스를 묶어서 사용한다.
  2. open API에서 제공하는 클래스 : 클래스 및 인터페이스 중복을 피하기 위해서 사용한다.
     domain : www.gov.kr
     package : kr.gov
  
- import : 외부 클래스 및 인터페이스 위치를 JVM에 알려주기 위해서 사용한다.
         : 다른 곳의 패키지를 가져올 때 클래스 위치를 잡아줘야 한다. 중복 사용이 가능하며 패키지 선언 후 작성해줘야 한다.

		- 제어자(modifier)
			1. 클래스, 변수, 메서, 생성자의 선언부에 사용되어 부가적인 의미를 부여한다.
  			2. 제어자는 크게 접근제어자(Access Modifier)와 그 외의 제어자로 구분한다.
  			3. 하나의 대상에 여러 개의 제어자를 조합해서 사용할 수 있으나, 접근제어자는 단 하나만 사용할 수 있다.
  		  	   접근제어자 - public, protected, default(=package), private
 		   	   그 외의 제어자 - static, final, abstract, synchronized...
 		  	   public static final int data; (접근제어자는 단 하나만 사용 가능)

		- 접근제어자(Access Modifier)
		  	0. 멤버 또는 클래스에 사용되어, 외부로부터의 접근을 제한한다.
 		 	1. private : 정의된 클래스에서만 접근이 가능하다.
 		 	2. default : 같은 패키지에서만 접근이 가능하다.
 		 	3. protected : 같은 패키지내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능하다.
 		 	4. public : 접근 제한이 없다.
 		 	5. 접근제어자의 범위
		  	   public > protected > default > private
 			   접근제어자 사용
 		 	   class : default, public 만 사용 가능하다.
  			   variable, method, constructor : private, default, protected, public 전부 사용 가능
 			   public (+), protected(#), default, private(-)
 			   package 패키지명;			package java.lang;
  			   import 패키지명.클래스;		import java.util.Random;
  			   import 패키지명.인터페이스;	import java.lang.Seriable;
  
			  class 클래스{
			       멤버변수;
 			       생성자;
 	 	 	       메소드;
			  }
  
  		- 클래스 관계
 		        1. has a : 포함 관계
 		        2. is a : 상속 관계

		- UML(Unified Modeling Language : 통합 모델링 언어)
 		        1. UML은 소프트웨어 시스템을 개발할 떄 팀원 간의 아이디어를 도출하거나,
 		           개발할 시스템의 구조와 시스템의 동적인 관점을 표현할 때 사용하는 모델링 언어이다.
		        2. 시스템을 시각화 하거나 시스템의 사양이나 설계를 문서화하기 위한 표준 표현 방법이다.

---

### 3. 싱글톤 패턴(singleton pattern)

- 같은 형태의 객체를 생성할 때 사용한다.
 
- 하나의 객체만을 생성해서 참조하는 방법이다.
 
- 장점 : 객체의 단일 생성을 통한 자원의 절약
 
- 단점 : 해제되는 시점을 알기 어려움
		
		- 방법
		  1. 클래스가 정의된 클래스에서 자신의 객체를 생성한다.
		     private static MemberDao dao = new MemberDao();
		  2. static선언된 메서드에서 생성된 객체를 리턴한다.
		     public static MemberDao getInstance(){
		       return dao;
		     }
		  3. 생성자의 접근제어자는 private으로 선언한다.
		     private MemberDao(){
		     }
		     
---

### 4. 캡슐화(encapsulation)

- 추상화를 통해 정리된 데이터들과 기능을 하나로 묶어 관리하는 기법

- 데이터의 접근 제한을 원칙으로 한다.

		- 캡슐화 정의 방법
		
		1. 멤버 변수의 접근제어자는 private으로 선언한다.
		
		2. setter메서드의 정의 방법(저장)
		   - 접근제어자 public으로 지정한다.
		   - 리턴 타입은 void로 지정한다.
		   - 메서드명은 set으로 시작하고, 멤버변수의 첫 글자만 대문자로 지정하고 나머지는 같게 한다.
		     private int num;
		     public void setNum(int num){
		       this.num = num; (매개변수 값을 멤버변수에 할당)
		     }
		     
		3. getter메서드의 정의방법(가져오기)
		   - 접근제어자 public으로 지정한다.
		   - 리턴타입은 멤버변수의 데이터 타입과 같게 한다.
		   - 메서드명은 get으로 시작하고, 멤버변수의 첫 글자만 대문자로 지정하고 나머지는 같게 한다.
		     public int getNum(){
		       return num;
		     }
		     
---

### 5. 상속(inheritance)

- 기본 클래스가 가지고 있는 멤버들을 새로 만든 클래스에서 직접 만들지 않고 상속을 받음으로써 새 클래스가 자신의 멤버처럼 사용할 수 있게 만든다.

- 기본 클래스를 재사용 해서 새로운 클래스를 정의

- 두 클래스를 조상과 자손 관계를 맺어준다.(extends)

- 상속을 해주는 클래스 : 수퍼클래스(super) = 부모클래스 = 기본클래스

- 상속을 받는 클래스 : 서브클래스(sub) = 자식클래스 = 유도클래스

- 자식(손)클래스는 조상의 모든 자원을 상속받는다.(private, 생성자, static{}은 제외)

- 자식(손)의 자원은 부모보다 크거나 같아야 한다.

- 상속을 할 때 사용되는 키워드 : extends

- 클래스에 클래스를 상속 : 단일 상속 / 인터페이스에 인터페이스 상속 : 다중 상속

- 상속자를 따로 작성 안하면 Object를 상속받는다.
 
              - 상속 예시
	      class A { }
	      class B extands A { }
	      자식클래스 B extends 부모클래스 A
	      => A는 B에게 상속한다. B는 A이다.(상속관계의 클래스를 is a 관계라 한다.)
	    
---

### 6. 오버라이딩(overriding)

- 조상클래스의 메서드를 자식(손)클래스에서 재정의(메서드 구현부)하는 기능이다.

              - 오버라이딩 성립
                1) 부모클래스의 메서드와 자식클래스의 메서드 이름이 동일해야 한다.
                2) 매개변수의 타입, 개수, 순서가 일치해야 한다.
                3) 리턴타입이 동일해야 한다.
                4) 접근제어자(제한자)는 부모클래스의 메서드와 같거나 더 넓은 범위여야 한다.
                   private < default < protected < public
		
---

## API


### 1. 오브젝트(Object) & 문자열(String)

- 클래스 중에서 최상위 클래스

- Object를 제외한 모든 클래스들은 Object를 상속받고 있다.

- java.lang패키지에서 제공하는 클래스이다.

                - equlas() : 주소비교(객체비교만 가능하다.), 대소문자를 비교한다.
		- equalsIgnoeCase() : 주소비교, 대소문자 비교를 안한다.
		- hashCode() : 메모리값
		- length() : 문자열 길이
		- toUpperCase() : 대문자로 리턴
		- toLowerCase() : 소문자로 리턴
		- charAt() : 위치한 인덱스의 문자열 리턴
		- indexOf() : 위치한 인덱스값 리턴
		- lastIndexOf() : 뒤에서 부터 위치한 인덱스값 리턴
		- subString(5) : 작성한 문자열 값부터 리턴
		- subString(5,10) : 5부터 10미만의 문자열 리턴
		- split("a") : 메모리에 저장된 문자열을 "a"로 구분해서 문자열 배열로 리턴
		- String.valueOf() : 기본데이터 타입을 전부 String으로 호출이 가능하게끔 리턴
		- toCharArray() : 문자열을 문자(캐릭터)배열로 바꿔주어 리턴
		- valueof() : ()안의 객체를 String객체로 변환하여 리턴
		- 

--- 

### 2. 정규화 표현식 RegEx (Regular Expression)

- 텍스트 데이터 중에서 원하는 조건(패턴)과 일치하는 문자열을 찾아내기 위해 사용하는 것

- 미리 정의된 기호와 문자를 이용해서 작성한 문자열을 뜻함

                - . : 임의의 문자 1개를 의미
		- * : 0개 이상의 문자를 의미함(여러개)
		- .* : '임의의 문자 여러개' 라는 의미
		- [] : 대괄호 없이 사용시 맨 앞글자와 맨 뒤 글자를 의미한다. or이라는 뜻을 지님
		- { } : 문자열의 인덱스 값
		- matches() 
		  : 일치하는 문자열이 있으면 ture or false 리턴
		  : matches는 boolean을 의미한다.
		- replaceAll( , ) 
		  : 대상 문자열을 원하는 문자 값으로 변환하는 함수. 
		  : 첫번째 매개변수는 변환하고자 하는 대상이 될 문자열
	          : 두번째 매개변수는 변환할 문자 값
		- \s : 공백. (문자열로 인식시키기 위해 역슬래시를 2개 적어준다. \\s)
		- \d : 숫자를 의미. \D : 숫자가 아닌 부정의 의미
		- \w : 숫자와 영어를 의미 [a-zA-Z_0-9]
		
		
 		- Pattern.matcher() : 빠르게 어떠한 text(String)이 주어진 Pattern에 있는지를 확인한다.
 		- Pattern.compile(): 여러개의 텍스트를 재사용 가능한 Pattern인스턴스로 컴파일 한다.
 		- find() : 최초의 패턴 위치로 이동한 뒤 True 반환, 없으면 false 
 		- find(int start) : start 위치 부터 find 
 		- start() : 매칭되는 패턴의 시작 인덱스 반환 
 		- start(int group) : group이 매칭되는 시작 인덱스 반환
 		- end() : 매칭된 패턴 한칸 뒤 인덱스 반환 
 		- end(int group) : 지정되 그룹이 매칭되는 한칸 뒤 인덱스 반환 
 		- group() : 최초로 그룹 매칭된 패턴을 반환 
		- group(int group) : 그룹 매칭된 부분중 group번째 패턴을 반환 
 		- groupCount() : 패턴내 그룹핑(괄호로 묶은 패턴들)의 갯수 반환
 		- matches() : 패턴이 전체 문자열과 일치하면 True
 
		- Parttern 플래그 값 사용(상수)
		- Pattern.CANON_EQ : None표준화된 매칭 모드를 활성화합니다.
		- Pattern.CASE_INSENSITIVE : 대소문자를 구분하지 않습니다. 
		- Pattern.COMMENTS : 공백과 #으로 시작하는 주석이 무시됩니다. (라인의 끝까지).
		- Pattern.MULTILINE : 수식 '^' 는 라인의 시작과, '$' 는 라인의 끝과 match 됩니다.
		- Pattern.DOTALL : 수식 '.'과 모든 문자와 match 되고 '\n' 도 match 에 포함됩니다.
		- Pattern.UNICODE_CASE : 유니코드를 기준으로 대소문자 구분 없이 match 시킵니다.
		- Pattert.UNIX_LINES : 수식 '.' 과 '^' 및 '$'의 match시에 한 라인의 끝을 의미하는 '\n'만 인식됩니다.

---

### 3. 스트링 버퍼(StringBuffer) & 스트링 빌더(StringBuilder)

- 문자열 값을 수정할 수 있는 mutable(가변)이다.

- 기본 16분자 크기로 지정된 버퍼를 이용하며, 크기를 증가시킬 수 있다.

		- String : immuetable 불변. 값이 변하지 않는다.

		- replace() : 새로운 임시 메모리 생성 및 기존데이터 복사(StringBuffer)가 이루어 진다.

		- 새로운 String을 생성 후 StringBuffer가 복사 및 값이 넘어간다.

		- StringBuffer에 객체 생성을 한후 replace가 이루어지면 기존의 값 또한 바뀌게 된다.

		- insert(2," ") : 지정한 인덱스에 문자열 삽입.
		- delete(1,6) : 1인덱스부터 6인덱스 미만 사이의 문자열 삭제
		- append() : 마지막에 문자열 추가
		- reverse() : 문자열을 반대로 변경
		- floor : 소수점 버리기
		- round : 반올림
		- ceil : 입력 인자 값보다 크거나 같은 가장 작은 정수 값을 double형으로 리턴

---

### 4. 스트링토크나이저(StringTokenizer)

- StringTokenizer클래스는 문자열을 우리가 지정한 구분자로 문자열을 쪼개주는 클라스이다.

- 그렇게 쪼개어진 문자열을 토큰(token)이라고 부른다.

                - StringTokenizer("문자열", "구분자")
		  : 문자열의 구분자가 공백일때는 2번째 인자값(구분자)은 생략할 수 있다.
		  
		- countTokens() : 토큰의 갯수 리턴
		- nextToken() : 포인터가 가리키는 token값 리턴 후 포인터 위치 이동
		- hasMoreTokens() : 메모리에 저장된 토큰이 있으면 true, 없으면 false를 리턴

---

### 5. 스캐너(Scanner)

- 콘솔창으로 데이터를 읽어보기 위해서 콘솔창과 연결하는 클래스

		- System.in : 콘솔창에 데이터 직접 입력
		- next() : 문자열 리턴. 한 단어만 리턴. 값을 바로 입력. 새로운 데이터를 입력한다.
		- nextLine() : 한 문장을 리턴
		- nextInt() : 정수 값 리턴
		- nextFloat() : 플로트 값 리턴
		- nextDouble() : 더블 값 리턴
		- 메소드를 만나면 대기상태가 되며 사용자가 데이터를 입력하고 enter를 하면 메소드를 읽는다.
		
---

### 6. 래퍼(Wrapper)

- 기본 자료형을 클래스로 정의해놓은 것을 Wrapper라고 한다.

- 메모리에 저장된 값을 다른 자료형으로 변환해주는 메서드를 제공하기 위해서 Wrapper클래스를 제공한다.

- auto-boxing : 스택 영역 => 힙 영역 복사

- auto-unboxing : 힙 영역 => 스택 영역 복사

		- 클래스 명
		-  멤버변수      -> 객체(Object)
		   char		-> Character
 		   byte		-> Byte
		   short	-> Short
 		   int		-> Integer
 		   long		-> Long
 		   float	-> Float
 		   double	-> Double
 		   boolean	-> Boolean
		   
		- ex)
		  int num1 = 3;
		  Integer valInt = num1; // auto-boxing 발생
		  int num2 = valInt; // auto-unboxing 발생
		  
		- 크기가 다르다면 auto-unboxing 발생이 안된다.
		  double -> int 실행 x
		  
		- intValue()
		- Integer.valueOf()
		- Integer.parseInt(); ... 여러가지 메서드가 있다.

		- 여러 메서드
		  toUpperCase() : 대문자로 리턴
		  toLowerCase() : 소문자로 리턴
		  isUpperCase() : 대문자 논리
		  isLowerCase() : 소문자 논리
		  isAlphabetic() : 알파벳 논리
		  isDigit() : 숫자 논리
		  toString() : 문자열로 리턴
		  toCharArray() : 문자 배열로 리턴
		  
---

### 7. 캘린더(Calendar) & 클래스 배열복사(System.arraycopy) & 시간(currentTimeMillis)

		- Calendar : 연-월-일-시-분-초 를 가져오는 메서드
		- 대문자로 입력한다.
		- 메서드 활용 방식 
		  Calendar cal = Calendar.getInstance();
		  연도 : cal.get(Calendar.YEAR); 
		  월 : cal.get(Calendar.MONTH); 1월일 때 0으로 리턴한다.
		  일 : cal.get(Calendar.DATE);
		  시간 : cal.get(Calendar.HOUR); 12시간 or cal.get(Calendar.HOUR_OF_DAY); 24시간
		  분 : cal.get(Calendar.MINUTE);
		  초 : cal.get(Calendar.SECOND);
		
		- 달의 마직막 일 리턴
		  cal.getActualMaximun(Calendar.DATE);
		- 오늘의 요일  리턴
		  cal.get(Calendar.DAY_OF_WEEK);
		- 올해 시작일 부터 오늘까지의 총 일수
		  cal.get(cal.DAY_OF_YEAR);
		
		- 달력 설정
		  cal.set(Calendar.YEAR, 2020); 2020년으로 연도 설정 (다른 설정값도 이렇게 저장이 가능하다.)
		  cal.set(2017,2,1); 2017년 3월 1일으로 설정
		
		- GregorianCalendar : isLeapYear()메서드로 윤년과 평년값을 계산 가능하다.
		  
		---  
		  
		- currentTimemillis() : 1970.1.1부터 초단위로 누적한 값을 밀리세컨드로 리턴한다.
		- 하루는 86400초. 1초는 1000밀리세컨드이다.
		- HH : 24시간, hh : 12시간 / MM : 월, mm : 분
		- a : 오전,오후
		- EEEE : 요일
		
		---
		
		- 클래스 배열복사System.arraycopy
		  ( 입력할 배열(src), 몇번째 인덱스부터(srcPos), 입력받는 배열(dest), 시작할 인덱스(destPos), 넣을 배열의 인덱스 갯수(length) )
		  : 반복문 사용 없이 좀 더 활용적으로 배열을 복사할 수 있다.
		  
---

## Stream

###  1. 예외(exception) & 에러(error)

- 에러(erroe) : 프로그램 코드에 의해서 해결할 수 없는 심각한 오류

- 예외(exception) : 프로그램 코드에 의해서 해결할 수 있는 오류

- exception을 제공해주는 목적
  : 기본 시스템은 정확하지 않는 값을 처리하는데 자바에서는 정확한 값만 처리할 수 있도록 exception을 제공해준다.
  : exception이 발생이 되면 프로그램이 정상적인 종료가 안되므로 이를 해결하기 위해서 예외처리를 제공해주고 있다.
  
		- 예외가 발생되는 시점에 따른 종류
		  1. checked exception
		     : 컴파일 시점에 발생이 되므로 반드시 예외처리를 해야한다.
		     : RuntimeException외 클래스
		  2. unchecked exception
		     : 실행시점에 발생이 되므로 예외처리를 선택할 수 있다.
		     : RuntimeException과 하위클래스들이다.
		     
		- 예외처리 방식
		
		  1. try{
		     // exception 발생 가능이 있는 구문
		     } catch( // try영역에서 발생된 exception객체 선언) {
		     // try영역에서 exception이 발생되었을 때 해결해주는 구문
		     } finally {
		     // 무조건 실행되는 구문
		     }
		  
		  2. - exception이 발생되었을 때 처리순서
		       try영역 -> catch영역 -> finally영역
		     - exception이 발생되지 않았을 때 처리순서
		       try영역 -> finally영역
		  
		  3. try영역 또는 catch영역에서 return을 만나고 finally영역을 수행한다.
		  
		  4. try~catch, try~finally만 작성해도 가능하다. 단 catch~finally, try 만은 사용할 수 없다.
		     (finally는 생략 가능하다.)
		  
		  5. 예외에서의 메세지
		     String get.Message() : 메세지
		     String toString() : 예외타입과 메세지
		     void printStackTrace() : 예외가 발생된 경로 추적
		  
		  - 다중 catch
		    : is a(상속)관계에 있는 exception들을 나열할 때는 제일위에 최하위 자손, 제일 아래에 최상위 조상을 입력한다.
		    : is a관계가 아닌 exception객체들은 순서에 상관없다.
		     
		  - throws
		     : 예외처리를 현재 메소드를 호출하는 곳으로 떠 넘길 때 사용
		       (java.io, java.net)
		     : 예외가 발생된 메서드와 이를 호출하는 메서드 양쪽에서 예외처리를 해주는 경우에 사용한다.
		  
		  - throw
		    : 강제적으로 exception을 발생시킬 때 사용한다.
		    
		  6. 개행 문자
		    - \r : carriage return 개행문자 (아스키코드 13)
		    - \n : new line 줄바꿈 (아크시코드 10)
		    - 윈도우에선 \r\n이 같이 쓰인다.
		
---

### 2. 파일(File)

- 새로운 file을 메인메서드 안에서 새로이 생성할 때 사용한다.

- 코드 내에서 파일 생성 및 삭제가 가능하다.

- java.io.File~

                  - File file = new File("파일경로");
                  - FileReader 클래스
		    : 문자 기반 스트림 / 텍스트 파일을 프로그램으로 읽어들일 때 사용
		    : 문자단위(char)로 읽으므로 텍스트만 읽을 수 있다.
		    : 생성 방법 FileReader fr = new FileReader("파일 경로");
		  - FileReader 객체가 생성될 때 파일이 직접 연결되므로 파일이 존재하지 않으면
		    FileNotFoundException이 발생 -> try~catch문으로 예외처리 해주어야 한다.
		    
		  - FileWriter 클래스
		    : 문자 기반 스트림으로 텍스트 데이터를 파일에 저장할 때 사용
		    : 문자 단위로 저장하므로 텍스트만 저장 가능하다.
		    : 생성 방법 FileWriter fw = new FileWriter("파일경로");
		  - 지정된 파일이 이미 있을 경우 그 파일을 덮어쓴다. 기존의 파일 내용은 없어진다.
		  - 기존 파일 내용끝에 데이터를 추가할 경우 두번 쨰 매개값에 true를 주면 된다.

		  - read() 
		    : 텍스트 파일에서 한 글자씩 글자를 읽어서, char를 리턴한다.
		    : 읽을 글자가 없으면 -1을 리턴한다.
		  - readLine()
		    : 파일의 끝이면 null을 리턴
		   
		  - RandomAccessFile()
		    : 예외적으로 RandomAccessFile이라는 객체 하나로 쓰기와 읽기 둘다 할 수 있다.
		    : 다음 데이터를 읽을지 쓸지 가리키는 pointer가 존재한다.
		    : 맨 처음 파일이 생성되면 처음 위치인 0의 위치를 가리키고 있다가 쓰거나 읽으면 이 포인터가 다음의 위치로 옮겨진다.
		  - "r" : 읽기(read)만 가능하다.
		  - "rw" : 읽기(read)와 쓰기(write)가 가능하다.
		  
		  - file.exist() : 파일의 존재 여부
		  - file.isFile() : 파일인지 아닌지 확인하기
		  - deleteOnExix() : file객체를 현재 시스템이 종료가 될 때 파일을 삭제시켜라
		  - createTempFile(); : 임시 파일 생성. 삭제처리를 해주어야 한다.
		  - delete() : 폴더 삭제
		  - LineNumberReader : 라인번호를 출력할 수 있는 메서드를 제공하는 스트림
		  - seek() : 포인터의 위치를 변경한다.(파일 처음부터 포인터를 찾는다.)
		  - skipBytes() 
		    : 현재 위치를 기준으로 건너뛴다.
		    : 지정된 수 만큼 byte를 건너 뛴다.(포인터가 있는 위치를 기준으로)
		    : 앞으로 이동할 수 없다. 즉, skipBytes(-1)은 적용되지 않는다.
		  - getFilePointer() : 파일안에 포인터 위치값 리턴
		  
		  - is나 has로 시작하는 클래스, 메서드는 true값 혹은 false값을 리턴한다.
		  - isDirectory() : 파일이 있는지 없는지 확인(true or false)
		  - mkdirs() : 디렉토리 파일 생성
		  - exists() : 파일이 존재하면 true 아니면 false
		  - creatNewFile() : 새로운 파일 생성
		  - listFiles() : file의 목록 및 배열을 가져온다.

---

### 3. 입출력 스트림(Stream)

- java.io.*; 패키지에서 제공

- 스트림 : 한 쪽에서 보내준 입력 데이터를 다른 한 쪽으로 출력하는 데이터의 흐름(순서가 있는 데이터의 흐름)

- 자바에서 스트림은 순서있는 데이터의 일방적인 흐름이다.
                   
		  - 스트림 종류
		  
		    1. 입력 / 출력
		    
		       입력 스트림 : InputStream, Reader
		       출력 스트림 : OutputStream, Writer
		       
		    2. 처리단위 구분
		       바이트 스트림 : 바이트, 배열 바이트, 정수 바이트 (즉, 유니코드 값으로 읽어오고 한글은 읽을 수 없다.)
		       문자 스트림 : 문자, 배열 문자, 문자열
		    
		    3. 기능에 따른
		       데이터 싱크 스트림(데이터 전달 기능) - 목적지에 직접 연결한다.
		       : FileInput(Output)Stream, ByteArrayInput(Output)Strea
		       
		       데이터 처리 스트림(데이터의 조작 기능) - 목적지에 간접 연결한다.
		       : BufferdInput(Output)Stream
		    
		  - enter도 유니코드 값이 존재한다. \n(인덱스 1개) or \r\n(인덱스 2개)
		  
---

### 4. 직렬화(Serializable)

- 객체를 연속적인 데이터로 변환하는 것이다. 반대는 역직렬화

- 객체의 멤버변수들의 값을 일렬로 나열하는 것이다.

- 객체를 저장하기 위해서는 객체를 직렬화해야 한다.

- 객체를 저장한다는 것은 객체의 멤버변수값을 저장한다는 것이다.

- 객체를 직렬화하여 입출력할 수 있는 스트림 (ObjectInputStream / ObjectOutputStream)

- 직렬화에서 제외할 멤버변수에서는 transient를 선언한다.

- 직렬화의 이유
  : 생성한 객체를 파일로 저장할 일이 생길 수 있다.
  : 저장한 객체를 읽을 일이 생길 수 있다.
  : 다른 서버에서 생성한 객체를 받아올 일이 생길 수 있다.
  => 이때를 위해 필요한 것이 직렬화이며 파일을 서버로 보내거나 받을 수 있도록 하려면 반드시 직렬화를 구현해야 한다.
  
- JVM에 의해서 저장된 파일은 자동으로 컴파일되어 구현된다.

                   - FileOutputStream 
                     : 데이터를 파일에 바이트 스트림으로 저장하기 위해 사용한다.
		   - ObjectOutputStream
		     : FileOutputStream을 통해 데이터를 바이트의 덩어리로 만들어 스트림에 보낼 수 있는 형태로 바꾸는 작업이며 객체를 생성한다.
		   - FileInputStream
		     : 파일로 부터 바이트로 입력받아, 바이트 단위로 출력할 수 있는 클래스이다.
		   - ObjectInputStrem
		     : FileInputStream을 통해 전달된 바이트 덩어리를 원래의 객체로 복구하는 작업이며 객체를 생성한다.

---

### 5. AutoCloseable

- AutoCloseable을 상속받은 클래스는 try~wirh~resource로 처리가 가능하다.

- 자동으로 close()기능을 제공한다.

- try문 안에 inputStream 객체 선언 및 할당을 하여 선언한 변수를 try안에서 사용이 가능하다.

- 코드를 짧고 간결하게 만들어 유지 보수가 쉬워진다.

---

## Collection

- 자료 구조(Data Structure)
  : 컴퓨터에 자료를 저장하는 방식
  : 자료를 효율적으로 사용하기 위해서 자료의 특성에 따라서 분류하고 구성한 후 저장 및 처리하는 모든 작업
  : 효율적인 자료구조는 메모리를 절약할 뿐 아니라 프로그램 수행시간을 최소화하는 기능을 수행한다,
  
                     - 자료구조 분류
                        1) 단순 구조
                            - 데이터 1개를 저장하기 위한 구조
                            - 정수, 실수, 문자, 문자열 등의 기본 자료형
			2) 선형 구조
			    - 자료들 간의 앞뒤 관계가 1:1의 선형 관계
			    - 배열, Linked List, Stack, Queue, Deque 등 
                        3) 비선형 구조
                            - 자료들 간의 앞뒤 관계가 1:N, 또는 N:N의 관계
                            - Tree, Graph 등
                        4) 파일 구조
                            - 레코드의 집합인 파일에 대한 구조
                            - Sequntial File, Indexed File, Direct File 등

- 알고리즘
  : 어떠한 문제를 해결하기 위한 절차
  : 문제 해결 방법을 추상화하여 각 절차를 논리적으로 기술해 놓은 명세서
  : 자료구조에 따라 알고리즘 또한 방식이 바뀐다.

- 컬렉션에 들어가는 모든 요소들은 Object로 리턴된다.

- 배열 : length / 문자열 : length() / 컬렉션 : size()

- 제너릭(generic) < > 
  : 컬렉션 클래스에 저장된 객체를 가져올 때 다운캐스팅하는 작업을 생략할 수 있도록 제공해주는 기능
  : 컬렉션 클래스를 선언하고 생성할 때 제너릭을 선언한다.

- 동기화 : 요청을 하고 응답을 해야 다음 요청을 할 수 있다.

- 비동기화 : 응답 없이 요청을 계속 할 수 있다(중복 요청). 속도처리가 빠르다.

- 배열 구조로 데이터 관리 : Vector, ArrayList 추가 - (순차적으로 처리할 때 사용)

- 노드로 데이터 관리 : LinkedList 삽입, 삭제 - (비순차적으로 처리할 때 사용) / 내부 메모리 구조가 배열과 다르고 처리 속도가 빠름

- List를 구현해 놓은 컬렉션
  : Vector, ArrayList, LinkeList는 add()해준 순서대로 데이터 관리를 한다.

### 1. Vector

- Vector에 들어가는 값은 요소(element)이다.

- Vector 생성자에 인자값이 없으면 용량의 기본값은 10이다.

- 동기화 처리가 되어 있다.

- 메모리에 요소를 처리할 때 배열의 구조를 따른다.

- ArrayList와 처리방법이 비슷하다.

- 수시로 요소의 삽입, 삭제를 처리하는 것은 좋은 방법이 아니다.

                   - add() : 값을 추가한다.
		   - get() : 입력한 값을 리턴한다.
		   - Number 클래스
		     : abstract클래스로 다음 클래스들은 Number클래스에 상속한다.
		     : Short, Byte, Integer, Long, Float, Double
		   - addElement() : 백터에만 존재하는 api. 별도의 리턴값이 없다.
		   - capacity() : 현재 할당되어 있는 크기를 byte단위로 측정
		   - trimToSize() : 요소가 저장되어 있지 않는 메모리 제거
		   - contains() : 대상 문자열에 특정 문자열이 포함되어 있는지 확인하는 메서드
		   - a.removeAll(b) : a.toString() - b.toString() 이라고 이해하면 된다.

---

### 2. 선형리스트(Linear List)

- 순서리스트(Ordered List)

- 자료들 간에 순서를 갖는 리스트

- 선형 리스트에서 원소를 나열한 순서는 원소들의 순서가 된다.

---

### 3. ArrayList

- 비동기화 처리가 된다.

- 메모리에 요소를 처리할 때 배열의 구조를 따른다.

- Vector와 처리방법이 비슷하다.

- 수시로 요소의 삽입, 삭제를 처리하는 것은 좋은 방법이 아니다.

                    - toArray() :  List 컨테이너의 인스턴스를 배열(array)로 만드는것
		    
		    - Enumeration기능이 제공되지 않는다.
		    
		    - Arrays.asList() : 배열을 ArrayList로 바꿔준다.
		    
---

### 4. Enumeration & Iterator

- Vector와 Hashtable에서만 제공이 되는 인터페이스이다.

- 유지보수 등 유연성을 더 좋게 만든다.

- Iterator<> 
  : 자바 컬렉션 프레임웍에서 컬렉션에 저장되어 있는 요소들을 읽어보는 방법을 표준화한 그 중 하나
  : 컬렉션의 요소에 접근할 때 한 방향으로만 이동이 가능하다.

- ListIterator<> 
  : Iterator 인터페이스를 상속받아 여러 기능을 추가한 인터페이스
  : 컬렉션 요소의 대체, 추가 그리고 인덱스 검색 등을 위한 작업에서 양방향으로 이동하는 것을 지원

                    1) Enumeration 제공 메서드
		      - hasMoreElements() : 다음 내용 확인
		      - nextElement() : 다음 값을 가져오기
		       
		    2) Iterator 제공 메서드
		      - hasNext() : 다음 내용 확인
		      - next() : 다음 값을 가져오기
		      - hasPrevious() : 뒤에 값이 있는지 확인
		      - previous() : 포인터를 기준으로 뒤에서 부터 값을 가져오기
		      - remove() : 해당 컬렉션 값 제거
		     
---

### 5. LinkedList

- 비순차적으로 리스트를 처리한다.

- 처리 속도가 빠르다.

                     - remove() : 공백이면 무조건 첫 번째 요소를 삭제
		     - removeLast() : 마지막 요소를 삭제
		     - remove(2) : 특정 인덱스 요소 삭제

---

### 6. Stack

- LIFO(Last In First Out) : 마지막에 저장된 요소를 먼저 꺼낸다.

- 수식계산, 수식괄호검사, undo/redo, 뒤로/앞으로

                      - push() : 입력한 순서대로 데이터가 쌓인다.
		      - pop() 
		        : 마지막에 저장된 순서로 데이터를 꺼낸다(포인터의 위치에 따라 꺼내온다.).
			: 완전히 꺼내어 값을 다 꺼내게 되면 텅 비게 된다.
	              - isEmpty() : 객체가 비어있는지 확인할 때 사용
		      
---

### 7. Queue

- FIFO(First In First Out) : 제일 먼저 저장한 요소를 제일 먼저 꺼내준다.

- 최근 사용 문서, 인쇄 작업 대기 목록, 버퍼
  
                      - offer() : Queue사용을 하기 위한 저장 메서드
		      - poll() : 저장한 순서대로 꺼내주는 메서드. 완전히 꺼내온다.

---

### 8. TreeSet & HashSet & Set

- tree : 정렬 / set : 중복 허용 안됨.

- TreeSet : 오름차순 정렬 및 중복 허용 안됨

- 값이 중복되면 내부에서 자동으로 처리되어 중복값은 리턴하지 않는다.

                      - descendingIterator() : 내림차순 메서드

- HashSet : 순사 상관 없이, 중복허용은 안되게끔 한다.

- Set은 List와 다르게 객체(데이터)를 중복해서 저장할 수 없다. 또한 저장 순서도 보장되지 않는다.

---

### 9. Hashtable &  HashMap & TreeMap

- Hashtable
  : Map인터페이스를 구현한 클래스
  : Map인터페이스를 구현해 놓은 클래스들은 key, value(element)쌍으로 저장한다.
  : value를 구현해주는 것은 key이므로 key는 중복을 허용하지 않는다.
  : key값을 넣어주면 value값을 리턴한다.
  : 동기화 처리 방식

- HashMap
  : Map인터페이스를 구현한 클래스
  : 비동기화 처리 방식

- TreeMap
  : Map인터페이스를 구현한 클래스
  : 정렬을 제공하는 클래스
  
                      - put( , ) : 값 저장 메서드

---

### 10. 제너릭 < > 클래스

- 클래스 명에 제너릭 값을 임의로 준 뒤 메인메서드에서 다양하게 활용할 수 있다.

- String, Integer, Double 등 어떠한 래퍼(wrapper)를 넣어도 실행이 되게끔 할 수 있다.

---

### 11. 와일드 카드 <?>

- 컬렉션에 저장되는 요소들이 특정한 객체로 정해진 상태에서 다른 객체형은 저장할 수 없는 상태였다.

- 하지만, 떄로는 기존과 같이 모든 객체들을 저장해야 할 때가 있다.

- 와일드 카드의 구성
  : <?> 모든 객체자료형에 대한 배치를 의미
  : <? super 객체자료형> 명시된 객체자료형이나 객체자료형의 상위 객체들의 배치를 의미
  : <? extends 객체자료형> 명시된 객체자료형이나 객체자료형으로부터 상속받은 하위객체들의 배치를 의미한다.
  : Object로 처리 된다.
  
---

### 11. 정렬(sort)

- sort() : 정렬 메서드에 상속되어 있는 Comparator<> 클래스를 사용할 클래스에 상속시켜줘야 한다.

- compareTo() 
  : 오름차순, 내림차순 정렬 메서드
  : 앞에 문자열이 같고 길이가 다르면 길이를 비교한다.
