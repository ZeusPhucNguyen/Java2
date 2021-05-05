package Java2.Lap1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Class {

    public static void main(String[] args) {
        List<String> student = new ArrayList<>();

        student.add("Nguyen Ngoc Bao Phuc");
        student.add("Vu Ngoc Linh Chi");
        student.add("Mai Thi Lan Anh");
        student.add("Mai Thu Trang");
        student.add("Trinh Minh Khue");

        System.out.println("Danh sach hoc sinh cua lop NYC  :" + student);

        student.remove(1);

        System.out.println("Danh sach hoc sinh duoc cap nhat lai :" + student);


        System.out.println("\n Danh sach hoc sinh lop NYC :");
        ListIterator<String> studentsListIterator = student.listIterator(student.size());
        while (studentsListIterator.hasPrevious()) {
            String nyc = studentsListIterator.previous();
            System.out.println(nyc);
        }

        System.out.println("\nDanh sach hoc sinh cua lop: ");
        for (int i = 0; i < student.size(); i++){
            System.out.println(student.get(i));
        }
    }
}
