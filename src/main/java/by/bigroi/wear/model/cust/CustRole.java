package by.bigroi.wear.model.cust;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "CUST_ROLE")
public class CustRole {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_ROLE")
    private int id;

    @Column(name = "VALUE", nullable = false, unique = true)
    private String value;

/*
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "role")
    private List<Customer> customers = new ArrayList<>();
*/

    ///////////// GETTERS + SETTERS ////////////////////////////

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

 /*   public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    ///////////// EQUALS + HASHCODE + ToSTRING ///////////////////////

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CustRole custRole = (CustRole) object;
        return id == custRole.id &&
                Objects.equals(value, custRole.value) &&
                Objects.equals(customers, custRole.customers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, value, customers);
    }

    @Override
    public String toString() {
        return "CustRole{" +
                "id=" + id +
                ", value='" + value + '\'' +
                ", customers=" + customers +
                '}';
    }*/
}
