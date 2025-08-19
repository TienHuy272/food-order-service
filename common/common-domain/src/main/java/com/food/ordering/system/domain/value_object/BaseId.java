package com.food.ordering.system.domain.value_object;

import java.util.Objects;

public abstract class BaseId<T> {
    public T getValue() {
        return value;
    }

    private final T value;

    public BaseId(T value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        BaseId<?> baseId = (BaseId<?>) o;
        return Objects.equals(value, baseId.value);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(value);
    }
}
