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

  @Column(name = "SECTION", nullable = false)
  @Enumerated(EnumType.STRING)
  private Section section;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "PIECE_ID", nullable = false, referencedColumnName = "ID")
  private Piece piece;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "INSTRUMENT_ID", nullable = false, referencedColumnName = "ID")
  private Instrument instrument;
}
