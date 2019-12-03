package kr.ac.icsu.seonggyu.usecase;

import kr.ac.icsu.seonggyu.introduce.Introducable;
import kr.ac.icsu.seonggyu.introduce.IntroduceMethod;

/**
 * USECASE2
 * 메일과 도메인 소개
 */
public class Usecase2 extends Usecase{

    public Usecase2(Introducable student) {
        super(student);
    }

    @Override
    public void execute() {
        student.setIntroduceMethod(new IntroduceMethod() {
            @Override
            public String getIntroduceMessage() {
                return "개발자의 이메일은 " + student.getEmail() + "입니다.\n" +
                        "개발자는 " + getDomain(student.getEmail()) + " 메일을 사용합니다";
            }
        });
        student.introduce();
    }

    /**
     * 도메인은 메일주소에서
     * @return domain
     */
    public String getDomain(String email) { return email.substring(email.indexOf("@") + 1); }

}
