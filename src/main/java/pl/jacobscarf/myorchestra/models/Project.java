package pl.jacobscarf.myorchestra.models;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "PROJECTS")
public class Project {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "NAME", nullable = false)
  private String name;

  @Column(name = "DESCRIPTION", nullable = true)
  private String description;

  @OneToMany(mappedBy = "project")
  private List<Rehearsal> rehearsals;

  @OneToMany(mappedBy = "project")
  private List<Concert> concerts;

  @OneToMany(mappedBy = "project")
  private List<UserInProject> usersInProject;

  @OneToMany(mappedBy = "project")
  private List<PieceInProject> piecesInProject;
}
