package kr.ac.icsu.seonggyu.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 날짜 계산 관련 유틸 클래스
 */
public class AgeCalculator {
    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("yyyy년 M월 d일");

    /**
     * 오늘 날짜 구하기
     * @return
     */
    public static String today() { return DATE_FORMAT.format(new Date()); }

    /**
     * 만 나이 구하기
     * 년 끼리 계산 한 이후 생일날짜가 지나지 않았다면 한살을 뺀다.
     * @param birth
     * @return
     */
    public static int getAge(String birth) {
        try {
            Calendar today = Calendar.getInstance();
            today.setTime(new Date());
            Calendar birthday = Calendar.getInstance();
            birthday.setTime(DATE_FORMAT.parse(birth));

            return (today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR)) +
                    (today.get(Calendar.DAY_OF_YEAR) > birthday.get(Calendar.DAY_OF_YEAR) ? 0 : -1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
