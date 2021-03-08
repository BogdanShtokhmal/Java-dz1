package dz3.part1;

public enum SizeCloses {
    XXS(38),
    XS(40),
    S(42),
    M(44),
    L(46);


    int euroSize;

    SizeCloses(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    @Override
    public String toString() {
        return "SizeCloses{" +
                "euroSize=" + euroSize +
                "} " + super.toString();
    }

}
