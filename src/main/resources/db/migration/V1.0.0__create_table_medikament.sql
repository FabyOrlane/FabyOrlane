CREATE TABLE medikament (
    id_medikament serial PRIMARY KEY,
    name varchar (100) NOT NULL,
    wirkstoff varchar (200) NOT NULL,
    hersteller varchar (200) NOT NULL,
    pharmazentralnummer varchar (100) NOT NULL,
    artikelanzahl integer NOT NULL
);