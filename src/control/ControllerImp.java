/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import model.Student;

/**
 *
 * @author ADMIN
 */
public class ControllerImp implements SHARED {

    @Override
    public List<Student> readDataFromFile(String fileName) {
        List<Student> students = new ArrayList<>();
        File file = new File(fileName);
        try {
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                String id = sc.nextLine();
                String name = sc.nextLine();
                int age = Integer.parseInt(sc.nextLine());
                double mark = Double.parseDouble(sc.nextLine());
                Student s = new Student(id, name, age, mark);
                students.add(s);
            }
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }

        return students;
    }

    @Override
    public boolean writeDataToFile(List<Student> students, String fileName) {
        return false;
    }

}
