package cn.happy.Util;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import sun.security.tools.policytool.Resources;

import java.io.IOException;
import java.io.InputStream;

public class MybatisUtil {
    static String resouce="mybatis-cofing.xml";
    static InputStream is;
    static SqlSessionFactory factory;
    static{

        try {
            is= org.apache.ibatis.io.Resources.getResourceAsStream(resouce);
            factory= new SqlSessionFactoryBuilder().build(is);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static SqlSession getSession(){
        return factory.openSession(true);
    }


}
