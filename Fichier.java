public class Fichier extends Composite {

    public Fichier(String name, int level) {
        super(name, level);
    }

    public void recursiveTreeDisplay() {
        int level = getLevel();
        for (int i = 0; i < level; i++) {
            System.out.print("│\t");
        }
        System.out.println("├──" + getName());
    }
}
