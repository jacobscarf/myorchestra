package pl.jacobscarf.myorchestra.models;

import lombok.Data;
import lombok.Getter;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "USERS")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "LOGIN", nullable = false, unique = true)
  private String login;

  @Column(name = "PASSWORD", nullable = false)
  private String password;

  @Column(name = "EMAIL", nullable = false, unique = true)
  private String email;

  @Column(name = "FIRST_NAME", nullable = false)
  private String name;

  @Column(name = "SURNAME", nullable = false)
  private String surname;

  @Column(name = "PHONE", nullable = false)
  private String phone;

  @Column(name = "ROLE", nullable = false)
  @Enumerated(EnumType.STRING)
  private Role role;

  @OneToMany(mappedBy = "user")
  private List<UserInProject> userInProjects;

  @ManyToOne(cascade = CascadeType.ALL)
  @JoinColumn(name = "INSTRUMENT_ID", nullable = false, referencedColumnName = "ID")
  private Instrument instrument;
}
