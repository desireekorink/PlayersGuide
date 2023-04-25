package PlayersGuidePackage.Files.FountainOfObjects;

public enum ArrowInformation {
    STEEL(10),
    WOOD(3),
    OBSIDIAN(5),
    TURKEY(5),
    GOOSE(3),
    PLASTIC(10);

    private final float cost;

    ArrowInformation(float cost) {
        this.cost = cost;
    }

    public float getCost() {
        return cost;
    }
}
