package cc.geoworks.wscs.demo;

import cc.geoworks.wscs.entity.table.MdBase2;
import org.jxls.common.Context;
import org.jxls.util.JxlsHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demo1 {
    private static Logger logger = LoggerFactory.getLogger(Demo1.class);

    public static void main(String[] args) throws ParseException, IOException {
        logger.info("Running Object Collection demo");
        List<MdBase2> mds = generateSampleData();
        try (InputStream is = Demo1.class.getResourceAsStream("demo1_template.xls")) {
            try (OutputStream os = new FileOutputStream("target/demo1_output.xls")) {
                Context context = new Context();
                context.putVar("mds", mds);
                JxlsHelper.getInstance().processTemplate(is, os, context);
            }
        }
    }

    public static List<MdBase2> generateSampleData() throws ParseException {
        List<MdBase2> mds = new ArrayList<MdBase2>();
        Random random = new Random();

        for (int i = 1; i <= 12; i++) {
            int count = 34;
            MdBase2 mdBase2 = new MdBase2(34);
            for (int j = 1; j < count + 1; j++) {
                mdBase2.setData(j, String.valueOf(random.nextInt(100)));
            }
            mds.add(mdBase2);
        }

        return mds;
    }
}
