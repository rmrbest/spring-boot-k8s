package es.claranet.demo.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


/**
 * Created by raul on 12/06/17.
 */
@Entity
public class User {

    @Id
    @NotNull
    @Size(max = 64)
    @Column(name = "id", nullable = false, updatable = false)
    private String id;

    @NotNull
    @Size(max = 64)
    @Column(name = "surname", nullable = false)
    private String surname;

    private User() {
    }

    public User(final String id, final String surname) {
        this.id = id;
        this.surname = surname;
    }

    public String getId() {
        return id;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return this.getId() + " " + this.getSurname();
    }

}
