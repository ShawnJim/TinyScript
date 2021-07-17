package com.shawn.tinyscript.lexer;

public class Token {

    private TokenType type;
    private String value;

    public Token(TokenType tokenType, String value) {
        this.type = tokenType;
        this.value = value;
    }

    public boolean isVariable(){
        return type == TokenType.VARIABLE;
    }

    public boolean isScala(){
        return type == TokenType.INTEGER
                || type == TokenType.FLOAT
                || type == TokenType.STRING
                || type == TokenType.BOOLEAN;
    }

    public TokenType getType() {
        return type;
    }

    public void setType(TokenType type) {
        this.type = type;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Token{" +
                "type=" + type +
                ", value='" + value + '\'' +
                '}';
    }
}
