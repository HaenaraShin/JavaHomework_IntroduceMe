package kr.ac.icsu.seonggyu;

import kr.ac.icsu.seonggyu.usecase.InvaildProgramArgumentException;
import kr.ac.icsu.seonggyu.usecase.UsecaseFactory;

/**
 * 2019.12.3 과제
 * program arguments 에 맞게 USECASE를 생성하면
 * 해당 USECASE에 맞게 소개방법을 설정하고 소개한다.
 */
public class JavaReport {
    public static void main(String[] args) {
        new JavaReport().launchMain(args);
    }

    private void launchMain(String[] args) {
        try {
            new UsecaseFactory(
                    new PSK("박성규", "빅데이터", "12345", "psk@isic.ackr", "1989년 3월 12일"))
                    .createUsecase(args)
                    .execute();
        } catch (InvaildProgramArgumentException e) {
            e.printStackTrace();
        }
    }
}