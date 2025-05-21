import java.util.List;

public class MainClass {
    public static void main(String[] args) {

        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar searchGuitar = new Guitar("", 0, Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        List<Guitar> matchingGuitars = inventory.search(searchGuitar);

        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Guitar guitar : matchingGuitars) {
                System.out.println("We have a " + guitar.getBuilder()
                        + " " + guitar.getModel() + " " + guitar.getType() + " guitar:\n"
                        + guitar.getBackWood() + " back and sides,\n"
                        + guitar.getTopWood() + " top.\n"
                        + "You can have it for only $" + guitar.getPrice() + "!\n");
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    private static void initializeInventory(Inventory inventory) {
        // Example initialization
        inventory.addGuitar("V95693", 1499.95, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);

        inventory.addGuitar("V9512", 1549.95, Builder.FENDER, "Stratocastor",
                Type.ELECTRIC, Wood.ALDER, Wood.ALDER);
    }
}
