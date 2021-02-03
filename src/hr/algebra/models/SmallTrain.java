package hr.algebra.models;

public class SmallTrain extends Train implements ICapcity{

    public SmallTrain(int id) {
        super(id);
    }

    @Override
    public int capicity() {
        return 8;
    }
}
