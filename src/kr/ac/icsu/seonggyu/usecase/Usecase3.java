package kr.ac.icsu.seonggyu.usecase;

import kr.ac.icsu.seonggyu.introduce.Introducable;
import kr.ac.icsu.seonggyu.introduce.IntroduceMethod;
import kr.ac.icsu.seonggyu.util.AgeCalculator;

/**
 * USECASE3
 * 생일과 만나이 소개
 */
public class Usecase3 extends Usecase{

    public Usecase3(Introducable student) {
        super(student);
    }

    @Override
    public void execute() {
        student.setIntroduceMethod(new IntroduceMethod() {
            @Override
            public String getIntroduceMessage() {
                return "오늘 날자는 " + getDate() +"입니다\n" +
                        "개발자의 생년월일은 "+ student.getBirth() + "로 만 " + getAge(student.getBirth()) +"세 입니다";
            }
        });
        student.introduce();
    }

    /**
     * 오늘 날짜
     * @return
     */
    private String getDate() { return AgeCalculator.today(); }

    /**
     * 만나이 계산
     * @param birth
     * @return
     */
    private int getAge(String birth) {
        return AgeCalculator.getAge(birth);
    }
}
