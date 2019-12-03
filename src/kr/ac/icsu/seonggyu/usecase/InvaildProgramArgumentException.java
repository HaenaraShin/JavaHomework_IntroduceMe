package kr.ac.icsu.seonggyu.usecase;

public class InvaildProgramArgumentException extends Exception {
    public InvaildProgramArgumentException() {
        super("Invalid arguments.\n"
        + "Arguments should be 1, 2 or 3");
    }
}
