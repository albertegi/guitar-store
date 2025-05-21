public enum Builder {
    FENDER, MARTIN, GIBSON, COLLINSGS,
    OLSON, RYAN, PRS, ANY;

    @Override
    public String toString() {
        return switch (this) {
            case FENDER -> "Fender";
            case MARTIN -> "Martin";
            case GIBSON -> "Gibson";
            case COLLINSGS -> "Collings";
            case OLSON -> "Olson";
            case RYAN -> "Ryan";
            case PRS -> "PRS";
            case ANY -> "Any";
            default -> throw new IllegalArgumentException("Unknown type: " + this);
        };
    }
}
