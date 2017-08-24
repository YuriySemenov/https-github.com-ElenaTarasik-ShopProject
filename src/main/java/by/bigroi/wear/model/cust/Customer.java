package by.bigroi.wear.model.cust;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
@Table(name = "CUSTOMER")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CUST")
    private long id;

    @Column(name = "SURNAME", nullable = false)
    private String surname;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "EMAIL", nullable = false, unique = true)
    private String email;

    @Size(min = 5, max = 15)
    @Column(name = "PASSWORD", nullable = false)
    private String password;

    @Column(name = "PHONE", nullable = false, unique = true)
    private int phone;

/*    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "REG_DATE")
    private String regDate;

    @ManyToOne
    @JoinColumn(name = "ID_ROLE")
    private CustRole role;*/

    //////////////// GETTERS + SETTERS ///////////////////////////

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

  /*  public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRegData() {
        return regDate;
    }

    public void setRegData(String regData) {
        this.regDate = regData;
    }

    public CustRole getRole() {
        return role;
    }

    public void setRole(CustRole role) {
        this.role = role;
    }

    ///////////// EQUALS + HASHCODE + ToSTRING ///////////////////////

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Customer customer = (Customer) object;
        return id == customer.id &&
                phone == customer.phone &&
                Objects.equals(surname, customer.surname) &&
                Objects.equals(name, customer.name) &&
                Objects.equals(email, customer.email) &&
                Objects.equals(password, customer.password) &&
                Objects.equals(address, customer.address) &&
                Objects.equals(regDate, customer.regDate) &&
                Objects.equals(role, customer.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, surname, name, email, password, phone, address, regDate, role);
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", surname='" + surname + '\'' +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", regData='" + regDate + '\'' +
                ", role=" + role +
                '}';
    }*/
}
