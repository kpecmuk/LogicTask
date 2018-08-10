class Variable {

    private Double value;

    Variable() {
        this.value = 1.0;
    }

    Variable(double value) {
        this.value = value;
    }

    Double getValue() {
        return this.value - 1;
    }

    boolean increaseValue() {
        boolean result = true;
        if (value < Logic.MAX_VALUE) {
            value++;
        } else {
            result = false;
            value = 1.0;
        }
        return result;
    }
}
