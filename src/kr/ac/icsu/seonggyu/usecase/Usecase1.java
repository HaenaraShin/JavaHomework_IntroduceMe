package kr.ac.icsu.seonggyu.usecase;

import kr.ac.icsu.seonggyu.introduce.Introducable;
import kr.ac.icsu.seonggyu.introduce.IntroduceMethod;

/**
 * USECASE1
 * 이름과 학과 소개
 */
public class Usecase1 extends Usecase{

    public Usecase1(Introducable student) {
        super(student);
    }

    @Override
    public void execute() {
        student.setIntroduceMethod(new IntroduceMethod() {
            @Override
            public String getIntroduceMessage() {
                return "개발자의 이름은 [" + student.getMajor() + " 학과 " + student.getName() + "] 입니다.";
            }
        });
        student.introduce();
    }
}
