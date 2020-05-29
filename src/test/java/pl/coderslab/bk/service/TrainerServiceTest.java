package pl.coderslab.bk.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.coderslab.bk.entity.Trainer;
import pl.coderslab.bk.repository.TrainerRepository;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TrainerServiceTest {

    TrainerService trainerService;

    @Autowired
    TrainerRepository repository;

    @Before
    public void setUp(){
        this.trainerService = new TrainerService(repository);
    }
    @Test
    public void save() {
        Trainer trainer1= new Trainer();
        trainer1.setName("Mateusz");
        trainer1.setSurname("Dubak");
        trainerService.save(trainer1);
        Assert.assertNotNull(trainer1.getId());
    }

    @Test
    public void delete() {
    }

    @Test
    public void edit() {
    }

    @Test
    public void read() {
    }

    @Test
    public void findAll() {
    }
}