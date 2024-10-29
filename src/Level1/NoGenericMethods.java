package Level1;

public class NoGenericMethods {
    private Object a, b, c;

    public NoGenericMethods(Object a, Object b, Object c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Object getA() {
        return a;
    }

    public void setA(Object a) {
        this.a = a;
    }

    public Object getB() {
        return b;
    }

    public void setB(Object b) {
        this.b = b;
    }

    public Object getC() {
        return c;
    }

    public void setC(Object c) {
        this.c = c;
    }
}
