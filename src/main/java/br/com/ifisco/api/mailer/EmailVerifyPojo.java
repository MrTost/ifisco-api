package br.com.ifisco.api.mailer;

import java.io.Serializable;
import java.util.Locale;
import java.util.UUID;

public class EmailVerifyPojo implements Serializable {

    private static final long serialVersionUID = -7726904289529809666L;

    private UUID id;
    private String name;
    private String email;
    private Locale locale;

    public EmailVerifyPojo() {
    }

    public EmailVerifyPojo(UUID id, String name, String email, Locale locale) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.locale = locale;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Locale getLocale() {
        return locale;
    }

    public void setLocale(Locale locale) {
        this.locale = locale;
    }
}
