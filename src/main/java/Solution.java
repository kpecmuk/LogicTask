/**
 * Здесь будем проверять решения,
 * подставляя числа в таблицу для вычисления.
 * Ну тоесть числа уже там. Просто делаем проверку.
 */
class Solution {
    private XNum xnum;

    Solution(XNum xnum) {
        this.xnum = xnum;
    }

    boolean check() {
        boolean result = false;

        if ((xnum.getMap().get("a1").getValue() + xnum.getMap().get("a2").getValue()) / xnum.getMap().get("a3").getValue() == 3 &&
                ((xnum.getMap().get("a1").getValue() - xnum.getMap().get("b1").getValue()) * xnum.getMap().get("c1").getValue() == 9) &&
                (xnum.getMap().get("b1").getValue() + xnum.getMap().get("b2").getValue() + 3 == xnum.getMap().get("b4").getValue()) &&
                (xnum.getMap().get("c1").getValue() * 2 / xnum.getMap().get("c3").getValue() == xnum.getMap().get("c4").getValue()) &&
                (9 - xnum.getMap().get("d2").getValue() + xnum.getMap().get("d3").getValue() == xnum.getMap().get("d4").getValue()) &&
                (xnum.getMap().get("a2").getValue() - xnum.getMap().get("b2").getValue() + 2 == xnum.getMap().get("d2").getValue()) &&
                ((xnum.getMap().get("a3").getValue() - 3) / xnum.getMap().get("c3").getValue() == xnum.getMap().get("d3").getValue()) &&
                (3 * xnum.getMap().get("b4").getValue() / xnum.getMap().get("c4").getValue() == xnum.getMap().get("d4").getValue())
        ) {

            result = true;
        }

        return result;
    }
}
