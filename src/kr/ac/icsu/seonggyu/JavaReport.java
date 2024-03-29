package kr.ac.icsu.seonggyu;

import kr.ac.icsu.seonggyu.usecase.InvaildProgramArgumentException;
import kr.ac.icsu.seonggyu.usecase.UsecaseFactory;

/**
 * 2019.12.3 과제
 * program arguments 에 맞게 USECASE를 생성하면
 * 해당 USECASE에 맞게 소개방법을 설정하고 소개한다.
 */
public class JavaReport {
    public static String[] data = new String[4];
    public static void main(String[] args) {
        new JavaReport().launchMain(args);
    }

    private void launchMain(String[] args) {
        try {
            new UsecaseFactory(
                    new HGD("홍길동", "컴퓨터공학과", "12345", "hong@gil.dong", "1989년 3월 12일"))
                    .createUsecase(args)
                    .execute();
        } catch (InvaildProgramArgumentException e) {
            e.printStackTrace();
        }
    }
}