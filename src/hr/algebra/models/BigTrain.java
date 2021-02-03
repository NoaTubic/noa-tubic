package hr.algebra.models;

public class BigTrain extends Train implements ICapcity {

    public BigTrain(int id) {
        super(id);
    }

    @Override
    public int capicity() {
        return 6;
    }
}
