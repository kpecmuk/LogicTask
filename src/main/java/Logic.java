import java.util.Map;

class Logic {

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

        for (; xnum.getMap().get("d4").increaseValue(); ) {
            for (; xnum.getMap().get("d3").increaseValue(); ) {
                System.out.println("d3");
                for (; xnum.getMap().get("c3").increaseValue(); ) {
                    System.out.println("c3");

                    for (; xnum.getMap().get("c4").increaseValue(); ) {
                        for (; xnum.getMap().get("d2").increaseValue(); ) {
                            for (; xnum.getMap().get("b4").increaseValue(); ) {

                                for (; xnum.getMap().get("b2").increaseValue(); ) {
                                    for (; xnum.getMap().get("c1").increaseValue(); ) {
                                        for (; xnum.getMap().get("b1").increaseValue(); ) {

                                            for (; xnum.getMap().get("a3").increaseValue(); ) {
                                                for (; xnum.getMap().get("a2").increaseValue(); ) {
                                                    for (; xnum.getMap().get("a1").increaseValue(); ) {

                                                        if (solution.check()) {
                                                            System.out.println("DONE");
                                                            showInfo();
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
