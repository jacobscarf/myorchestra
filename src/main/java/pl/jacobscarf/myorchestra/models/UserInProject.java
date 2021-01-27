package pl.jacobscarf.myorchestra.models;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "USER_IN_PROJECT")
public class UserInProject {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "SALARY", nullable = false)
  private BigDecimal salary;

  @Column(name = "SECTION", nullable = false)
  @Enumerated(EnumType.STRING)
  private Section section;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "USER_ID", nullable = false, referencedColumnName = "ID")
  private User user;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "PROJECT_ID", nullable = false, referencedColumnName = "ID")
  private Project project;
}
