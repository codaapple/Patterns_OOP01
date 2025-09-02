package patterns.VisitorPatternZoe;

public interface Expr {
    <T> T accept(Visitor<T> visitor);
}
