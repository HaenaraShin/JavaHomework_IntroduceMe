package kr.ac.icsu.seonggyu.introduce;

/**
 * 자기소개 가능한 객체
 * 자기소개에 쓰일만한 정보를 가지고 있어야 한다.
 */
public interface Introducable {
    /**
     * 실제 자기소개 실행
     */
    void introduce();

    /**
     * 자기소개 할 방법을
     * @param method
     */
    void setIntroduceMethod(IntroduceMethod method);
    String getName();  // 이름
    String getMajor();  // 학과
    String getEmail();  // 이메일
    String getBirth();  // 생년월일
}
