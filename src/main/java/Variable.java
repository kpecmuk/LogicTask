class Variable {

    private Double value;

    Variable() {
        this.value = 1.0;
    }

    Double getValue() {
        return this.value;
    }

    boolean valueIsNotMax() {
        boolean result = true;

        if (value >= 10) {
            value = 1.0;
            result = false;
        }
        return result;
    }

    void increaseValue() {
        if (valueIsNotMax()) {
            value++;
        } else {
            value = 1.0;
        }
    }
}
