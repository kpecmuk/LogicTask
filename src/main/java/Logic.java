import java.util.Map;
import java.util.WeakHashMap;

class Logic {

    static final int MAX_VALUE = 10;
    private XNum xnum;
    private Solution solution;

    Logic(XNum xnum) {
        this.xnum = xnum;
        this.solution = new Solution(xnum);
    }

    private void showInfo() {
        for (Map.Entry<String, Variable> var : xnum.getMap().entrySet()) {

            System.out.print(var.getKey() + " = " + var.getValue().getValue() + " | ");
        }
        System.out.println();
    }

    void run() {
        System.out.println("CALCULATING...");

        while (xnum.getMap().get("d4").increaseValue()) {
            while (xnum.getMap().get("d3").increaseValue()) {
                while (xnum.getMap().get("c3").increaseValue()) {
                    while (xnum.getMap().get("c4").increaseValue()) {
                        while (xnum.getMap().get("d2").increaseValue()) {
                            while (xnum.getMap().get("b4").increaseValue()) {
                                while (xnum.getMap().get("b2").increaseValue()) {
                                    while (xnum.getMap().get("c1").increaseValue()) {
                                        while (xnum.getMap().get("b1").increaseValue()) {
                                            while (xnum.getMap().get("a3").increaseValue()) {
                                                while (xnum.getMap().get("a2").increaseValue()) {
                                                    while (xnum.getMap().get("a1").increaseValue()) {

                                                        if (solution.check()) {
                                                            System.out.println("DONE");
                                                            showInfo();
                                                            return;
                                                        }

                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
