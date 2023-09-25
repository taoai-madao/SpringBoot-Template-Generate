# SpringBoot初始化模版文件（快速搭建项目）

## 项目目录结构

1. **annotation**：自定义注解类

   ```Java
   - @Target(ElementType.METHOD) 注解表示该注解只能应用于方法上。
   - @Target 用于指定注解可以应用于哪些程序元素（如类、方法、字段等）
   - ElementType 是一个枚举类型，定义了 Java 中各种程序元素的类型（如类、方法、字段等）。
   - ElementType.METHOD 表示该注解只能应用于方法上。
       
   - @Retention(RetentionPolicy.RUNTIME) 注解表示该注解在运行时可见。
   - @Retention 用于指定注解的存储策略（即注解保留的时间和场景）
   - RetentionPolicy.RUNTIME 表示该注解在程序运行时仍然保留，可以通过反射机制读取注解信息
   - RetentionPolicy 是一个枚举类型，定义了 Java 中注解的保留策略（如 SOURCE、CLASS、RUNTIME）
   - RUNTIME 表示该注解在运行时仍然保留，可以通过反射机制读取注解信息。
   ```

   

2. **aop**：面相切面编程

3. **config**：程序配置类

4. **controller**：HTTP请求和响应的控制器

5. **exception**：自定义异常类

6. **job**：任务相关类

7. **manager**：业务逻辑管理器类

8. **mapper**：数据访问层映射器接口

9. **service**：业务逻辑实现类

10. **utils**：辅助工具类