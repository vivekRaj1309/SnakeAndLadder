package org.example.models;

public abstract class SpecialEntity {
    Type type;

    public SpecialEntity(Type type) {
        this.type = type;
    }

    public Type getType() {
        return type;
    }

    public abstract int getStartPosition();
    public abstract int getEndPosition();

}
