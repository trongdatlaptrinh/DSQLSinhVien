/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.List;
import model.Student;

/**
 *
 * @author ADMIN
 */
public interface SHARED {
    List<Student> readDataFromFile(String fileName);
    boolean writeDataToFile(List<Student> students,String fileName);
}
