package reto.bcp.user.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "item")
public class Item {

    private static final long serialVersionUID = 4467531611801172710L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, name = "TITLE")
    private String title;

    @ManyToOne
    private Review items;



}
