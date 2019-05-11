package Task9Generics;

import org.omg.CORBA.INTERNAL;

public class ArifmeticalOperations<T> {
    private T item1;
    private T item2;

    public T getItem1() {
        return item1;
    }

    public void setItem1(T item1) {
        this.item1 = item1;
    }

    public T getItem2() {
        return item2;
    }

    public void setItem2(T item2) {
        this.item2 = item2;
    }

    public ArifmeticalOperations(T item1, T item2) {
        this.item1 = item1;
        this.item2 = item2;
    }

    public <T> Number multiply() {
        if (item1 instanceof Integer && item2 instanceof Integer) {
            return (Integer) item1 * (Integer) item2;
        }
        if (item1 instanceof Double && item2 instanceof Double) {
            return (Double) item1 * (Double) item2;
        }
        if (item1 instanceof Byte && item2 instanceof Byte) {
            return (Byte) item1 * (Byte) item2;
        }
        if (item1 instanceof Long && item2 instanceof Long) {
            return (Long) item1 * (Long) item2;
        }
        if (item1 instanceof Float && item2 instanceof Float) {
            return (Float) item1 * (Float) item2;
        }
        return 0;
    }

    public <T> Number divide() {
        if (item1 instanceof Integer && item2 instanceof Integer) {
            return (Integer) item1 / (Integer) item2;
        }
        if (item1 instanceof Double && item2 instanceof Double) {
            return (Double) item1 / (Double) item2;
        }
        if (item1 instanceof Byte && item2 instanceof Byte) {
            return (Byte) item1 / (Byte) item2;
        }
        if (item1 instanceof Long && item2 instanceof Long) {
            return (Long) item1 / (Long) item2;
        }
        if (item1 instanceof Float && item2 instanceof Float) {

            return (Float) item1 / (Float) item2;
        }
        return 0;
    }

    public <T> Number substract() {
        if (item1 instanceof Integer && item2 instanceof Integer) {
            return (Integer) item1 - (Integer) item2;
        }
        if (item1 instanceof Double && item2 instanceof Double) {
            return (Double) item1 - (Double) item2;
        }
        if (item1 instanceof Byte && item2 instanceof Byte) {
            return (Byte) item1 - (Byte) item2;
        }
        if (item1 instanceof Long && item2 instanceof Long) {
            return (Long) item1 - (Long) item2;
        }
        if (item1 instanceof Float && item2 instanceof Float) {
            return (Float) item1 - (Float) item2;
        }
        return 0;
    }

    public <T> Number summ() {
        if (item1 instanceof Integer && item2 instanceof Integer) {
            return(Integer) item1 + (Integer) item2;
        }
        if (item1 instanceof Double && item2 instanceof Double) {
            return(Double) item1 + (Double) item2;
        }
        if (item1 instanceof Byte && item2 instanceof Byte) {
            return(Byte) item1 + (Byte) item2;
        }
        if (item1 instanceof Long && item2 instanceof Long) {
            return(Long) item1 + (Long) item2;
        }
        if (item1 instanceof Float && item2 instanceof Float) {
            return(Float) item1 + (Float) item2;
        }
        return 0;
    }

}

