package pl.jacobscarf.myorchestra.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "REHEARSALS")
public class Rehearsal {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "PLACE", nullable = false)
  private String place;

  @Column(name = "DATETIME", nullable = false)
  private Date datetime;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "PROJECT_ID", nullable = false, referencedColumnName = "ID")
  private Project project;
}
