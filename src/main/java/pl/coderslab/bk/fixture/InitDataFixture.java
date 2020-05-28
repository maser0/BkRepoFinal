package pl.coderslab.bk.fixture;


import org.springframework.stereotype.Service;
import pl.coderslab.bk.entity.Group;
import pl.coderslab.bk.entity.Role;
import pl.coderslab.bk.entity.Student;
import pl.coderslab.bk.entity.User;
import pl.coderslab.bk.interfaces.RoleService;
import pl.coderslab.bk.interfaces.UserService;
import pl.coderslab.bk.service.GroupService;
import pl.coderslab.bk.service.StudentService;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class InitDataFixture {

    private final UserService userService;
    private final RoleService roleService;
    private final GroupService groupService;
    private final StudentService studentService;



    public InitDataFixture(UserService userService, RoleService roleService, GroupService groupService, StudentService studentService) {
        this.userService = userService;
        this.roleService = roleService;
        this.groupService = groupService;
        this.studentService = studentService;
    }

    public void initStudents(){
        Student student = new Student();
        student.setName("Zbychu");
        student.setSurname("Moro");
        studentService.save(student);
    }

    public void initGroup(){
        Student student = studentService.findOneByNameAndSurname("Zbychu", "Moro");
        Group group = new Group();
        group.setDayOfWeek("Ponieidzalek");
        group.setHour("17");
        List<Student> students = new ArrayList<>();
        students.add(student);
        group.setStudents(students);
        groupService.save(group);
    }

    public void initRoles() {
        Role roleAdmin = new Role();
        roleAdmin.setName("ROLE_ADMIN");
        roleService.save(roleAdmin);

        Role roleUser = new Role();
        roleUser.setName("ROLE_USER");
        roleService.save(roleUser);
    }

    public void initUsers() {

        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(roleService.findOneByName("ROLE_ADMIN"));

        User admin = new User();
        admin.setUsername("admin");
        admin.setPassword("admin");
        admin.setRoles(adminRoles);
        userService.saveUser(admin);

        Set<Role> userRoles = new HashSet<>();
        userRoles.add(roleService.findOneByName("ROLE_USER"));

        User user = new User();
        user.setUsername("user");
        user.setPassword("user");
        user.setRoles(userRoles);

        userService.saveUser(user);

        user.getRoles().forEach(e -> System.out.println(e.getName()));
    }
}
