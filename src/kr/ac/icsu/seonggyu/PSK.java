package kr.ac.icsu.seonggyu;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

public class PSK {
  private static final String KEY_NAME = "name";
  private static final String KEY_MAJOR = "major";
  private static final String KEY_ID = "id";
  private static final String KEY_MAIL = "email";
  private static final String KEY_BIRTH = "birth";

  private HashMap<String, String> dataMap = new HashMap<>();
  public PSK(String name, String major, String id, String email, String birth) {
    dataMap.put(KEY_NAME, name);
    dataMap.put(KEY_MAJOR, major);
    dataMap.put(KEY_ID, id);
    dataMap.put(KEY_MAIL, email);
    dataMap.put(KEY_BIRTH, birth);
  }

  public String getName() { return dataMap.get(KEY_NAME); }
  public String getId() { return dataMap.get(KEY_ID); }
  public String getEmail() { return dataMap.get(KEY_MAIL); }
  public String getBirth() { return dataMap.get(KEY_BIRTH); }
  public String getMajor() { return dataMap.get(KEY_MAJOR); }

  /**
   * 도메인은 메일주소에서
   * @return domain
   */
  public String getDomain() { return getEmail().split("@")[0]; }

  public String introduceNameMajor(){
    return "개발자의 이름은 [" + getMajor() + " 학과 " + getName() + "] 입니다.";
  }

  public String introduceEmail(){
    return "개발자의 이메일은 " + getEmail() + "입니다.\n" +
        "개발자는 " + getDomain() + " 메일을 사용합니다";
  }

  public String introduceAge() {
    return "오늘 날자는 " + getDate() +"입니다\n" +
        "개발자의 생년월일은 "+ getBirth() + "로 만 " + getAge() +"세 입니다";
  }

  private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 mm월 dd일");
  private String getDate() {
    return dateFormat.format(new Date());
  }

  private long getAge() {
    try {
      long age = new Date().getTime() - dateFormat.parse(getBirth()).getTime();
      return age / (1000) / 3600 / 24 / 365;
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return 0;
  }
}
