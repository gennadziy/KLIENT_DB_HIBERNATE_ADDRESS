package gennadziy.model;

import javax.persistence.*;

@Entity
@Table(name = "klients")
public class Klient {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;
    @Column(name = "year")
    private int year;
    @Column(name = "plec")
    private String plec;
    @Column(name = "blocked")
    private boolean blocked;

    public int getId () {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getYear () {
        return year;
    }

    public void setYear ( int year ) {
        this.year = year;
    }

    public String getPlec () {
        return plec;
    }

    public void setPlec ( String plec ) {
        this.plec = plec;
    }

    public boolean isBlocked () {
        return blocked;
    }

    public void setBlocked ( boolean blocked ) {
        this.blocked = blocked;
    }

    @Override
    public String toString () {
        return "Klient{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", plec='" + plec + '\'' +
                ", blocked=" + blocked +
                '}';
    }
}
