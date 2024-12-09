package com.chenniu.mybatisplus.utils;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.nio.file.Paths;
import java.util.Collections;

public class CodeGenerator {
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://localhost:3306/test", "root", "123456")
                .globalConfig(builder -> builder
                        .author("chenniu")
                        .outputDir(Paths.get(System.getProperty("user.dir")) + "/mybatis-plus/src/main/java")
                        .commentDate("yyyy-MM-dd")
                        .disableOpenDir()
                        .dateType(DateType.ONLY_DATE)
                )
                .packageConfig(builder -> builder
                        .parent("com.chenniu.mybatisplus")
                        .entity("entity")
                        .mapper("mapper")
                        .service("service")
                        .serviceImpl("service.impl")
                        .xml("mapper.xml")
                        .pathInfo(Collections.singletonMap(OutputFile.xml, Paths.get(System.getProperty("user.dir")) + "/mybatis-plus/src/main/resources/mapper"))
                )
                .strategyConfig(builder -> {
                    builder.addInclude("user") // 设置需要生成的表名
                            .entityBuilder()
                            .enableLombok() // 启用 Lombok
                            .enableFileOverride() // 文件覆盖
                            .addTableFills(new Column("crt_time", FieldFill.INSERT)) // 添加创建时间注解
                            .addTableFills(new Column("upd_time", FieldFill.UPDATE)) // 添加更新时间注解
                            .enableTableFieldAnnotation() // 启用字段注解
                            .controllerBuilder()
                            .enableRestStyle() // 启用 REST 风格
                            .mapperBuilder()
                            .enableBaseResultMap()
                            .enableBaseColumnList()
                            .mapperAnnotation(org.apache.ibatis.annotations.Mapper.class);
                })
                .templateEngine(new FreemarkerTemplateEngine())
                .execute();
    }
}
