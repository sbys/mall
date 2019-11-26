package com.example.mall.tiny.mbg;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Generator {
    public static void main(String []args) throws IOException, XMLParserException, InvalidConfigurationException, SQLException, InterruptedException {
        List<String> warnigs=new ArrayList<>();
        boolean overwrite=true;
        InputStream is=Generator.class.getResourceAsStream("/generatorConfig.xml");
        ConfigurationParser configurationParser=new ConfigurationParser(warnigs);
        Configuration configuration=configurationParser.parseConfiguration(is);
        is.close();
        DefaultShellCallback callback=new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator=new MyBatisGenerator(configuration,callback,warnigs);
        myBatisGenerator.generate(null);
        for(String s:warnigs)
            System.out.println(s);

    }





















}
