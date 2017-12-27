package cc.geoworks.wscs.demo;

import org.jxls.common.Context;
import org.jxls.demo.guide.Employee;
import org.jxls.util.JxlsHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Random;

public class Demo2 {
    private static Logger logger = LoggerFactory.getLogger(Demo2.class);

    public static void main(String[] args) throws ParseException, IOException {
        logger.info("Running demo2");
        List<Employee> employees = generateSampleEmployeeData();
        LinkedList<Employee> mds1 = getMds1(employees, 13, MdType.md1);
        LinkedList<Employee> mds2 = getMds1(employees, 13, MdType.md2);

        try (InputStream is = Demo2.class.getResourceAsStream("demo2_template.xls")) {
            try (OutputStream os = new FileOutputStream("target/demo2_output.xls")) {
                Context context = new Context();
                context.putVar("mds1", mds1);
                context.putVar("mds2", mds2);
                JxlsHelper.getInstance().processTemplate(is, os, context);
            }
        }
    }

    public static List<Employee> generateSampleEmployeeData() throws ParseException {
        LinkedList<Employee> employees = new LinkedList<>();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MMM-dd", Locale.US);

        Random random = new Random();

        for (int i = 1; i <= 100; i++) {
            Employee employee = new Employee(
                    String.valueOf(i),
                    dateFormat.parse("1970-Jul-10"),
                    random.nextInt(1000),
                    random.nextDouble());
            employees.add(employee);
        }

        return employees;
    }

    private enum MdType {
        md1, md2
    }

    private static LinkedList<Employee> getMds1(List<Employee> eList, int n, MdType mdType) {

        LinkedList<Employee> result = new LinkedList<>();

        if (n == 0 || eList.size() == 0) return null;

        int count = eList.size();

        int t = count % n == 0 ? count / n : count / n + 1;

        for (int i = mdType.ordinal(); i < t; i = i + 2) {
            if (i == t - 1) {
                result.addAll(eList.subList(i * n, eList.size()));
            } else {
                result.addAll(eList.subList(i * n, i * n + n));
            }
        }

        return result;
    }
}
