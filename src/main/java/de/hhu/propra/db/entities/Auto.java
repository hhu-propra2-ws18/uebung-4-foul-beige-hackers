package de.hhu.propra.db.entities;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Auto{

    @GeneratedValue
    @Id
    long ID;

    String marke;

    String farbe;

    int hubraum;
}
