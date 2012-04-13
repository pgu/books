package com.pgu.books.client.ui.books.filters;

public class Letter {

    private String label;
    private String letter;

    private boolean hasBeenFetched = false;

    public Letter() {
    }

    public Letter label(final String label) {
        setLabel(label);
        setLetter(label.substring(0, 1));
        return this;
    }

    public void setLabel(final String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(final String letter) {
        this.letter = letter;
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
        result = prime * result + (label == null ? 0 : label.hashCode());
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
        if (label == null) {
            if (other.label != null) {
                return false;
            }
        } else if (!label.equals(other.label)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Letter [label=" + label + ", letter=" + letter + ", hasBeenFetched=" + hasBeenFetched + "]";
    }

}
