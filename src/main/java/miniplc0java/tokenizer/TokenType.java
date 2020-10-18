package miniplc0java.tokenizer;

public enum TokenType {
    /**
     * 空
     */
    None("NullToken"),
    /**
     * 无符号整数
     */
    Uint("UnsignedInteger"),
    /**
     * 标识符
     */
    Ident("Identifier"),
    /**
     * Begin
     */
    Begin("Begin"),
    /**
     * End
     */
    End("End"),
    /**
     * Var
     */
    Var("Var"),
    /**
     * Const
     */
    Const("Const"),
    /**
     * Print
     */
    Print("Print"),
    /**
     * 加号
     */
    Plus("PlusSign"),
    /**
     * 减号
     */
    Minus("MinusSign"),
    /**
     * 乘号
     */
    Mult("MultiplicationSign"),
    /**
     * 除号
     */
    Div("DivisionSign"),
    /**
     * 等号
     */
    Equal("EqualSign"),
    /**
     * 分号
     */
    Semicolon("Semicolon"),
    /**
     * 左括号
     */
    LParen("LeftBracket"),
    /**
     * 右括号
     */
    RParen("RightBracket"),
    /**
     * 文件尾
     */
    EOF("EOF");

    private TokenType(String name) {
        this.name = name;
    }

    private final String name;

    @Override
    public String toString() {
        return this.name;
    }
}
