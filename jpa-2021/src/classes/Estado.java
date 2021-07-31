package classes;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Estado {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;
    
    @Column(nullable=false)
    private String nome;
    
    @Column(nullable=false)
    private String sigla;
    
    @OneToMany(mappedBy = "estado", cascade=CascadeType.ALL,orphanRemoval=true)
    
    private List<Aluno> alunos = new ArrayList<>();
    
    public Estado(){}
    
    public Estado(String nome, String sigla){
        this.nome = nome;
        this.sigla = sigla;
    }
    
    
    
}
