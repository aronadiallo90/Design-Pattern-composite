import java.util.ArrayList;

public class Dossier extends Composite {

    ArrayList<Composite> components = new ArrayList<Composite>();

    public Dossier(String name, int level) {
        super(name, level);
    }

    public void addComponent(Composite c) {
        components.add(c);
    }

    public void recursiveTreeDisplay() {

        int level = getLevel();
        for (int i = 0; i < level; i++) {
            System.out.print("│\t");
        }
        System.out.println("├──" + getName());
        for (Composite c : components) {
            c.recursiveTreeDisplay();
        }
    }
}
