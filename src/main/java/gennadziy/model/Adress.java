package gennadziy.model;

import javax.persistence.*;

@Entity
@Table(name = "adress")
public class Adress {


    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(name = "street")
    private String street;

    @Override
    public String toString () {
        return "Adress{" +
                "id='" + id + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                '}';
    }

    @Column(name = "number")
    private int number;

    public String getStreet () {
        return street;
    }

    public void setStreet ( String street ) {
        this.street = street;
    }

    public int getNumber () {
        return number;
    }

    public void setNumber ( int number ) {
        this.number = number;
    }

    @Id
    public String getId () {
        return id;
    }

    public void setId ( String id ) {
        this.id = id;
    }
}
