# Spring-in-7-days
DAY-1
Bean wiring by Name,Constructor,by type
Frist 3 example

DAY-2
Bean life cycle -Example4
1)InitializingBean
2)DisposableBean
3)ApplicationContextAware
4)BeanPostProcessor

Annotation
3 Types
a)beans.xml
b)@Configuration (Whithout bean.xml) Example 5
  @ComponentScan
  Example 5 with Lazy loading
  (Wtihout lazy tag it will load all bean (call constructor) every time. and we put Lazy tag then it will load
   only afte it's called.)
c)@Configuration (Whithout bean.xml) Example 6
  @Bean in config class

Two bean is matching then @Primary annotation is used Example 7
Two bean is mataching, @Autowired,@Qualifier annotation is used Example 8

DAY-3
SPEL (Spring expression Languange)
"#{}" expression from reference (Example 9)
for multiple config file and also with XML file
Example 10

AOP(Aspect Oriented Programming)

@Aspect Example 11
bean.xml
<!--this need to include xmlns:aop="http://www.springframework.org/schema/aop" -->
	<aop:aspectj-autoproxy />
config.java
@EnableAspectJAutoProxy

DAY- 4
Aspect with bean.xml file Example 12

MVC Exmaple13

DAY-5
MVC with different request form Example 14

MVC session Example 15

DAY -6
JDBC Exmaple 16 and Example 17

DAY-7
Transaction Handling Declarative and Programatic Emample 18 and SpringTransactionDao
Spring Internationalization exmple spring_internationalization
