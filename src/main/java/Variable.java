class Variable {

    private Double value;

    Variable() {
        this.value = 1.0;
    }

    Double getValue() {
        return value;
    }

    boolean increaseValue() {
        boolean result = true;

        if (value < 10) {
            value++;
        } else {
            result = false;
            value = 1.0;
        }

        return result;
    }
}
