package pl.coderslab.bk.entity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Presence {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean absence;


    @ManyToOne
    private Classes classes;

    @ManyToOne
    private Student student;


    public Classes getClasses() {
        return classes;
    }

    public void setClasses(Classes classes) {
        this.classes = classes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public boolean isAbsence() {
        return absence;
    }

    public void setAbsence(boolean absence) {
        this.absence = absence;
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }



}
