package kr.ac.icsu.seonggyu.usecase;

import kr.ac.icsu.seonggyu.introduce.Introducable;
import kr.ac.icsu.seonggyu.introduce.IntroduceMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    private String getDate() { return dateFormat.format(new Date()); }

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy년 M월 d일");

    /**
     * 만나이 계산
     * 연,월,일 개별로 계산해야하지만 편의상 시간으로 환산하여 계산했기 때문에 버그가 있음. 수정 필요
     * @param birth
     * @return
     */
    private long getAge(String birth) {
        try {
            long age = new Date().getTime() - dateFormat.parse(birth).getTime();
            return age / (1000) / 3600 / 24 / 365;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
