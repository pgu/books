package com.pgu.books.client.ui.books.filters;

public class Letter {

    private final String value;
    private boolean      hasBeenFetched = false;

    public Letter(final String value) {
        this.value = value;
    }

    public boolean hasBeenFetched() {
        return hasBeenFetched;
    }

    public void setHasBeenFetched(final boolean hasBeenFetched) {
        this.hasBeenFetched = hasBeenFetched;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (value == null ? 0 : value.hashCode());
        return result;
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Letter other = (Letter) obj;
        if (value == null) {
            if (other.value != null) {
                return false;
            }
        } else if (!value.equals(other.value)) {
            return false;
        }
        return true;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Letter [value=" + value + ", hasBeenFetched=" + hasBeenFetched + "]";
    }

}
