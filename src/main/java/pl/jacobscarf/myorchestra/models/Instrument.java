package pl.jacobscarf.myorchestra.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "INSTRUMENTS")
public class Instrument {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME", nullable = false, unique = true)
    private String name;

    @OneToMany(mappedBy = "instrument")
    private List<User> users;

    @OneToMany(mappedBy = "instrument")
    private List<MusicNote> musicNotes;
}
