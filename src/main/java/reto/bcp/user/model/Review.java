package reto.bcp.user.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "review")
public class Review {
  private static final long serialVersionUID = 4467531611801172710L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;


  @Column(nullable = false, name = "RATING")
  private Double rating;

}
