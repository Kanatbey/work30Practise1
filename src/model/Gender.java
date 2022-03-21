package model;

public enum Gender {
    FEMALE("FEMALE"),
    MALE("MALE");
    private String gen;

    Gender(String gen) {
        this.gen = gen;
    }

    public String getGen() {
        return gen;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    @Override
    public String toString() {
        return "Gender : " + gen;
    }
}
