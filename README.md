2019년 2학기 객체지향프로그래밍(JAVA)
==================================================

- 제출일 : 2019년 12월 21일 (토)
- 제출 방법 : 자바소스(.java파일) 와 실행파일 (.class파일)을 본인 이름과 학번으로 압축하여 제출

```
[ 예) 홍길동_1334567.zip ]
```


# 과제 내용

## 1. 본인의 이름/학과/이메일 의 정보를 저장하고 출력할 수 있는 개인정보 클래스를 생성

### 클래스 이름은 본인의 이니셜을 사용할 것

[ 예) 홍길동의 경우 - class HGD { .... }

 

### 개인정보는 배열 또는 map 클래스를 사용하여 저장

* 이름
* 학번
* 이메일
* 생년월일

### 생성자

* 개인정보의 입력될 값(이름/학과/이메일/생년월일)은 객체 생성 시 생성자를 통해 입력될 수 있도록 작성

### 클래스 메소드

1) 이름과 학과를 출력하는 메소드

2) 이메일 및 도메인을 추출하여 출력하는 메소드

3) 생년월일과 오늘 날자를 비교하여 만 나이를 출력하는 메소드

 

 

## 2. 실행 클래스 생성

 

### 1번에서 작성한 개인정보 클래스의 메소드를 사용하여 출력할 것

 

### 실행시 출력 정보를 선택 (1-3까지 문자를 입력)
```
[ 예: class명 - JavaReport 일때 c:\java JavaReport 1 ]
```
 


* 1번 선택시 : 이름과 학과를 출력
```
<출력결과 : “개발자의 이름은 [OOOO 학과 홍길동] 입니다“>
```
 

 

* 2번 선택시 : 이메일 및 이메일 도메인 출력

- 문자열 처리를 통해 개발자 도메인을 추출할 것
```
<출력결과 : “개발자의 이메일은 000@icsu.ac.kr입니다.
개발자는 iscu.ac.kr 메일을 사용합니다“ >
```

* 3번 선택시 : 오늘 날자 및 나이를 출력

- calendar class를 사용하여 오늘 날자를 출력

- 생년월일과 비교하여 만 나이를 출력
```
<출력결과 : “오늘 날자는 2019년 12월 21일입니다
개발자의 생년월일은 0000년 0월 0일로 만 00세 입니다 “>
```
 