package org.example.model;

public enum Operation {
    PLUS('+'), MINUS('-'), MULTI('*'), DIVISION('/');

    private char symbol;

    Operation(char symbol) {
        this.symbol = symbol;
    }

    public Operation of(char symbol) {
        for (Operation op : Operation.values()) {
            if (symbol == op.symbol) {
                return op;
            }
        }
        return null;
    }
}
