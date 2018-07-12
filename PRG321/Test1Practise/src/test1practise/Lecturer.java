/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1practise;

/**
 *
 * @author Drikus
 */
public class Lecturer extends Person{
    
    protected String title, subject;

    public Lecturer(String title, String subject, String name, String surname, int id, int age) {
        super(name, surname, id, age);
        this.title = title;
        this.subject = subject;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Lecturer{" + "title=" + title + ", subject=" + subject + '}';
    }
    
    public Lecturer(String name, String surname, int id, int age) {
        super(name, surname, id, age);
    }
    
}
