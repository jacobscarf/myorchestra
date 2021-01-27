package pl.jacobscarf.myorchestra.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "PIECES")
public class Piece {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "AUTHOR", nullable = false)
  private String author;

  @Column(name = "NAME", nullable = false)
  private String name;

  @OneToMany(mappedBy = "piece")
  private List<MusicNote> musicNotes;
}
