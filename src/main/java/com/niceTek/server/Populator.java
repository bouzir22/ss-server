package com.niceTek.server;
import com.niceTek.server.model.RH.Parent;
import com.niceTek.server.model.RH.Student;
import com.niceTek.server.model.RH.Teacher;
import com.niceTek.server.model.Role;
import com.niceTek.server.model.Sys.*;
import com.niceTek.server.model.Sys.Class;
import com.niceTek.server.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Populator implements CommandLineRunner {

    @Autowired
    ActivityRepo activityRepo;
    @Autowired
    ClassRepo classRepo;
    @Autowired
    CourseRepo courseRepo;
    @Autowired
    MaterialRepo materialRepo;
    @Autowired
    ParentRepo parentRepo;
    @Autowired
    StudentRepo studentRepo;
    @Autowired
    TeacherRepo teacherRepo;
   @Autowired
   class_course_repo class_courseRepo;

    Populator(){}
    class_course asso = new class_course();

void init(){this.asso=new class_course();}

    @Override
    public void run(String... args) throws Exception {

    /**** testst ***/


Parent hamed= new Parent("imed","imed ","imed20","password", Role.PARENT);
Parent imed= new Parent("hamed","hamed","hamed50","password", Role.PARENT);
        System.out.println(hamed);


    Student amir = new Student("amir","amir","amir5","password",Role.STUDENT);
    Student imen = new Student("imen","imen","imen4","password",Role.STUDENT);
    Student med = new Student("med","med","imen4","password",Role.STUDENT);
        Teacher abir = new Teacher("abir","abir","abir25","password",Role.TEACHER);
        Teacher emna= new Teacher("emna","emna","emna35","password",Role.TEACHER);
        Teacher emina= new Teacher("emna","emina","emina45","password",Role.TEACHER);
        Teacher salma= new Teacher("salma","salma","salma28","password",Role.TEACHER);
            Class classA =new Class("classa","1");
            Class classB =new Class("classb","2");
        Course drawing=new Course("drawing");;
        Course coloring=new Course("coloring");;
        Course arabic=new Course("arabic");;
        Course art =new Course("art");

        Material fmat= new Material("mat1");
        Material smat = new Material("mat2");
        Material tmat = new Material("mat3");
        Activity activity1= new Activity("acty1");
        Activity activity2= new Activity("acty2");
        Activity activity3= new Activity("acty3");
/**asso object*/



/**DBInvoker****
parentRepo.save(hamed);parentRepo.save(imed);
amir.setParent(imed);imen.setParent(hamed);med.setParent(hamed);

studentRepo.save(amir);studentRepo.save(med); studentRepo.save(imen);
teacherRepo.save(emna);teacherRepo.save(emina);teacherRepo.save(abir);teacherRepo.save(salma);
List <Teacher>tempa =new ArrayList();tempa.add(abir);tempa.add(salma);
        List <Teacher>tempb =new ArrayList();tempa.add(abir);tempa.add(emna);
classA.setTeachers(tempa);classB.setTeachers(tempb);





        classRepo.save(classA);classRepo.save(classB);
        courseRepo.save(arabic);courseRepo.save(art);courseRepo.save(coloring);courseRepo.save(drawing);



        asso.setAClass(classA);asso.setCourse(coloring);class_courseRepo.save(asso);
        init();
        asso.setAClass(classA);asso.setCourse(drawing);class_courseRepo.save(asso);

        init();
        asso.setAClass(classB);asso.setCourse(arabic);class_courseRepo.save(asso);
        init();
        asso.setAClass(classB);asso.setCourse(art);class_courseRepo.save(asso);







        materialRepo.save(fmat);materialRepo.save(smat);materialRepo.save(tmat);
activityRepo.save(activity1);activityRepo.save(activity2);activityRepo.save(activity3);




 */






    }
}
