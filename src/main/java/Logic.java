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

        for (xnum.getMap().get("d4"); xnum.getMap().get("d4").valueIsNotMax(); xnum.getMap().get("d4").increaseValue()) {
            for (xnum.getMap().get("d3"); xnum.getMap().get("d3").valueIsNotMax(); xnum.getMap().get("d3").increaseValue()) {
                for (xnum.getMap().get("c3"); xnum.getMap().get("c3").valueIsNotMax(); xnum.getMap().get("c3").increaseValue()) {
                    for (xnum.getMap().get("c4"); xnum.getMap().get("c4").valueIsNotMax(); xnum.getMap().get("c4").increaseValue()) {
                        for (xnum.getMap().get("d2"); xnum.getMap().get("d2").valueIsNotMax(); xnum.getMap().get("d2").increaseValue()) {
                            for (xnum.getMap().get("b4"); xnum.getMap().get("b4").valueIsNotMax(); xnum.getMap().get("b4").increaseValue()) {
                                for (xnum.getMap().get("b2"); xnum.getMap().get("b2").valueIsNotMax(); xnum.getMap().get("b2").increaseValue()) {
                                    for (xnum.getMap().get("c1"); xnum.getMap().get("c1").valueIsNotMax(); xnum.getMap().get("c1").increaseValue()) {
                                        for (xnum.getMap().get("b1"); xnum.getMap().get("b1").valueIsNotMax(); xnum.getMap().get("b1").increaseValue()) {
                                            for (xnum.getMap().get("a3"); xnum.getMap().get("a3").valueIsNotMax(); xnum.getMap().get("a3").increaseValue()) {
                                                for (xnum.getMap().get("a2"); xnum.getMap().get("a2").valueIsNotMax(); xnum.getMap().get("a2").increaseValue()) {
                                                    for (xnum.getMap().get("a1"); xnum.getMap().get("a1").valueIsNotMax(); xnum.getMap().get("a1").increaseValue()) {

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
