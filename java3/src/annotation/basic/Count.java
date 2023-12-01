package annotation.basic;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention( RetentionPolicy.RUNTIME)
// interface에 @ 붙이면 어노테이션 생성됨
public @interface Count {	
	 int value() default 1;   // 값이 하나일때는   value  사용한다     어노테이션객체.value()
}

