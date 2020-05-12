package org.me.learn_ssm.config;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(value="org.me.learn_ssm",excludeFilters = {  @ComponentScan.Filter(type= FilterType.ANNOTATION,classes ={Controller.class} )}  )
/*注解的扫描*/

/*2 excludeFilters 后面的是排除某某类*/

/*2.1 ANNOTATION大范围，所有注解了@Controller的类等*/
/*@ComponentScan(value="org.myStudy",excludeFilters = {  @ComponentScan.Filter(type= FilterType.ANNOTATION,classes ={Controller.class} )}  )*/

/*2.2 ASSIGNABLE_TYPE具体的类*/
/*@ComponentScan(value="org.myStudy",excludeFilters = {  @ComponentScan.Filter(type= FilterType.ASSIGNABLE_TYPE,classes ={StudentDao.class} )}  )*/

/*3 包含*/

/*3.1 includeFilters包含，需要后面改运用默认 false */
//@ComponentScan(value="org.myStudy",includeFilters = {@ComponentScan.Filter(type= FilterType.ANNOTATION,classes ={Controller.class})},useDefaultFilters = false)

/*3.2  自定义FilterType.CUSTOM 需要创建MyFilter继承FilterType，实现方法*/
//@ComponentScan(value="org.myStudy",includeFilters = {@ComponentScan.Filter(type= FilterType.CUSTOM,classes ={ MyFilter.class  })},useDefaultFilters = false)

//    三层架构以外的注册方法  1.@Bean   2.@Import({*.class}) 3.FactoryBean(工厂Bean)

//Import  id是全类名
//@Import({Apple.class,Banana.class})

//自定义ImportSelector接口的实现类，通过selectimports方法实现（方法的返回值 就是要纳入IoC容器的Bean） 。 并且 告知程序 自己编写的实现类。 @Import({Orange.class,MyImportSelector.class})
//@Import({Orange.class,MyImportSelector.class})

//编写ImportBeanDefinitionRegistrar接口的实现类，重写方法  不学了


public class myConfig {


}
