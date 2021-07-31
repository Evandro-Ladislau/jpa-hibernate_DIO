package part2DIO;

import classes.Aluno;
import classes.Estado;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ExecutionPart2 {
    public static void main(String[] args) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Digital");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        
        Estado estadoParaAdicionar = new Estado("Rio de Janeiro", "RJ");
        Aluno alunoParaAdicionar = new Aluno("Evandro", 30, estadoParaAdicionar);
        
        
        
        entityManager.getTransaction().begin();
        
        entityManager.persist(estadoParaAdicionar);
        entityManager.persist(alunoParaAdicionar);
        
        entityManager.getTransaction().commit();
        
        entityManager.close();
        entityManagerFactory.close();
    }
}
