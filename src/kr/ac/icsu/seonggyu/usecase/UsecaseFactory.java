package kr.ac.icsu.seonggyu.usecase;

import kr.ac.icsu.seonggyu.introduce.Introducable;

public class UsecaseFactory {
    private Introducable student;

    public UsecaseFactory(Introducable student) {
        this.student = student;
    }

    public Usecase createUsecase(String[] args) throws InvaildProgramArgumentException {
        if (args.length == 1) {
            switch (args[0]) {
                case "1":
                    return new Usecase1(student);
                case "2":
                    return new Usecase2(student);
                case "3":
                    return new Usecase3(student);
                default:
                    break;
            }
        }
        throw new InvaildProgramArgumentException();
    }
}
