package pl.jacobscarf.myorchestra.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "PIECES_IN_PROJECT")
public class PieceInProject {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "PROJECT_ID", nullable = false)
  private Project project;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "PROJECT_ID", nullable = false)
  private Piece piece;
}
