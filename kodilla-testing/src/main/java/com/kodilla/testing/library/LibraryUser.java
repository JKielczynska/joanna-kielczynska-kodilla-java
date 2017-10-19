package com.kodilla.testing.library;

/**Class represents library user.*/
public class LibraryUser {
    private final String firstname;
    private final String lastname;
    private final String peselId;

    /**Constructor with user's first name, last name and pesel ID arguments.*/
    public LibraryUser(final String firstname, final String lastname, final String peselId) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.peselId = peselId;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getPeselId() {
        return peselId;
    }

    @Override
    public String toString() {
        return "LibraryUser{" + "firstname='" + firstname + '\'' + ", lastname='" + lastname + '\'' + ", peselId='" + peselId + '\'' + '}';
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final LibraryUser that = (LibraryUser) o;

        if (!firstname.equals(that.firstname)) {
            return false;
        }
        if (!lastname.equals(that.lastname)) {
            return false;
        }
        return peselId.equals(that.peselId);
    }

    @Override
    public int hashCode() {
        int result = firstname.hashCode();
        result = 31 * result + lastname.hashCode();
        result = 31 * result + peselId.hashCode();
        return result;
    }
}
