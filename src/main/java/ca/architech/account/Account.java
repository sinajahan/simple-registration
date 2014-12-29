package ca.architech.account;

import javax.persistence.*;

import org.codehaus.jackson.annotate.JsonIgnore;

@SuppressWarnings("serial")
@Entity
@Table(name = "account")
@NamedQuery(name = Account.FIND_BY_USERNAME, query = "select a from Account a where a.username = :username")
public class Account implements java.io.Serializable {

    public static final String FIND_BY_USERNAME = "Account.findByUsername";

    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String username;

    @JsonIgnore
    private String password;

    protected Account() {

    }

    public Account(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
