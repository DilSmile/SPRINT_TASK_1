package kz.bitlab.techorda2025.secondProject.db;

import java.util.*;

public class DBManager {
   private static Long id=8L;
    static List<Student> studentList = new ArrayList<>();
    static Map<Integer,String> cities = new HashMap<>();

   static{
       Student st= Student.builder().id(1L).name("Ilyas").surname("Zhubanysh").city("Astana").exam(34).build();
       st.setMark(setMarkAuto(st.getExam()));
       Student st2= Student.builder()
               .id(2L)
               .name("Danyiar")
               .surname("Ahmet")
               .city("Berlin")
               .exam(45)
               .build();
       st2.setMark(setMarkAuto(st2.getExam()));
       Student st3= Student.builder()
               .id(3L)
               .name("Madina")
               .surname("Maksat")
               .city("London")
               .exam(80)
               .build();
       st3.setMark(setMarkAuto(st3.getExam()));
       Student st4= Student.builder()
               .id(4L)
               .name("Askar")
               .surname("Aidyn")
               .city("Astana")
               .exam(94)
               .build();
       st4.setMark(setMarkAuto(st4.getExam()));
       Student st5= Student.builder()
               .id(5L)
               .name("Olzhas")
               .surname("Ongar")
               .city("Almaty")
               .exam(74)
               .build();
       st5.setMark(setMarkAuto(st5.getExam()));
       Student st6= Student.builder()
               .id(6L)
               .name("Arna")
               .surname("Kasym")
               .city("Oral")
               .exam(55)
               .build();
       st6.setMark(setMarkAuto(st6.getExam()));
       Student st7= Student.builder()
               .id(7L)
               .name("Aru")
               .surname("Arman")
               .city("Aktobe")
               .exam(60)
               .build();
       st7.setMark(setMarkAuto(st7.getExam()));

       Collections.addAll(studentList,st,st2,st3,st4,st5,st6,st7);
//       studentList.add("1L","")

//       studentList.add(st);
//       studentList.add(new Student(2L,"Zhansaya","Batyrbek",323,setMarkAuto(st.getExam())));
   }

   static{
       cities.put(1,"Almaty");
       cities.put(2,"Astana");
       cities.put(3,"Oral");
       cities.put(4,"Aktau");
       cities.put(5,"Almaty");
       cities.put(6,"Almaty");
   }
    public static  String setMarkAuto(int exam) {
        if(exam<=100 && exam>89){
            return "A";
        }else if(exam<90 && exam>79){
            return "B";
        }else if(exam<80 && exam>69){
            return "C";
        }
        else if(exam<70 && exam>59){
            return "D";
        }
        else if(exam<60 && exam>49){
            return "E";
        }else if(exam<50 && exam>0){
            return "F";
        }else{
            return "WRONG VALUE";
        }
    }

//    private static  Student setMarkObj(Student st) {
//       int exam = st.getExam();
//        if(exam<=100 && exam>89){
//            st.setMark( "A");
//            return st;
//        }else if(exam<90 && exam>79){
//            return "B";
//        }else if(exam<80 && exam>69){
//            return "C";
//        }
//        else if(exam<70 && exam>59){
//            return "D";
//        }
//        else if(exam<60 && exam>49){
//            return "E";
//        }else if(exam<50 && exam>0){
//            return "F";
//        }else{
//            return "WRONG VALUE";
//        }
//    }


    public static List<Student> getStudentList() {
        return studentList;
    }

    public static Map<Integer,String>getCities(){
       return cities;
    }

    public static void addStudent(Student student){
       student.setId(id);
       studentList.add(student);
       id++;
    }


}
