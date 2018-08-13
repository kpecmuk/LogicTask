import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;

class Logic {
    private static final Logger log = LoggerFactory.getLogger(Logic.class);

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
        log.info("calculating...");

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
                                                            log.info("Solution found");
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
        log.info("!!! No solution !!!");
    }
}
