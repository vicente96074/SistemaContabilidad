package com.softquark.siscontable.model;

import javax.persistence.*;

/**
 *
 * @author Augusto Vicente
 */
@Entity
@Table(name = "t_user")
public class User {

    public User() {
    }

    public User(long idUser, String nameUser, String lastNameUser, String emailUser) {
        this.idUser = idUser;
        this.nameUser = nameUser;
        this.lastNameUser = lastNameUser;
        this.emailUser = emailUser;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
    }

    public void setLastNameUser(String lastNameUser) {
        this.lastNameUser = lastNameUser;
    }

    public String getEmailUser() {
        return emailUser;
    }

    public void setEmailUser(String emailUser) {
        this.emailUser = emailUser;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idUser;

    @Column(name = "name_user", length = 200, nullable = false)
    private String nameUser;

    @Column(name = "lastname_user", length = 200, nullable = false)
    private String lastNameUser;

    @Column(name = "email_user", length = 200, nullable = false, unique = true)
    private String emailUser;

}
