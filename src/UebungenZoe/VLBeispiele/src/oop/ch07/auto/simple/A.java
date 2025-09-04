package oop.ch07.auto.simple;

class A extends State {
    private final Upper upper = new Upper(this);
    private final Lower lower = new Lower(this);

    A(State parent) {
        super(parent);
    }

    @Override
    void entry() {
        upper.entry();
        lower.entry();
    }

    @Override
    void a() {
        upper.a();
        lower.a();
    }

    @Override
    void b() {
        upper.b();
        lower.b();
    }

    @Override
    void c() {
        upper.c();
        lower.c();
    }

    @Override
    void d() {
        System.out.println("A->F");
        parent.gotoState(new F(parent));
    }
}
