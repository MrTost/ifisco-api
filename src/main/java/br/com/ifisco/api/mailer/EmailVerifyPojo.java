package br.com.ifisco.api.mailer;

import java.io.Serializable;
import java.util.Locale;

public class EmailVerifyPojo implements Serializable {

    private String name;
    private String email;
    private Locale locale;

    public EmailVerifyPojo() {
    }

    public EmailVerifyPojo(String name, String email, Locale locale) {
        this.name = name;
        this.email = email;
        this.locale = locale;
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
