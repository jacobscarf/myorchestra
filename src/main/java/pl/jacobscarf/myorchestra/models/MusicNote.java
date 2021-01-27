package pl.jacobscarf.myorchestra.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "MUSIC_NOTES")
public class MusicNote {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "FILE_PATH", nullable = false)
  private String filepath;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "PIECE_ID", nullable = false, referencedColumnName = "ID")
  private Piece piece;
}
