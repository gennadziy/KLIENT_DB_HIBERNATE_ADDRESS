package gennadziy.model;

public class Klient {
    private int id;
    private String name;
    private int year;
    private String plec;
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
    public String toString() {
        return id + " " + name + " " + year + " " + plec + " " + blocked;
    }
}
