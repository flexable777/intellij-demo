package demo.intellij.intentions;

public class BasicIntentions {

    private volatile int counter;

    public void neverUsed() {
        inspections();
    }

    private void inspections() {
        counter++;
    }

    public boolean booleanChecks(boolean a, boolean b, String c) {
        System.out.println(!(a != b));
        System.out.println(c.equals("ba"));
        System.out.println(b != true);

        if (a) {
            return false;
        } else {
            return true;
        }
    }

}
