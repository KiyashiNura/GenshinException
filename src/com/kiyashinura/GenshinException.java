package com.kiyashinura;

public class GenshinException extends Exception{
    public GenshinException() {
        super();
    }

    public GenshinException(String message) {
        super(message);
    }

    public GenshinException(String message, Throwable cause) {
        super(message, cause);
    }

    public GenshinException(Throwable cause) {
        super(cause);
    }

    protected GenshinException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
