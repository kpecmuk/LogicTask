import java.util.HashMap;
import java.util.Map;

/**
 * CrossNumbers.
 * Создаем список переменных
 */
class XNum {

    private Map<String, Variable> map = new HashMap<>();

    XNum() {
        // Добавляем верхнюю строку переменных  A1+A2:A3=3
        map.put("a1", new Variable());
        map.put("a2", new Variable());
        map.put("a3", new Variable());

        // Добавляем вторую сверху строку переменных    B1+B2+3=B4
        map.put("b1", new Variable());
        map.put("b2", new Variable());
        map.put("b4", new Variable());

        // Добавляем третью сверху строку переменных    C1x2:C3=C4
        map.put("c1", new Variable());
        map.put("c3", new Variable());
        map.put("c4", new Variable());

        // Добавляем нижнюю строку переменных   9-D2+D3=D4
        map.put("d2", new Variable());
        map.put("d3", new Variable());
        map.put("d4", new Variable());
    }

    Map<String, Variable> getMap() {
        return this.map;
    }
}
