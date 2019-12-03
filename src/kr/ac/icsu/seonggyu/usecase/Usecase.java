package kr.ac.icsu.seonggyu.usecase;

import kr.ac.icsu.seonggyu.introduce.Introducable;

public abstract class Usecase {
    /**
     * 소개할 학생
     */
    protected Introducable student;

    public Usecase(Introducable student) {
        this.student = student;
    }

    /**
     * USECASE 실행
     */
    public abstract void execute();
}
