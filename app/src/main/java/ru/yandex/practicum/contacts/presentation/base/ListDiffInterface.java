package ru.yandex.practicum.contacts.presentation.base;

public interface ListDiffInterface <T> {
    public boolean theSameAs(T userObject);

    public boolean equals(Object userObject);
}
