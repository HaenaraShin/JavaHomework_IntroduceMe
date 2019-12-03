package kr.ac.icsu.seonggyu;

import kr.ac.icsu.seonggyu.introduce.Introducable;
import kr.ac.icsu.seonggyu.introduce.IntroduceMethod;

import java.util.HashMap;

/**
 * 학생은 소개할 수 있는 정보만 가지고 있다.
 * 소개하는 방법은 IntroduceMethod 를 통해 받는다.
 */
public class PSK implements Introducable {
  private static final String KEY_NAME = "name";  // 이름
  private static final String KEY_MAJOR = "major"; // 학과
  private static final String KEY_ID = "id";  // 학번
  private static final String KEY_MAIL = "email";  // 이메일
  private static final String KEY_BIRTH = "birth";  // 생년월일 (yyyy년, M월 d일)
  private IntroduceMethod method;
  private HashMap<String, String> dataMap = new HashMap<>();

  public PSK(String name, String major, String id, String email, String birth) {
    dataMap.put(KEY_NAME, name);
    dataMap.put(KEY_MAJOR, major);
    dataMap.put(KEY_ID, id);
    dataMap.put(KEY_MAIL, email);
    dataMap.put(KEY_BIRTH, birth);
    method = new IntroduceMethod() {
      @Override
      public String getIntroduceMessage() {
        return "";
      }
    };
  }

  @Override
  public String getName() { return dataMap.get(KEY_NAME); }
  @Override
  public String getEmail() { return dataMap.get(KEY_MAIL); }
  @Override
  public String getBirth() { return dataMap.get(KEY_BIRTH); }
  @Override
  public String getMajor() { return dataMap.get(KEY_MAJOR); }


  /**
   * 소개 자체는 소개하는 방법에 맞추어 콘솔에 프린트만 해준다.
   */
  @Override
  public void introduce() {
    System.out.println(method.getIntroduceMessage());
  }

  /**
   * 소개할 방법 설정
   * @param method
   */
  @Override
  public void setIntroduceMethod(IntroduceMethod method) {
    this.method = method;
  }
}
