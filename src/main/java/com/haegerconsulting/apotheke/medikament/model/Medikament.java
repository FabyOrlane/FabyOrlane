package com.haegerconsulting.apotheke.medikament.model;

public class Medikament {

    private Long id;
    private String name;
    private String wirkstoff;
    private String hersteller;
    private String pharmazentralnummer;
    private Integer artikelanzahl;

    public Medikament() {
    }

    public Medikament(Long id,
                      String name,
                      String wirkstoff,
                      String hersteller,
                      String pharmazentralnummer,
                      Integer artikelanzahl) {
        this.id = id;
        this.name = name;
        this.wirkstoff = wirkstoff;
        this.hersteller = hersteller;
        this.pharmazentralnummer = pharmazentralnummer;
        this.artikelanzahl = artikelanzahl;
    }

    public Medikament(String name,
                      String wirkstoff,
                      String hersteller,
                      String pharmazentralnummer,
                      Integer artikelanzahl) {
        this.name = name;
        this.wirkstoff = wirkstoff;
        this.hersteller = hersteller;
        this.pharmazentralnummer = pharmazentralnummer;
        this.artikelanzahl = artikelanzahl;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWirkstoff() {
        return wirkstoff;
    }

    public void setWirkstoff(String wirkstoff) {
        this.wirkstoff = wirkstoff;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public String getPharmazentralnummer() {
        return pharmazentralnummer;
    }

    public void setPharmazentralnummer(String pharmazentralnummer) {
        this.pharmazentralnummer = pharmazentralnummer;
    }

    public Integer getArtikelanzahl() {
        return artikelanzahl;
    }

    public void setArtikelanzahl(Integer artikelanzahl) {
        this.artikelanzahl = artikelanzahl;
    }

    @Override
    public String toString() {
        return "Medikament{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", wirkstoff='" + wirkstoff + '\'' +
                ", hersteller='" + hersteller + '\'' +
                ", pharmazentralnummer='" + pharmazentralnummer + '\'' +
                ", artikelanzahl=" + artikelanzahl +
                '}';
    }
}
