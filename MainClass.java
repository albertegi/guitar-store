import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);

        if (!matchingGuitars.isEmpty()) {
            for (Guitar guitar : matchingGuitars) {
                GuitarSpec spec = guitar.getSpec();
                System.out.println("Erin, you might like this " +
                        spec.getBuilder() + " " + spec.getModel() + " " +
                        spec.getType() + " guitar:\n" +
                        spec.getBackWood() + " back and sides,\n" +
                        spec.getTopWood() + " top.\nYou can have it for only $" +
                        guitar.getPrice() + "!");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        inventory.addGuitar("V95673", 1439.95, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        inventory.addGuitar("V95633", 1339.95, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }
}
